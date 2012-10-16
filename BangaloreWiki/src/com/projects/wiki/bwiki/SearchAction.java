package com.projects.wiki.bwiki;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.RAMDirectory;
import org.apache.lucene.util.Version;
import org.apache.struts2.ServletActionContext;

import com.projects.wiki.bwiki.db.Place;
import com.projects.wiki.bwiki.util.BwikiTablesData;

public class SearchAction {
	private String searchFor;

	public String getSearchFor() {
		return searchFor;
	}

	public void setSearchFor(String searchFor) {
		this.searchFor = searchFor;
	}
	
	public String searchAll(){
		HttpServletRequest req = ServletActionContext.getRequest();
		try {
			String searchStr = req.getParameter("lucky");
			System.out.println("Search for "+searchStr+" ....");
			
			// lucene indexing
			  Analyzer analyzer = new StandardAnalyzer(Version.LUCENE_40);
				// store the index in memory
				Directory dir = new RAMDirectory();
				// to store index on disk use this
				// Directory dir = FSDirectory.open("/path");
				IndexWriterConfig config = new IndexWriterConfig(Version.LUCENE_40,
						analyzer);
				IndexWriter iwriter = new IndexWriter(dir, config);

				Document doc = null;
				List allPlaces = BwikiTablesData.getRecords("Place.hbm.xml");
				
				for (Object obj : allPlaces) {
					Place place = (Place) obj;
					doc = new Document();
					
					doc.add(new Field("site_id", ""+place.getNo(),
							TextField.TYPE_STORED));
					
					if (place.getPlace().equals(""))
						place.setPlace("NA");
					doc.add(new Field("site_name", place.getPlace(),
							TextField.TYPE_STORED));

					if (place.getType().equals(""))
						place.setType("NA");
					doc.add(new Field("site_type", place.getType(),
							TextField.TYPE_STORED));

					if (place.getDirection().equals(""))
						place.setDirection("NA");
					doc.add(new Field("site_direction", place.getDirection(),
							TextField.TYPE_STORED));
					 doc.add(new Field("site_remarks", place.getRemarks(),
					 TextField.TYPE_STORED));
					iwriter.addDocument(doc);
					
				}
				iwriter.close();

				// Now search the index:
				DirectoryReader dreader = DirectoryReader.open(dir);
				IndexSearcher isearcher = new IndexSearcher(dreader);
				MultiFieldQueryParser queryParser = new MultiFieldQueryParser(
						Version.LUCENE_40, new String[] { "site_id", "site_name", "site_type",
								"site_direction", "site_remarks" }, analyzer);

				org.apache.lucene.search.Query query = queryParser.parse(searchStr);
				ScoreDoc[] hits = isearcher.search(query, null, 1000).scoreDocs;

				System.out.println("Number of hits to the search string "
						+ searchStr + " are " + hits.length);
				// assertEquals(1, hits.length);
				// Iterate through the results:
				for (int i = 0; i < hits.length; i++) {
					Document hitDoc = isearcher.doc(hits[i].doc);
					System.out.println("This is the text to be indexed. "
							+ hitDoc.get("site_id"));
				}
				dreader.close();
				dir.close();

				System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}
}

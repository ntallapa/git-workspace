package com.projects.wiki.bwiki;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.projects.wiki.bwiki.db.Place;
import com.projects.wiki.bwiki.util.BwikiTablesData;

public class BWikiCatalog {
	private List sightsList;

	public List<Place> getSightsList() {
		System.out.println("its getting called...");
		return sightsList;
	}

	public void setSightsList(List sightsList) {
		this.sightsList = sightsList;
	}

	public String listSites(){
		
		HttpServletRequest req = ServletActionContext.getRequest();
		System.out.println("Its good...");
		
		sightsList = BwikiTablesData.getRecords("Place.hbm.xml");
		
		req.setAttribute("sites", sightsList);
		return "success";
	}
	
}

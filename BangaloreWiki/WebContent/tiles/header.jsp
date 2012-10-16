<script type="text/javascript">
	$(document).ready(function(){
		$("#search-submit").click(function(){
			var searchStr = $("#search").val();
			var params = {lucky: searchStr};
			alert(searchStr+"...");
			$("#content").load("bwiki/search-all", params);
		});
	});
</script>
<div class="header-section">
	<div class="bwiki-logo">Bangalore Wiki</div>
	<div class="bwiki-search">
		<form id="search-form">
			<input id="search" type="text" class="bwiki-input-search"/>
			<input id="search-submit" type="button" class="bwiki-search-submit"/>
		</form>
	</div>
</div>
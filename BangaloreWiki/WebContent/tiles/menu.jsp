<script type="text/javascript">
	$(document).ready(function(){
		$("#menu ul li").mouseover(function(){
			$(this).addClass("onmenuover");
		});
		$("#menu ul li").mouseout(function(){
			$(this).removeClass("onmenuover");
		});
		$("#menu ul li").click(function(){
			$("#menu ul li").removeClass("onmenu");
			$(this).addClass("onmenu");
			//alert("Item selected - "+$(this).attr("id"));
			$("#content").load("bwiki/"+$(this).attr("id"));
		});
	});
</script>
	<div id="menu">
		<ul>
			<li id="sites">Site Seeing</li>
			<li id="edu-institutions">Educational Institutions</li>
			<li id="movies">Movie</li>
			<li id="discos">Disco's</li>
			<li id="beauty-parlor">Beauty Palours</li>
			<li id="pubs">Pubs</li>
			<li id="pizza-joints">Pizza Joints</li>
			<li id="coffee-bars">Coffee Bars</li>
			<li id="pool-parlor">Pool Palours</li>
			<li id="fast-food">Fastfood</li>
			<li id="restaurants">Restuarants</li>
			<li id="bowling-alleys">Bowling Alley's</li>
			<li id="clubs">Clubs</li>
		</ul>
	</div>
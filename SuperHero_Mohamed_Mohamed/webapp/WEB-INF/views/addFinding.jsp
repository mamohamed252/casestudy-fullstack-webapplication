<%@include file="headCom.jsp"%>
  <script src="https://polyfill.io/v3/polyfill.min.js?features=default"></script>
  <style type="text/css">
    /* Always set the map height explicitly to define the size of the div
       * element that contains the map. */
    #map {
    display: block;
    margin-top:5%;
 	margin-left: auto;
  	margin-right: auto;
  	height: 50%;
  	width: 80%;
    }

    /* Optional: Makes the sample page fill the window. */
    html,
    body {
      height: 100%;
      margin: 0;
      padding: 0;
    }
  </style>
<title>View Map</title>
</head>

<body>
<%@include file="navBar.jsp"%>
	 <div class="container" style="padding-top:10%">
      <div class="row">
        <div class="col">
        </div>
        <div class="col-5" style="background-color:#d3d3d3; border-radius:25px;">
            <h1>Add To Map!</h1>
            <form action="addFindingSubmit" method="get" style="display:flex; flex-direction:column">
               <label for="start">Start date:</label>
               <input type="date" id="start" name="findingDate"
	      		value="2018-07-22"
	       		min="1700-01-01" max="3000-12-31">
	       		<label><br><br>
	       		
	       		<label><h3 style="color:black;">Select Hero</h3></label><br><br>
				<select class="form-control"
					name="heroID">
					<c:if test="${heroList.size()>0}">
					<c:forEach var="hero" items="${heroList}">
						<option value="${hero.heroID}">${hero.heroName}
						</option>
					</c:forEach>
					</c:if>
				</select><br><br>
				<label><h3 style="color:black;">Select Location</h3></label><br><br>
				<select class="form-control"
					name="locationID">
					<c:if test="${locationList.size()>0}">
					<c:forEach var="location" items="${locationList}">
						<option value="${location.locationID}">${location.locationName}
						</option>
					</c:forEach>
					</c:if>
				</select><br><br>
	       		<label><h3 style="color:black;">Select Organization</h3></label><br><br>
				<select class="form-control"
					name="orgID">
					<c:if test="${orgList.size()>0}">
					<c:forEach var="organization" items="${orgList}">
						<option value="${organization.orgID}">${organization.orgName}
						</option>
					</c:forEach>
					</c:if>
				</select><br><br>
				<input
					class="col-md-offset-2 col-md-2" type="submit" name="cancel"
					value="Cancel" style="width: 50%"><br> <input
					class="col-md-offset-2 col-md-2" type="submit" name="Add"
					value="Add" style="width: 50%">
            </form>
        </div>
        <div class="col">
        </div>
      </div>
    </div>
	  <div id="map"></div>
	    <script>
	    let map;
	
	    function initMap() {
	      //add map, the type of map
	      var map = new google.maps.Map(document.getElementById('map'), {
	        zoom: 6,
	        center: new google.maps.LatLng(37.7749295, -122.4194155),
	        mapTypeId: google.maps.MapTypeId.ROADMAP
	      });
	
	      //add locations
	      var locations = [
	        ['San Francisco: Power Outage', 37.7749295, -122.4194155, '/SuperHero_Mohamed_Mohamed/resources/dbHeroPictures/hero_22x40.png'],
	        ['Sausalito', 37.8590937, -122.4852507, '/SuperHero_Mohamed_Mohamed/resources/dbHeroPictures/hero_22x40.png'],
	        ['Sacramento', 38.5815719, -121.4943996, '/SuperHero_Mohamed_Mohamed/resources/dbHeroPictures/evil_22x40.png'],
	        ['Soledad', 36.424687, -121.3263187, '/SuperHero_Mohamed_Mohamed/resources/dbHeroPictures/evil_22x40.png'],
	        ['Shingletown', 40.4923784, -121.8891586, '/SuperHero_Mohamed_Mohamed/resources/dbHeroPictures/hero_22x40.png']
	      ];
	
	      //declare marker call it 'i'
	      var marker, i;
	
	      //declare infowindow
	      var infowindow = new google.maps.InfoWindow();
	
	      //add marker to each locations
	      for (i = 0; i < locations.length; i++) {
	        marker = new google.maps.Marker({
	          position: new google.maps.LatLng(locations[i][1], locations[i][2]),
	          map: map,
	          size: new google.maps.Size(20, 20),
	          scaledSize: new google.maps.Size(20, 20),
	          icon: locations[i][3]
	        });
	
	        //click function to marker, pops up infowindow
	        google.maps.event.addListener(marker, 'click', (function (marker, i) {
	          return function () {
	            infowindow.setContent(locations[i][0]);
	            infowindow.open(map, marker);
	          }
	        })(marker, i));
	      }
	    }
	    
	  </script>
	  <!-- Async script executes immediately and must be after any DOM elements used in callback. -->
	  <script
	    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDPkz9MFoKMu__W0ZeG7oPcwLtQJmsfNic&callback=initMap&libraries=&v=weekly"
	    async></script>
<%@include file="footer.jsp"%>
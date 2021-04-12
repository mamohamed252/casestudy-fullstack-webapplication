<%@include file="headCom.jsp"%>
<body>
	<%@include file="navBar.jsp"%>
	
	
		<div class="container" style="padding-top:10%">
		<main>
			<div id="myCarousel" class="carousel slide" data-ride="carousel">
				<ul class="carousel-indicators">
					<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					<li data-target="#myCarousel" data-slide-to="1"></li>
					<li data-target="#myCarousel" data-slide-to="2"></li>
				</ul>
	
				<div class="carousel-inner">
					<div class="carousel-item active">
						<div class="parent d-flex justify-content-center">
							<img src='<%=request.getContextPath()%>/resources/img/welcome.jpg'
								class="image1">
							<div class="carousel-caption">
							<p class="text-center">Welcome to SuperHero Finding 101</p>
								<p class="text-center">SuperHeroes and SuperVillains are all around us!</p>
								<p class="text-center">Keep track of your favorite heroes around the world!</p>
							
							</div>
						</div>
					</div>
					<div class="carousel-item">
						<div class="parent d-flex justify-content-center">
							<img src='<%=request.getContextPath()%>/resources/img/locationC.jpg'
								class="image2">
	
							<div class="carousel-caption">
								
								<p class="text-center">Want to view all Superheroes found on a map?</p><br>
								
									<a class="btn btn-lg btn-primary" href="addFinding" role="button">Dynamic Map</a>
									<a class="btn btn-lg btn-primary" href="addFindingStatic" role="button">Static Map</a>
								</p>
							</div>
						</div>
					</div>
					<div class="carousel-item">
						<div class="parent d-flex justify-content-center">
							<img src='<%=request.getContextPath()%>/resources/img/mission.jpg'
								class="image3">
							<div class="carousel-caption">
								<p>Contribute to SuperHero Finding 101 </p>
								<p>
								<a class="btn btn-lg btn-primary" href="addLocation" role="button">Add Location</a>
								<a class="btn btn-lg btn-primary" href="addOrg" role="button">Add Organization</a>
								<a class="btn btn-lg btn-primary" href="addHero" role="button">Add Hero</a>
								
								</p>
							</div>
						</div>
					</div>
				</div>
				<a class="carousel-control-prev" href="#myCarousel" role="button"
					data-slide="prev"> <span class="carousel-control-prev-icon"
					aria-hidden="true"></span> <span class="sr-only">Previous</span>
				</a> <a class="carousel-control-next" href="#myCarousel" role="button"
					data-slide="next"> <span class="carousel-control-next-icon"
					aria-hidden="true"></span> <span class="sr-only">Next</span>
				</a>
			</div>
		</main>
		
		</div>
		
<%@include file="footer.jsp"%>
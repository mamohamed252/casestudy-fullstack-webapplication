<%@include file="headCom.jsp"%>
<body>
	<%@include file="navBar.jsp"%>
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
								<h1 style="color: crimson;">Add Location.</h1>
								<p>Cras justo odio, dapibus ac facilisis in, egestas eget
									quam.</p>
								<p>
								<p></p>
								Donec id elit non mi porta gravida at eget metus.
								</p>
								<p>Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
								<p>
									<a class="btn btn-lg btn-primary" href="#" role="button">Learn
										more</a>
								</p>
							</div>
						</div>
					</div>
					<div class="carousel-item">
						<div class="parent d-flex justify-content-center">
							<img src='<%=request.getContextPath()%>/resources/img/locationC.jpg'
								class="image2">
	
							<div class="carousel-caption">
								<h1 style="color: crimson;">Another example headline.</h1>
								<p>Cras justo odio, dapibus ac facilisis in, egestas eget
									quam.</p>
								<p>
								<p></p>
								Donec id elit non mi porta gravida at eget metus.
								</p>
								<p>Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
								<p>
									<a class="btn btn-lg btn-primary" href="#" role="button">Learn
										more</a>
								</p>
							</div>
						</div>
					</div>
					<div class="carousel-item">
						<div class="parent d-flex justify-content-center">
							<img src='<%=request.getContextPath()%>/resources/img/mission.jpg'
								class="image3">
							<div class="carousel-caption">
								<h1 style="color: crimson;">Another example headline.</h1>
								<p>Cras justo odio, dapibus ac facilisis in, egestas eget
									quam.</p>
								<p>
								<p></p>
								Donec id elit non mi porta gravida at eget metus.
								</p>
								<p>Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
								<p>
									<a class="btn btn-lg btn-primary" href="#" role="button">Learn
										more</a>
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
<%@include file="footer.jsp"%>
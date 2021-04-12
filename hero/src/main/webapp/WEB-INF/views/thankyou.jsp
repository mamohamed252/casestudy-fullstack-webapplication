<%@include file="headCom.jsp"%>
<body>
	<header>
		<nav class="navbar navbar-expand-lg navbar-dark fixed-top  bg-dark">
			<a class="navbar-brand" href="index">Superhero Finder 101</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNav" aria-controls="navbarNav"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item"><a class="nav-link" href="index">Home</a>
					</li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> Select </a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							<a class="dropdown-item" href="login">Sign Up</a> 
						</div>
				</ul>
			</div>
		</nav>
	</header>
	<main role="main">


		<div class="container" style="padding-top: 15%">
			<div class="row">
				<div class="col"></div>
				<div class="col-md-auto"
					style="background: linear-gradient(to right, rgba(185, 48, 24, 0.74), rgb(22, 116, 170);">

					<img src="https://media.giphy.com/media/l3vR4yk0X20KimqJ2/giphy.gif"
						alt="https://media.giphy.com/media/l3vR4yk0X20KimqJ2/giphy.gif">
					<br>

				</div>
				<div class="col"></div>
			</div>
		</div>
<%@include file="footer.jsp"%>
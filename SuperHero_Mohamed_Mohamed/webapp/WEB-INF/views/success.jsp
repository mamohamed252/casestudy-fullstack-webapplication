<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<!-- Bootstrap links-->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
	integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
	crossorigin="anonymous"></script>

<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/style.css" />
</head>
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
							<a class="dropdown-item" href="finding">Findings</a> <a
								class="dropdown-item" href="addLocation"> Add Location</a> <a
								class="dropdown-item" href="addOrg">Add Organization</a> <a
								class="dropdown-item" href="addHero">Add Heroes</a>
						</div>
				</ul>
			</div>
		</nav>
	</header>
	<main role="main">


		<div class="container" style="padding-top: 5%">
			<div class="row">
				<div class="col"></div>
				<div class="col-6"
					style="background: linear-gradient(to right, rgba(185, 48, 24, 0.74), rgb(22, 116, 170);">

					<img src="https://media.giphy.com/media/xsMJyTdf4BQKk/source.gif"
						alt="https://media.giphy.com/media/l0Iyl55kTeh71nTXy/source.gif">
					<br>

				</div>
				<div class="col"></div>
			</div>
		</div>
</body>

</body>
</html>
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

		<div class="col-md-auto">
			<div class="text-center">
				<img src='/SuperHero_Mohamed_Mohamed/resources/img/addHeroV.jpeg'
					class="featurette-image img-fluid mx-auto" alt="resonsive image"
					width="650px" height="500px" style="padding-top: 5%">
			</div>
			<div class="container" style="padding-top: 5%">
				<div class="row">
					<div class="col"></div>
					<div class="col-6"
						style="background: linear-gradient(to right, rgba(185, 48, 24, 0.74), rgb(22, 116, 170);">

						<h1>Edit Superhero or Villan</h1>
						<form action="editHero" method="post"
							style="display: flex; flex-direction: column">
							<label for="sel1">Hero/Villain ID:</label> <select
								class="form-control" name=heroID>
								<c:forEach var="hero" items="${heroList}">
									<option value="${heroList.heroID}">${heroList.heroID}
									</option>
								</c:forEach>
							</select><br> Hero or Villain: <input type="text" class="form-control"
								name=heroStatus placeholder="Name" required /><br> Name: <input
								type="text" class="form-control" name=heroName
								placeholder="Name" required /><br> <label for="sel1">Organization
								ID:</label> <select class="form-control" name=orgID>
								<c:forEach var="organization" items="${orgListBean}">
									<option value="${organization.orgID}">${organization.orgID}
									</option>
								</c:forEach>
							</select><br> Superpower: <input type="text" class="form-control"
								name=superPower placeholder="Superpower" /><br>
							Descriptions: <input type="tel" class="form-control"
								name=heroDescription placeholder="Descriptions" /><br> <input
								class="col-md-offset-2 col-md-2" type="submit" name="cancel"
								value="Cancel" style="width: 50%"><br> <input
								class="col-md-offset-2 col-md-2" type="submit" name="create"
								value="Create" style="width: 50%">

							<table id="contactTable" class="table table-hover">
								<tr>
									<th width="20%">Hero or Villain</th>
									<th width="20%">Hero Name</th>
									<th width="20%">Org ID:</th>
									<th width="20%">Superpower</th>
									<th width="20%">Descriptions</th>
									<th width="20%">
										<h4>
											<a href="editHero">Edit/Delete</a>
									</th>
								</tr>
								<tbody id="addHeroRows">
									<c:forEach var="i" begin="0" end="${heroList.size() - 1}">
										<tr>
											<td width="20%"><c:out
													value="${heroList.get(i).getHeroStatus()}"></c:out></td>
											<td width="20%"><c:out
													value="${heroList.get(i).getHeroName()}"></c:out></td>
											<td width="20%">Organization</td>
											<td width="20%"><c:out
													value="${heroList.get(i).getHeroStatus()}"></c:out></td>
											<td width="20%"><c:out
													value="${heroList.get(i).getSuperPower()}"></c:out></td>
											<td width="20%"><c:out
													value="${heroList.get(i).getHeroDescription()}"></c:out></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</form>
					</div>
					<div class="col"></div>
				</div>
			</div>
</body>
</html>
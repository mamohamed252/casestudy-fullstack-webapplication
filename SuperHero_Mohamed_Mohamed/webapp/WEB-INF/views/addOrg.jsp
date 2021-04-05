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
			<a class="navbar-brand" href="index.html">Superhero Finder 101</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNav" aria-controls="navbarNav"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item"><a class="nav-link" href="index.html">Home</a>
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
	<div class="container" style="padding-top: 5%">
		<div class="row">
			<div class="col"></div>
			<div class="col-6"
				style="background: linear-gradient(to right, rgba(185, 48, 24, 0.74), rgb(22, 116, 170);">

				<h1>Add Organization</h1>
				<form action="addOrgSubmit" method="post"
					style="display: flex; flex-direction: column">
					Organization Name : <input type="text" class="form-control"
						name=orgName placeholder="Name" required /><br> Organization
					Description : <input type="text" class="form-control"
						name=orgDescription placeholder="Location Description" required /><br>
					<label for="sel1">Location ID:</label> <select class="form-control"
						name="locationID">
						<c:forEach var="location" items="${locationListBean }">
							<option value="${location.locationID}">${location.locationID}
							</option>
						</c:forEach>
					</select><br> <input class="col-md-offset-2 col-md-2" type="submit"
						name="cancel" value="Cancel" style="width: 50%"><br>
					<input class="col-md-offset-2 col-md-2" type="submit" name="create"
						value="Create" style="width: 50%">

					<table id="contactTable" class="table table-hover">
						<tr>
							<th width="20%">Organization ID</th>
							<th width="20%">Organization Name</th>
							<th width="20%">Description</th>
							<th width="20%">Location</th>
							<th width="20%">
								<h4>
									<a href="editOrg">Edit/Delete</a>
							</th>
						</tr>
						<tbody id="addLocationRows">
							<c:forEach var="i" begin="0" end="${orgList.size() - 1}">
								<tr>

									<td width="20%"><c:out
											value="${orgList.get(i).getOrgID()}"></c:out></td>
									<td width="20%"><c:out
											value="${orgList.get(i).getOrgName()}"></c:out></td>
									<td width="20%"><c:out
											value="${orgList.get(i).getOrgDescription()}"></c:out></td>
									<td width="20%"><c:out
											value="${orgList.get(i).getLocationID()}"></c:out></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</form>
			</div>
			<div class="col"></div>
</body>
</html>
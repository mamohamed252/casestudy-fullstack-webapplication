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
		<div class="col-md-auto"></div>
		<div class="col-md-auto">
			<div class="text-center">
				<img src='/SuperHero_Mohamed_Mohamed/resources/img/addHeroV.jpeg'
					class="featurette-image img-fluid mx-auto" alt="resonsive image"
					width="650px" height="500px">
			</div>
		</div>
		<div class="col-md-6">
			<!--style="display: none -->
			<form class="form-horizontal" role="form" id="add-new-form">
				<h2>Add New Superhero or Villan</h2>
				<div class="form-group">
					<label for="add-heroVillan-title" class="col-md-4 control-label">
						Hero or Villan: </label>
					<div class="col-md-8">
						<input type="text" class="form-control" id="add-heroVillan-title"
							placeholder="Name" required />
					</div>
				</div>
				<div class="form-group">
					<label for="add-orgs" class="col-md-4 control-label">
						Organizations: </label>

					<div class="col-md-8">
						<input type="text" class="form-control" id="add-orgs"
							placeholder="Organizations" required />
					</div>
				</div>
				<div class="form-group">
					<label for="add-superpower" class="col-md-4 control-label">
						Superpower:</label>

					<div class="col-md-8">
						<input type="text" class="form-control" id="add-director"
							placeholder="Superpower" />
					</div>
				</div>
				<div class="form-group">
					<label for="add-descriptions" class="col-md-4 control-label">
						Descriptions:</label>

					<div class="col-md-8">
						<input type="tel" class="form-control" id="add-descriptions"
							placeholder="Descriptions" />
					</div>
				</div>
				<div class="form-group">
					<div class="col-md-offset-2 col-md-2">
						<button type="button" id="add-cancel-button"
							class="btn btn-default">Cancel</button>
					</div>
					<div class="col-md-2">
						<button type="button" id="add-create-button"
							class="btn btn-default">Create</button>
					</div>
				</div>

				<div class="row">
					<table id="contactTable" class="table table-hover">
						<tr>
							<th width="20%">Hero or Villain</th>
							<th width="20%">Organizations</th>
							<th width="20%">Superpower</th>
							<th width="20%">Descriptions</th>
							<th width="20%"><h4>
									<a href="editHero">Edit/Delete</a></th>
						</tr>
						<tbody id="addHeroRows">
							<c:forEach var="i" begin="0" end="${heroList.size() - 1}">
								<tr>
									<td width="20%"><c:out
											value="${heroList.get(i).getHeroStatus()}"></c:out></td>
									<td width="20%">c:out
											value="${heroList.get(i).getOrgID().get(heroList.get(i).getOrgID().size()-1)}"></c:out></td>
									<td width="20%"><c:out
											value="${heroList.get(i).getSuperPower()}"></c:out></td>
									<td width="20%"><c:out
											value="${heroList.get(i).getHeroDescription()}"></c:out></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>



				</div>
			</form>
		</div>
</body>
</html>
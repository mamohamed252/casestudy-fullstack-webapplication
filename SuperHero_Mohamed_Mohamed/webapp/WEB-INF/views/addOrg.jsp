<%@include file="headCom.jsp"%>
<body>
	<%@include file="navBar.jsp"%>
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

						<h1>Add Organization</h1>
						<form:form action="addOrgSubmit" method="get"
							modelAttribute="organization"
							style="display: flex; flex-direction: column">

					Organization Name : 
					<form:input type="text" class="form-control" path="orgName"
								name="orgName" placeholder="Name" required="true" />
							<form:errors path="orgName" />
							<br>
					Organization Description : 
					<form:input type="text" class="form-control" path="orgDescription"
								name="orgDescription" placeholder="Location Description"
								required="true" />
							<br>
							<form:select path="location">
								<form:options name="location" items="${locationListBean}"
									itemValue="locationID" itemLabel="locationName" />
							</form:select>
							<br>
							<br>
							<input class="col-md-offset-2 col-md-2" type="submit"
								name="cancel" value="Cancel" style="width: 50%" />
							<br>
							<input class="col-md-offset-2 col-md-2" type="submit"
								name="create" value="Create" style="width: 50%" />
						</form:form>
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
								<c:if test="${!orgList.isEmpty()}">
								<c:forEach var="i" begin="0" end="${orgList.size() - 1}">
									<c:set var="decr" value="${orgList.size() - i - 1}" />

									<tr>

										<td width="20%"><c:out
												value="${orgList.get(decr).getOrgID()}"></c:out></td>
										<td width="20%"><c:out
												value="${orgList.get(decr).getOrgName()}"></c:out></td>
										<td width="20%"><c:out
												value="${orgList.get(decr).getOrgDescription()}"></c:out></td>
										<td width="20%"><c:out
												value="${orgList.get(decr).getLocation().getLocationName()}"></c:out></td>
									</tr>
								</c:forEach>
								</c:if>
							</tbody>
						</table>
					</div>
					<div class="col"></div>
					<%@include file="footer.jsp"%>
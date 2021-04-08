<%@include file="headCom.jsp"%>
<body>
	<%@include file="navBar.jsp"%>
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

					<h1>Add Location</h1>
					<form action="addLocationSubmit" method="post"
						style="display: flex; flex-direction: column">
						Location Name : <input type="text" class="form-control"
							name=locationName placeholder="Name" required /><br>
						Location Description : <input type="text" class="form-control"
							name=locationDescription placeholder="Location Description"
							required /><br> Street : <input type="tel"
							class="form-control" name=street placeholder="Street" required /><br>
						City : <input type="tel" class="form-control" name=city
							placeholder="City" required /><br> State : <input
							type="tel" class="form-control" name=state placeholder="State"
							required /><br> Zipcode : <input type="tel"
							class="form-control" name=zipcode placeholder="Zipcode" required /><br>
						Country : <input type="tel" class="form-control" name=country
							placeholder="Country" required /><br> Latitude : <input
							type="tel" class="form-control" name=locationLatitude
							placeholder="Latitude" required /><br> Longitude : <input
							type="tel" class="form-control" name=locationLongitude
							placeholder="Longitude" required /><br> <input
							class="col-md-offset-2 col-md-2" type="submit" name="cancel"
							value="Cancel" style="width: 50%"><br> <input
							class="col-md-offset-2 col-md-2" type="submit" name="create"
							value="Create" style="width: 50%">
						<c:if test="${locationList.size()>0}">
							<table id="contactTable" class="table table-hover">
								<tr>
									<th width="20%">Location ID</th>
									<th width="20%">Location</th>
									<th width="20%">Description</th>
									<th width="20%">Street</th>
									<th width="20%">City</th>
									<th width="20%">State</th>
									<th width="20%">Zipcode</th>
									<th width="20%">Country</th>
									<th width="20%">Latitude</th>
									<th width="20%">Longitude</th>
									<th width="20%">
										<h4>
											<a href="editLocation">Edit/Delete</a>
									</th>
								</tr>

								<tbody id="addLocationRows">
									<c:forEach var="i" begin="0" end="${locationList.size() - 1}">
										<tr>


											<td width="20%"><c:out
													value="${locationList.get(i).getLocationID()}"></c:out></td>

											<td width="20%"><c:out
													value="${locationList.get(i).getLocationName()}"></c:out></td>
											<td width="20%"><c:out
													value="${locationList.get(i).getLocationDescription()}"></c:out>
											</td>
											<td width="20%"><c:out
													value="${locationList.get(i).getStreet()}"></c:out></td>
											<td width="20%"><c:out
													value="${locationList.get(i).getCity()}"></c:out></td>
											<td width="20%"><c:out
													value="${locationList.get(i).getState()}"></c:out></td>
											<td width="20%"><c:out
													value="${locationList.get(i).getZipcode()}"></c:out></td>
											<td width="20%"><c:out
													value="${locationList.get(i).getCountry()}"></c:out></td>
											<td width="20%"><c:out
													value="${locationList.get(i).getLocationLatitude()}"></c:out></td>
											<td width="20%"><c:out
													value="${locationList.get(i).getLocationLongitude()}"></c:out></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</c:if>
					</form>
				</div>
				<div class="col"></div>
			</div>
		</div>
<%@include file="footer.jsp"%>
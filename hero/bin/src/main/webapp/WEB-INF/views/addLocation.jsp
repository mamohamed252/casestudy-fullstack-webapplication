<%@include file="headCom.jsp"%>
<body>
	<%@include file="navBar.jsp"%>
	<div class="col-md-auto">
		<div class="text-center">
			<img src='<%=request.getContextPath()%>/resources/img/addHeroV.jpeg'
				class="featurette-image img-fluid mx-auto" alt="resonsive image"
				width="650px" height="500px" style="padding-top: 5%">
		</div>
		<div class="container" style="padding-top: 5%">
			<div class="row">
				<div class="col-3"></div>
				<div class="col-6"
					style="background: linear-gradient(to right, rgba(185, 48, 24, 0.74), rgb(22, 116, 170);">

					<h1>Location</h1>
					<c:if test="${location==null}">
						<form action="addLocation" method="post"
							style="display: flex; flex-direction: column">
					</c:if>

					<c:if test="${location!=null}">
						<form action="editLocation" method="post"
							style="display: flex; flex-direction: column">
							<input name="locationID" type="hidden" value="${location.locationID}" />
					</c:if>
					Location Name : <input value="${location.locationName}" type="text"
						class="form-control" name=locationName placeholder="Name" required /><br>
					Location Description : <input
						value="${location.locationDescription}" type="text"
						class="form-control" name=locationDescription
						placeholder="Location Description" required /><br> Street :
					<input value="${location.street}" type="tel" class="form-control"
						name=street placeholder="Street" required /><br> City : <input
						value="${location.city}" type="tel" class="form-control" name=city
						placeholder="City" required /><br> State : <input
						value="${location.state}" type="tel" class="form-control"
						name=state placeholder="State" required /><br> Zipcode : <input
						value="${location.zipcode}" type="tel" class="form-control"
						name=zipcode placeholder="Zipcode" required /><br> Country :
					<input value="${location.country}" type="tel" class="form-control"
						name=country placeholder="Country" required /><br> Latitude
					: <input value="${location.locationLatitude}" type="tel"
						class="form-control" name=locationLatitude placeholder="Latitude"
						required /><br> Longitude : <input
						value="${location.locationLongitude}" type="tel"
						class="form-control" name=locationLongitude
						placeholder="Longitude" required /><br><a href="https://www.gps-coordinates.net/"><h1> Need Help Finding Coordinates? </h1></a><br> <input
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

							</tr>

							<tbody id="addLocationRows">
								<c:if test="${!locationList.isEmpty()}">
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
											<td><a style="color: black; text-decoration: none;"
												href="${request.getContextPath()}editLocation${locationList.get(i).getLocationID()}"><i
													class="fa fa-pencil"></i> Edit</a></td>
											<td><a style="color: black; text-decoration: none;"
												href="${request.getContextPath()}deleteLocation${locationList.get(i).getLocationID()}"><i
													class="fa fa-pencil"></i> Delete</a></td>
										</tr>
									</c:forEach>
								</c:if>
							</tbody>
						</table>
					</c:if>
					</form>
				</div>
			</div>
		</div>
		<%@include file="footer.jsp"%>
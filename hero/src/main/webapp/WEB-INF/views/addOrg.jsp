<%@include file="headCom.jsp"%>
<body>
	<%@include file="navBar.jsp"%>
	<main role="main">
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

						<h1>Organization</h1>
						<c:if test="${organization==null}">
							<form action="addOrg" method="post" modelAttribute="organization"
								style="display: flex; flex-direction: column">
						</c:if>

						<c:if test="${organization!=null}">
							<form action="editOrg" method="post"
								modelAttribute="organization"
								style="display: flex; flex-direction: column">
								<input name="orgID" type="hidden" value="${organization.orgID}" />
						</c:if>



						Organization Name : <input value="${organization.orgName}"
							type="text" class="form-control" name="orgName"
							placeholder="Name" required="true" /><br> Organization
						Description : <input value="${organization.orgDescription}"
							type="text" class="form-control"
							name="orgDescription" placeholder="Location Description"
							required="true" /> <br>

						<select value="${organization.locationID}" name="locationID">
							<c:forEach items="${locationList}" var="location">
								<option value="${location.locationID }">${location.locationName }
								</option>
							</c:forEach>
						</select> <br> <br> <input class="col-md-offset-2 col-md-2"
							type="submit" name="cancel" value="Cancel" style="width: 50%" />
						<br> <input class="col-md-offset-2 col-md-2" type="submit"
							name="create" value="Create" style="width: 50%" />
						</form>
						</form>
						<c:if test="${!orgList.isEmpty()}">
							<table id="contactTable" class="table table-hover">
								<tr>
									<th width="20%">Organization ID</th>
									<th width="20%">Organization Name</th>
									<th width="20%">Description</th>
									<th width="20%">Location</th>
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
												<td><a style="color: black; text-decoration: none;"
													href="${request.getContextPath()}editOrganization${orgList.get(decr).getOrgID()}"><i
														class="fa fa-pencil"></i> Edit</a></td>
												<td><a style="color: black; text-decoration: none;"
													href="${request.getContextPath()}deleteOrganization${orgList.get(decr).getOrgID()}"><i
														class="fa fa-pencil"></i> Delete</a></td>
											</tr>
										</c:forEach>
									</c:if>
								</tbody>
							</table>
						</c:if>
					</div>
					<%@include file="footer.jsp"%>
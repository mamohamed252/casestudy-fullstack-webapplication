<%@include file="headCom.jsp"%>
<body>
	<div class="container" style="padding-top: 10%">
		<div class="row">
			<div class="col-3"></div>
			<div class="col-5"
				style="background-color: #d3d3d3; border-radius: 25px;">
				<h1>Add Static Finding</h1>
				<c:if test="${finding==null}">
					<form action="addFindingStatic" method="post"
						style="display: flex; flex-direction: column">
				</c:if>
				<c:if test="${finding!=null}">
					<form action="editFindingStatic" method="post"
						style="display: flex; flex-direction: column">
						<input name="findingID" type="hidden" value="${finding.findingID}" />
				</c:if>

				<select value="${finding.heroName}" name="heroName">
					<c:forEach items="${heroList}" var="hero">
						<option value="${hero.heroName }">${hero.heroName }</option>
					</c:forEach>
				</select> <select value="${finding.locationName}" name="locationName">
					<c:forEach items="${locationList}" var="location">
						<option value="${location.locationName }">${location.locationName }
						</option>
					</c:forEach>
				</select> <select value="${finding.orgName}" name="orgName">
					<c:forEach items="${orgList}" var="organization">
						<option value="${organization.orgName }">${organization.orgName }
						</option>
					</c:forEach>
				</select> <label for="start">Start date:</label> <input type="date"
					max="3000-12-31" name="findingDate" value="${finding.findingDate }">

				<label> <input type="submit" style="width: 50%">
				</form>
			</div>
		</div>
	</div>
	<div>
		<c:if test="${FindingList.size()>0}">
			<table id="contactTable" class="table table-hover">
				<tr>
					<th width="20%">Hero Name</th>
					<th width="20%">Location</th>
					<th width="20%">Date:</th>
					<th width="20%">Organization Name:</th>
				</tr>

				<tbody id="addLocationRows">
					<c:if test="${!FindingList.isEmpty()}">
						<c:forEach var="i" begin="0" end="${FindingList.size() - 1}">
							<tr>
								<td width="20%"><c:out
										value="${FindingList.get(i).heroName}"></c:out></td>

								<td width="20%"><c:out
										value="${FindingList.get(i).locationName}"></c:out></td>
								<td width="20%"><c:out
										value="${FindingList.get(i).findingDate}"></c:out></td>
								<td width="20%"><c:out
										value="${FindingList.get(i).orgName}"></c:out></td>
								<td><a style="color: black; text-decoration: none;"
									href="${request.getContextPath()}editFindingStatic${FindingList.get(i).findingID}"><i
										class="fa fa-pencil"></i> Edit</a></td>
								<td><a style="color: black; text-decoration: none;"
									href="${request.getContextPath()}deleteFindingStatic${FindingList.get(i).findingID}"><i
										class="fa fa-pencil"></i> Delete</a></td>
							</tr>
						</c:forEach>
					</c:if>
				</tbody>
			</table>
		</c:if>
	</div>
	<%@include file="footer.jsp"%>
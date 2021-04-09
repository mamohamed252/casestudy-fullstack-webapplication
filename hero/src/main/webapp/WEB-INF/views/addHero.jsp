<%@include file="headCom.jsp"%>
<body>
	<%@include file="navBar.jsp"%>
	<main role="main">
		<div class="col-md-auto"></div>
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

					<h1>Add New Superhero or Villain</h1>
					<c:if test="${hero==null}">
						<form action="addHero" method="post"
							style="display: flex; flex-direction: column">
					</c:if>
					<c:if test="${hero!=null}">
						<form action="editHero" method="post"
							style="display: flex; flex-direction: column">
							<input name="heroID" type="hidden" value="${hero.heroID}" />
					</c:if>
					Hero or Villain: <input value="${hero.heroStatus}" type="text"
						class="form-control" name="heroStatus" placeholder="Name" required /><br>
					Picture: </label> <select class="form-control" name="picture">
						<option>Blue Hero Icon</option>
						<option>Red Villain Icon</option>
					</select><br>Name: <input value="${hero.heroName}" type="text"
						class="form-control" name="heroName" placeholder="Name" required /><br>
					<label for="sel1">Organization ID:</label> <select
						class="form-control" name="orgID">
						<c:forEach var="organization" items="${orgListBean}">
							<option value="${organization.orgID}">${organization.orgName}
							</option>
						</c:forEach>
					</select><br> Superpower: <input value="${hero.superPower}" type="text"
						class="form-control" name="superPower" placeholder="Superpower" /><br>
					Descriptions: <input value="${hero.heroDescription}" type="tel"
						class="form-control" name="heroDescription"
						placeholder="Descriptions" /><br> <input
						class="col-md-offset-2 col-md-2" type="submit" name="cancel"
						value="Cancel" style="width: 50%"><br> <input
						class="col-md-offset-2 col-md-2" type="submit" name="create"
						value="Create" style="width: 50%">
					<c:if test="${heroList.size()>0}">
						<table id="contactTable" class="table table-hover">
							<tr>
								<th width="20%">Hero or Villain:</th>
								<th width="20%">Hero Name:</th>
								<th width="20%">Icon:</th>
								<th width="20%">Org Name:</th>
								<th width="20%">Superpower:</th>
								<th width="20%">Descriptions:</th>
								<th width="20%"></th>
							</tr>
							<tbody id="addHeroRows">
								<c:if test="${!heroList.isEmpty()}">
									<c:forEach var="i" begin="0" end="${heroList.size() - 1}">

										<tr>
											<td width="20%"><c:out
													value="${heroList.get(i).getHeroStatus()}"></c:out></td>
											<td width="20%"><c:out
													value="${heroList.get(i).getHeroName()}"></c:out></td>
											<td width="20%"><c:out
													value="${heroList.get(i).getPicture()}"></c:out></td>
											<c:if
												test="${heroList.get(i).getOrganizations().isEmpty()==false }">
												<td width="20%"><c:out
													value="${heroList.get(i).getOrganizations().get(0).getOrgName()}"></c:out></td></c:if>
											<td width="20%"><c:out
													value="${heroList.get(i).getSuperPower()}"></c:out></td>
											<td width="20%"><c:out
													value="${heroList.get(i).getHeroDescription()}"></c:out></td>
											<td><a style="color: black; text-decoration: none;"
												href="${request.getContextPath()}editHero${heroList.get(i).getHeroID()}"><i
													class="fa fa-pencil"></i> Edit</a></td>
											<td><a style="color: black; text-decoration: none;"
												href="${request.getContextPath()}deleteHero${heroList.get(i).getHeroID()}"><i
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
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <!-- Bootstrap links-->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
    integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
    integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
    crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
    integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
    crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
    integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
    crossorigin="anonymous"></script>

<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/style.css"/>
</head>
<body>
  <header>
    <nav class="navbar navbar-expand-lg navbar-dark fixed-top  bg-dark">
      <a class="navbar-brand" href="index.html">Superhero Finder 101</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
        aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item">
            <a class="nav-link" href="index.html">Home</a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
              aria-haspopup="true" aria-expanded="false">
              Select
            </a>
           	<div class="dropdown-menu" aria-labelledby="navbarDropdown">
				<a class="dropdown-item" href="spotting">Findings</a> <a
					class="dropdown-item" href="addLocation"> Add Location</a> <a
					class="dropdown-item" href="addOrg">Add Organization</a> <a
					class="dropdown-item" href="addHero">Add Heroes</a>
				<!-- <div class="dropdown-divider"></div> -->

			</div>
        </ul>
      </div>
    </nav>
  </header>
  <div class="container">
    <div class="col-md-auto">
    </div>
    <div class="col-md-auto">
      <div class="text-center">
        <img src='/SuperHero_Mohamed_Mohamed/resources/img/addHeroV.jpeg' class="featurette-image img-fluid mx-auto" alt="resonsive image" width="650px"
          height="500px">
      </div>
    </div>
    <div class="col-md-6">
      <!--style="display: none -->
      <form class="form-horizontal" role="form" id="add-new-form">
        <h2>Add Orginzation Info</h2>
          <div class="form-group">
              <label for="add-OrgName-title" class="col-md-4 control-label">
                  Orginzation Name:
              </label>
              <div class="col-md-8">
                  <input type="text"
                         class="form-control"
                         id="add-OrgName-titlee"
                         placeholder="Orginzation Name" required/>
              </div>
          </div>
          <div class="form-group">
            <label for="add-descriptions-org" class="col-md-4 control-label">
              Description:</label>

            <div class="col-md-8">
                <input type="tel"
                      class="form-control"
                      id="add-descriptions-org"
                      placeholder="Description"/>
            </div>
          </div>
          <div class="form-group">
            <label for="add-location-org" class="col-md-4 control-label">
              Location:</label>
            <select name="Search location" required>
              <option value="">Location: </option>
              <option value="Location Name One">First location</option>
              <option value="Location Name One">Second location</option>
            </select>
          </div>
      </form>
  </div>
  <div class="row">
    <table id="contactTable" class="table table-hover">
                <tr>
                    <th width="20%">Orginzation Name</th>
                    <th width="20%">Description</th>
                    <th width="20%">Location</th>
                    <th width="20%"> <h4><a href="editLocation.html">Edit/Delete</a></h4></th>
                </tr>
               <tbody id="dvdRows"></tbody>
      </table>


      
    </div>
  </div>
</body>
</html>
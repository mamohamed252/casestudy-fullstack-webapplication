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
      <a class="navbar-brand" href="index">Superhero Finder 101</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
        aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item">
            <a class="nav-link" href="index">Home</a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
              aria-haspopup="true" aria-expanded="false">
              Select
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
              <a class="dropdown-item" href="spotting">Findings</a>
              <a class="dropdown-item" href="heroes">Heroes</a>
              <!-- <div class="dropdown-divider"></div> -->
              <a class="dropdown-item" href="orgs">Orgs</a>
              <a class="dropdown-item" href="location">Location</a>
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
        <img src='img/addHeroV.jpeg' class="featurette-image img-fluid mx-auto" alt="resonsive image" width="650px"
          height="500px">
      </div>
    </div>
    <div class="col-md-6">
      <!--style="display: none -->
      <form class="form-horizontal" role="form" id="add-new-form">
        <h2>Add Location</h2>
          <div class="form-group">
              <label for="add-locationName-title" class="col-md-4 control-label">
                  Location:
              </label>
              <div class="col-md-8">
                  <input type="text"
                         class="form-control"
                         id="add-locationName-titlee"
                         placeholder="Location Name" required/>
              </div>
          </div>
          <div class="form-group">
            <label for="add-descriptions-location" class="col-md-4 control-label">
              Description:</label>

            <div class="col-md-8">
                <input type="tel"
                      class="form-control"
                      id="add-descriptions-location"
                      placeholder="Description"/>
            </div>
          </div>
          <div class="form-group">
              <label for="add-street" class="col-md-4 control-label">
                Street:
              </label>

              <div class="col-md-8">
                  <input type="text"
                         class="form-control"
                         id="add-street"
                         placeholder="Address" required/>
              </div>
          </div>
          <div class="form-group">
            <label for="add-city" class="col-md-4 control-label">
              City:
            </label>

            <div class="col-md-8">
                <input type="text"
                       class="form-control"
                       id="add-city"
                       placeholder="City" required/>
            </div>
            <div class="form-group">
              <label for="add-state" class="col-md-4 control-label">
                State:
              </label>
  
              <div class="col-md-8">
                  <input type="text"
                         class="form-control"
                         id="add-state"
                         placeholder="State" required/>
              </div>
          </div>

          <div class="form-group">
            <label for="add-zipcode" class="col-md-4 control-label">
              Zip code:
            </label>

            <div class="col-md-8">
                <input type="text"
                       class="form-control"
                       id="add-zipcode"
                       placeholder="Zip code" required/>
            </div>
          </div>

          <div class="form-group">
            <label for="add-country" class="col-md-4 control-label">
              Country:
            </label>

            <div class="col-md-8">
                <input type="text"
                      class="form-control"
                      id="add-country"
                      placeholder="Country" required/>
            </div>
          </div>
          <div class="form-group">
            <label for="add-latitude" class="col-md-4 control-label">
              Latitude:
            </label>

            <div class="col-md-8">
                <input type="text"
                      class="form-control"
                      id="add-latitude"
                      placeholder="Latitude" required/>
            </div>
          </div>
          <div class="form-group">
            <label for="add-longitude" class="col-md-4 control-label">
              Longitude:
            </label>

            <div class="col-md-8">
                <input type="text"
                      class="form-control"
                      id="add-longitude"
                      placeholder="Longitude" required/>
            </div>
          </div>
          <div class="form-group">
              <div class="col-md-offset-2 col-md-2">
                  <button type="button"
                          id="add-cancel-button"
                          class="btn btn-default">
                      Cancel
                  </button>
              </div>
              <div class="col-md-2">
                <button type="button"
                    id="add-create-button"
                    class="btn btn-default">
                    Create 
                </button>
              </div>
          </div>
      </form>
  </div>
  <div class="row">
    <table id="contactTable" class="table table-hover">
                <tr>
                    <th width="20%">Location</th>
                    <th width="20%">Description</th>
                    <th width="20%">Street</th>
                    <th width="20%">City</th>
                    <th width="20%">State</th>
                    <th width="20%">Zip code</th>
                    <th width="20%">Country</th>
                    <th width="20%">Latitude</th>
                    <th width="20%">Longitude</th>
                    <th width="20%">Edit/Delete</th>
                </tr>
               <tbody id="dvdRows"></tbody>
      </table>


      
    </div>
  </div>
</body>
</html>
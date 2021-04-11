<%@include file="headCom.jsp"%>
<body>
  <div class="container" style="padding-top:10%">
      <div class="row">
        <div class="col">
        </div>
        <div class="col-5" style="background-color:#d3d3d3; border-radius:25px;">
            <form action="index" method="POST">
                    <div class="row">
                        <div class="col-12 py-5 text-center">
                            <img src='<%=request.getContextPath()%>/resources/img/login.png' height="150px" width="150px" class="img-fluid" />
                        </div>
                        <div class="col-12 py-3">
                            <label for="userName" class="form-label">User Name</label>
                            <input type="text" name="username" class="form-control" id="userName" placeholder="User Name">
                        </div>
                        <div class="col-12 py-3">
                            <label for="password" class="form-label">Password</label>
                            <input type="password" name="password" class="form-control" id="password" placeholder="Password">
                        </div>
                        
                        <div class="col-12 py-3 text-center">
                            <button class="btn btn-primary btn-lg" type="submit"  id="accountBtn">Sign In</button>
                        </div>
                        <div class="col-12 py-2 text-center">
                            <span>Dont have account? <a href="register" ><br>Register Now</a></span>
                        </div>
                    </div>
                </form>
        </div>
        <div class="col">
        </div>
      </div>
    </div>
<%@include file="footer.jsp"%>
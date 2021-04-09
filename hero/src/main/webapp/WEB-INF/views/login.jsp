<%@include file="headCom.jsp"%>
<body>
  <div class="container" style="padding-top:10%">
      <div class="row">
        <div class="col">
        </div>
        <div class="col-5" style="background-color:#d3d3d3; border-radius:25px;">
            <h1>Sign In</h1>
            <form action="loginProcess" method="get" style="display:flex; flex-direction:column">
                Username: <input type="text" name="username"><br>
                Password: <input type="password" name="password"><br>
                <span>${message}</span>
               
                <input type="submit" name="sign in" value="Sign in" style="width:50%">
            </form>
            <a href="register"> Create an account</a>
        </div>
        <div class="col">
        </div>
      </div>
    </div>
<%@include file="footer.jsp"%>
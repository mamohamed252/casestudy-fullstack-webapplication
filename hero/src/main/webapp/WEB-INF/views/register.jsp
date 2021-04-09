<%@include file="headCom.jsp"%>
<body>
  
 <div class="container" style="padding-top:10%">
      <div class="row">
        <div class="col">
        </div>
        <div class="col-5" style="background-color:#d3d3d3; border-radius:25px;">
            <h1>Register an Account!</h1>
            <form action="registerSubmit" method="post" style="display:flex; flex-direction:column">
                Username: <input type="text" name="username"><br>
                Password: <input type="password" name="password"><br>
                Verify Password: <input type="password" name="verifyPassword"><br>
               	<span>${passwordMessage}</span>
                <input type="submit" name="register" value="Register" style="width:50%">
            </form>
        </div>
        <div class="col">
        </div>
      </div>
    </div>
<%@include file="footer.jsp"%>
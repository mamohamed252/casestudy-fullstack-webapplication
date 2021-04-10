<%@include file="headCom.jsp"%>
<body>
  
 <div class="container" style="padding-top:10%">
      <div class="row">
        <div class="col">
        </div>
        <div class="col-7" style="background-color:#d3d3d3; border-radius:25px;">
            <form action="signup" method="POST">
                    <div class="row">
                        <div class="col-12 py-4 text-center">
                            <img src='<%=request.getContextPath()%>/resources/img/login.png' height="150px" width="150px" class="img-fluid" />
                        </div>
                       
                         <h3 style="color:red; width:100%; text-align:center">${message }</h3>
                      
                       
                        <div class="col-12 py-2">
                            <label for="userNameRegister" class="form-label">User Name:</label>
                            <input type="text" name="userName" class="form-control" id="userNameRegister" placeholder="User Name" required>
                       		<p class="text-danger">${nameError }</p>
                        </div>
                        <div class="col-12 py-2">
                            <label for="useremailRegister" class="form-label">Email:</label>
                            <input type="email" name="email" class="form-control" id="useremailRegister" placeholder="email@example.com" required>
                       		<p class="text-danger">${emailError }</p>
                        </div>
                        <div class="col-12 py-2">
                            <label for="passwordRegister" class="form-label">Password:</label>
                            <input type="password" name="password" class="form-control" id="passwordRegister" placeholder="Password" required>
                        	<p class="text-danger">${passError }</p>
                        </div>
                        <div class="col-12 py-2">
                            <label for="passwordConfirmRegister" class="form-label">Verify Password</label>
                            <input type="password" name="passCon" class="form-control" id="passwordConfirmRegister" placeholder="password" required>
                        	<p class="text-danger">${conPassError }</p>
                        </div>
                        <div class="col-12 py-3 text-center">
                                <input class="form-check-input" name="active" type="checkbox" value="true" id="acceptTermsCheckBox" required>
                                <label class="form-check-label" for="acceptTermsCheckBox">
                                    I have read and agree to Terms & Conditions
                                </label>
                        </div>
                        <div class="col-12 py-3 text-center">
                            <button class="btn btn-primary btn-lg" type="submit" id="accountBtn">Sign Up</button>
                        </div>
                        <div class="col-12 py-2 text-center">
                            <span>Have an account?<a href="login" > Sign in</a></span>
                        </div>
                    </div>
                </form>
        </div>
        <div class="col">
        </div>
      </div>
    </div>
<%@include file="footer.jsp"%>
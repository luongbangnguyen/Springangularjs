<script src='${pageContext.request.contextPath}/controller/loginController.js'></script>
	<div class="row">
		<div class="col-md-4 col-md-offset-4">
			<div class="login-panel panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Please Sign In</h3>
				</div>
				<div class="panel-body"  ng-controller="login" >
					<form role="form" id="loginForm" method="post"  ng-submit="submit()">
						<fieldset>
							<div class="form-group">
								<input class="form-control" ng-model="email" placeholder="E-mail" name="email"
									type="email" autofocus>
							</div>
							<div class="form-group">
								<input class="form-control" placeholder="Password" ng-model="password"
									name="password" type="password">
							</div>
							<div class="checkbox">
								<label> <input name="remember" type="checkbox"
									value="Remember Me">Remember Me
								</label>
							</div>
							<!-- Change this to a button or input when using this as a form -->
							<button class="btn btn-lg btn-success btn-block">Submit</button>
							<div  class="require" style="padding-top:10px">
								{{information}}
							</div>
						</fieldset>
					</form>
				</div>
			</div>
		</div>
	</div>
<script>
	$(document).ready(function() {
		$('#loginForm').formValidation({
			framework : 'bootstrap',
			icon : {
				valid : 'glyphicon glyphicon-ok',
				invalid : 'glyphicon glyphicon-remove',
				validating : 'glyphicon glyphicon-refresh'
			},
			
			fields : {
				email : {
					// Show the message in a tooltip
					validators : {
						notEmpty : {
							message : 'The email address is required'
						},
						emailAddress : {
							message : 'The email address is not valid'
						}

					}
				},
				password : {
					validators : {
						notEmpty : {
							message : 'The password is required'
						},
						 stringLength: {
		                        message: 'Password must than 6 character',
		                        min: 6
		                    }
					}
				}
			}
		});
	});
</script>
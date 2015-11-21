<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	${error}
	<form method="post" action="validateLogin">
		User name  : <input type="text" name="UserID" />
		password : <input type ="password" name="PASSWORD"/>
		<input type="submit" name="login" value="Login"/>
	</form>
</body>
</html>
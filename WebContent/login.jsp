<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
function register(){
	
}
</script>
</head>
<body>
	<form action="login_action" method="post">
		<table align="center">
			<tr>
				<td>用户名</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr><td><input type="submit" value="登录" /></td><td><input type="button" value="注册" onclick="register()"/></td></tr>
		</table>

	</form>
</body>
</html>
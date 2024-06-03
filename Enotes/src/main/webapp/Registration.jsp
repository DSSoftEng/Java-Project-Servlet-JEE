<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style2.css">
</head>
<body>
 <h1>Registration </h1>
    <div class="container">
        <form action="RegisterServlet" method="post">
            <table>
                <tr>
                    <td>Username:</td>
                    <td><input type="text" name="username"></td>
                </tr>

                <tr>
                    <td>Password:</td>
                    <td><input type="text" name="password"></td>
                </tr>

                <tr>
                    <td colspan="2"><input type="submit" value="Envoyer"></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
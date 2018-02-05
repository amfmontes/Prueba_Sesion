<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Compra de productos</title>
</head>
<body>
<h3>Dime un producto</h3><br/><br/>
<form action="ProductoServlet" method="post">
Producto: 
<input type="text" name="producto"><br/><br/>
<input type="submit" value="Enviar"><br/><br/>

</form>
</body>
</html>
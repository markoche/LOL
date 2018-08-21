
<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateHero" method="post">
<input type="hidden" name="heros.id" value="${heros.id }"><br/>
    输入名称<input type="text" name="heros.name" value="${heros.name }"><br/>
    输入别名<input type="text" name="heros.nickname" value="${heros.nickname }"><br/>
    输入性别<input type="text" name="heros.sex" value="${heros.sex }"><br/>
    <input type="submit">
    </form>
</body>
</html>
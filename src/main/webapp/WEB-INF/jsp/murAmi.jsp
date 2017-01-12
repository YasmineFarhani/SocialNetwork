<%@ page import="static com.sun.org.apache.xml.internal.serializer.utils.Utils.messages" %>
<%@ page import="com.yfarhani.models.Message" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Mur</title>
</head>

<body>
<h1> Mur de ${nomAmi} </h1>
<h2>${messageAmi}</h2>

<c:forEach items="${messages}" var="m">
    <h3>${m.message}</h3>
</c:forEach>
</body>
</html>

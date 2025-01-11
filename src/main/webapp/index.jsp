<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>
    <c:if test="${sessionScope.auth==null}">
        <h1>BẠN CHƯA ĐĂNG NHẬP</h1>
    </c:if>
    <c:if test="${sessionScope.auth!=null}">
        <h1>XIN CHÀO ${sessionScope.auth.username}</h1>
    </c:if>
</h1>
</body>
</html>
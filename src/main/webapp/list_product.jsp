<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Danh sách sản phẩm</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-5">
    <div class="row">
        <c:forEach var="p" items="${data}">
            <div class="col-md-3 mb-4" id="product-${p.id}">
                <div class="card">
                    <img src="${p.img}" class="card-img-top" alt="${p.title}">
                    <div class="card-body">
                        <h5 class="card-title">${p.title}</h5>
                        <h5 class="card-title">${p.id}</h5>
                        <p class="card-text">Giá: <f:formatNumber value="${p.price}"/></p>
                        <!-- Thêm nút Chi tiết -->
                        <button class="btn btn-primary">Chi tiết</button>
                        <!-- Thêm nút Giỏ hàng -->
                        <button class="btn btn-success">Thêm vào giỏ</button>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

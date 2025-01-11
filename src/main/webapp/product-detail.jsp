
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Chi Tiết Sản Phẩm</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <div class="row">
        <!-- Phần ảnh sản phẩm -->
        <div class="col-md-6">
            <img src="https://via.placeholder.com/500" class="img-fluid" alt="Ảnh sản phẩm">
        </div>

        <!-- Phần chi tiết sản phẩm -->
        <div class="col-md-6">
            <h1 class="display-5">Gạch Men Trắng</h1>
            <p class="text-muted">Mã sản phẩm: SP001</p>
            <p class="text-primary h4"><strong>500,000 VND</strong></p>

            <p class="mt-3">Gạch men trắng bóng bền, thích hợp cho phòng tắm hoặc nhà bếp, tạo cảm giác rộng rãi và sạch sẽ.
                Được sản xuất từ nguyên liệu cao cấp, đảm bảo độ bền cao và khả năng chống thấm tốt.</p>

            <h5>Thông số kỹ thuật:</h5>
            <ul>
                <li>Kích thước: 30x30 cm</li>
                <li>Màu sắc: Trắng</li>
                <li>Chất liệu: Gạch men sứ</li>
                <li>Độ dày: 5 mm</li>
            </ul>

            <div class="mt-4">
                <label for="quantity" class="form-label">Số lượng:</label>
                <input type="number" id="quantity" class="form-control w-50" value="1" min="1">
            </div>

            <button class="btn btn-primary btn-lg w-100 mt-4">Thêm vào Giỏ hàng</button>
            <button class="btn btn-secondary btn-lg w-100 mt-2">Mua Ngay</button>

            <div class="mt-5">
                <a href="index.html" class="btn btn-link">← Quay lại trang sản phẩm</a>
            </div>
        </div>
    </div>

    <!-- Phần mô tả chi tiết hơn -->
    <div class="row mt-5">
        <div class="col">

            <h4>Mô tả chi tiết</h4>
            <p>Gạch men trắng là lựa chọn tuyệt vời cho những ai yêu thích phong cách hiện đại, tối giản.
                Sản phẩm phù hợp với mọi không gian, đặc biệt là nhà tắm và nhà bếp. Với độ bền cao, gạch men trắng có thể
                chịu được lực tác động và dễ dàng vệ sinh, giữ cho không gian luôn sạch sẽ và sáng sủa.</p>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>


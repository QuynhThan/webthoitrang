<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>

 <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Spectral+SC:wght@200;400;600&display=swap"
      rel="stylesheet"
    />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
      crossorigin="anonymous"
    />
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Dosis:wght@300;400;500&display=swap"
      rel="stylesheet"
    />
    <script
      src="https://kit.fontawesome.com/9f1102c4bf.js"
      crossorigin="anonymous"
    ></script>
    <link rel="stylesheet" href="<c:url value='/templates/owlcarousel/owl.carousel.min.css'/>" />
    <link rel="stylesheet" href="<c:url value='/templates/owlcarousel/owl.theme.default.min.css'/>" />
    <link rel="stylesheet" href="<c:url value='/templates/styles/index.css'/>" />

<%-- <%@include file="/common/home/head.jsp" %>
<%@include file="/common/admin/head-admin.jsp" %> --%>
<title>MY PRODUCTS</title>
</head>
<body>
	<%-- <div class="loading-animation">
      <img src="<c:url value='/templates/images/animation/loading-black-2x.gif'/>" alt="" />
    </div>
    <header class="fc-white dosis-font" id="header">
      <div
        class="child--1 fs-6 d-flex align-items-center justify-content-between"
      >
        <div class="fs-small">
          <span class="fs-small"
            ><i class="fa-solid fa-location-dot fa-xs"></i> Singapore</span
          >
          <span class="fs-small">English</span>
          <span class="fs-small d-inline-flex align-items-center"
            ><i class="px-1 fa-solid fa-phone fa-xs fs-small"></i>
            +65-6983-1020</span
          >
        </div>
        <div class="px-2" style="transform: translateX(-45px)">
          <img
            src="<c:url value='/templates/images/gucci_logo.png'/>"
            width="160px"
            height="26px"
            alt=""
            class="logo"
          />
        </div>
        <div>
          <a href="#" class="fs-small">Sign In</a>
          <a href="#" class="fs-small"><i class="fa-regular fa-heart"></i></a>
          <a href="#" class="fs-small bag-popover" data-bs-toggle="popover"
            ><i class="fa-sharp fa-solid fa-bag-shopping"></i>&nbsp; Bag</a
          >
        </div>
      </div>
      <div class="child--2 pb-2">
        <a href="#" class="text-uppercase">gift</a>
        <a href="#" class="text-uppercase">what's new</a>
        <a href="#" class="text-uppercase">handbags</a>
        <a href="#" class="text-uppercase">women</a>
        <a href="#" class="text-uppercase">men</a>
        <a href="#" class="text-uppercase">children</a>
        <a href="#" class="text-uppercase">jewellery & watches</a>
        <a href="#" class="text-uppercase">beauty</a>
        <a href="#" class="text-uppercase">decor & lifestyle</a>
        <div id="user-sticky">
          <a href="#" class="fs-small"><i class="fa-regular fa-user"></i></a>
          <a href="#" class="fs-small"><i class="fa-regular fa-heart"></i></a>
          <a href="#" class="fs-small bag-popover" data-bs-toggle="popover"
            ><i class="fa-sharp fa-solid fa-bag-shopping"></i>&nbsp;</a
          >
        </div>
      </div>
    </header> --%>
	<%@include file="/common/home/header.jsp" %>
	

	
	<section class="container-fluid items-section px-4">
	<div class="container mt-3">
		<h1>Add Product Form</h1>
		<form action="addProduct" method="post">
			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="mamh">Mã mặt hàng</label> <input type="text"
							class="form-control" id="mamh" name="mamh"
							placeholder="Enter mã">
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<label for="tenmh">Tên Mặt Hàng</label> <input type="text"
							class="form-control" id="tenmh" name="tenmh"
							placeholder="Enter Tên Mặt Hàng">
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="soluongton">Số Lượng Tồn</label> <input
							type="number" class="form-control" id="soluongton"
							name="soluongton" placeholder="Enter Số Lượng Tồn">
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<label for="trangthai">Trạng Thái</label> <input
							type="number" class="form-control" id="trangthai"
							name="trangthai" placeholder="Enter trạng thái">
					</div>
				</div>
			</div>

			<div class="row">
				
				<div class="col">
					<div class="form-group">
						<label for="nh"> Chọn Nhãn Hiệu</label>
						<select class="form-control valid form-select"  id="nh" name="nh" >
							<c:forEach items="${nhanhieus}" var="nhanhieu">
							<c:set var="nhanhieu" scope="session" value="${nhanhieu}"></c:set>
	                              <option value="${nhanhieu}">${nhanhieu.manh  } | ${nhanhieu.tennh }</option>
	                        </c:forEach>
						</select>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<div class="form-group">
							<label for="mota">Mô tả</label>
							<textarea class="form-control" id="mota" name="mota"
								rows="3" placeholder="Enter Mô tả"> </textarea>
						</div>
					</div>
				</div>
				
			
			</div>
	
			<a href="${pageContext.request.contextPath }/"
				class="btn btn-warning"> Back </a>
			<button type="submit" class="btn btn-primary">Submit</button>
			<button type="button" class="btn btn-primary" onclick="testFunc()">test</button>
		</form>

	</div>
	
	</section>
	<!-- Items List  -->
    <section class="container-fluid items-section px-4">
    <h5>Product List</h5>
      <div class="child--1 items-list">
      	<c:set value="0" var="counter"></c:set>
      	<c:forEach items="${productList }" var="product">
	      	<c:if test="${counter%4 eq 0 }">
	      		<div class="row row-cols-4 items">
	      	</c:if>
      		
	          <div class="col item">
	            <div class="item-img">
	              <img src="<c:url value='/templates/images/${product.hinhanhmhs[0].duongdan }'/>" alt="" />
	            </div>
	            <div class="item-detail text-center">
	              <div class="owl-carousel owl-theme owl-height items-carousel">
	              	<!-- Image List -->
	              	
	              	<c:forEach items="${product.hinhanhmhs }" var="hinhanh" begin="1">
	              		 <img src="<c:url value='/templates/images/${hinhanh.duongdan }'/>" alt="" />
	              	</c:forEach>
	              		
	                <img src="<c:url value='/templates/images/men-shirts/black-shirt-1.jpg'/>" alt="" />
	                <img src="<c:url value='/templates/images/men-shirts/men-black-shirt.jpg'/>" alt="" />
	                <img src="<c:url value='/templates/images/men-shirts/men-black-shirt-1.jpg'/>" alt="" />
	                <img src="<c:url value='/templates/images/men-shirts/men-black-shirt-2.jpg'/>" alt="" />
	              </div>
	              <div class="item-content mt-4">
	                <p class="item-name">${product.tenmh }</p>
	                 <c:forEach items="${product.banggias}" var="banggia" begin="${product.banggias.size() - 1}">
		              	<p class="item-price"> $ ${banggia.giamoi}</p>
		             </c:forEach>
	                <a href="#" class="item-detail-link"
	                  >Edit &nbsp;
	                  <i class="fa-solid fa-angle-right fa-2xs"></i
	                ></a>
	              </div>
	            </div>
	          </div>
      		<c:set value="${counter + 1 }" var="counter"></c:set>
	        <c:if test="${counter%4 eq 0 }">
      			</div>
      		</c:if>
      	</c:forEach>
        
      </div>
    </section>
	
    
    <!-- Scripts -->

    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
      crossorigin="anonymous"
    ></script>

    <script
      src="https://code.jquery.com/jquery-3.6.1.min.js"
      integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ="
      crossorigin="anonymous"
    ></script>
    <script src="<c:url value='/templates/owlcarousel/owl.carousel.min.js'/>"></script>
    <script src="<c:url value='/templates/scripts/loading-animation.js'/>"></script>
    <script> 
      $(document).ready(function () {
        $(".owl-carousel").owlCarousel({
          center: true,
          items: 1,
          loop: true,
          margin: 0, 
          autoplay: false,
          nav: true,
          navText: [
            '<svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-chevron-compact-left" viewBox="0 0 16 16"><path fill-rule="evenodd" d="M9.224 1.553a.5.5 0 0 1 .223.67L6.56 8l2.888 5.776a.5.5 0 1 1-.894.448l-3-6a.5.5 0 0 1 0-.448l3-6a.5.5 0 0 1 .67-.223z"/></svg>',
            '<svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-chevron-compact-right" viewBox="0 0 16 16"><path fill-rule="evenodd" d="M6.776 1.553a.5.5 0 0 1 .671.223l3 6a.5.5 0 0 1 0 .448l-3 6a.5.5 0 1 1-.894-.448L9.44 8 6.553 2.224a.5.5 0 0 1 .223-.671z"/></svg>',
          ],
        });
      });
    </script>
    <script src="<c:url value='/templates/scripts/sticky-nav.js'/>"></script>
    <script src="<c:url value='/templates/scripts/add-item-to-user-bag.js'/>"></script>
	
<%-- <%@include file="/common/admin/footer-admin.jsp" %> --%>
  	<footer class="container-fluid items-section">
		<div>Gucci Gucci Gucci!</div>
	</footer>
<script type="text/javascript">
function testFunc(){
	var nhanhieu = '$<c:out value="${productList}"/>';
	alert(typeof nhanhieu)
}

/* function getGia(Banggia){
	var giaMoi = 0;
	alert(typeof Banggia;)
} */
	
	
</script>
</body>
</html>
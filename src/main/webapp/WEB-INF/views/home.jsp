<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp" %>


<!DOCTYPE html>

<html>

<head>

<base href="${pageContext.servletContext.contextPath }/" />
<%@include file="/common/home/head.jsp" %>
<title>Home Page</title>

</head>

<body>

<%@include file="/common/home/header.jsp" %>

<section class="hero-section ">
		<!-- <div -->
		<!-- 	class="hero-content text-white d-flex flex-column align-items-center" -->
		<!-- 	style="min-width: 60%; margin: 0 auto" -->
		<!-- > -->
		<!-- 	<p -->
		<!-- 		class="child--1 text-uppercase ls-sm fw-light no-mp" -->
		<!-- 		style="font-size: 0.9rem" -->
		<!-- 	> -->
		<!-- 		exquisite gucci -->
		<!-- 	</p> -->
		<!-- 	<p class="child--2 text-uppercase fs-xl ls-lg no-mp"> -->
		<!-- 		women's jewellery -->
		<!-- 	</p> -->
		<!-- 	<button class="text-uppercase btn-shop py-2 mt-4 px-4">shop now</button> -->
		<!-- </div> -->

		<!-- Carousel -->
		<div id="carouselExampleIndicators" class="carousel slide carousel-fade" data-bs-ride="carousel">
			<div class="carousel-indicators">
				<button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active"
					aria-current="true" aria-label="Slide 1"></button>
				<button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1"
					aria-label="Slide 2"></button>
				<button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2"
					aria-label="Slide 3"></button>
				<button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="3"
					aria-label="Slide 4"></button>
			</div>
			<div class="carousel-inner">
				<div class="carousel-item active layout" data-bs-interval="75000">
					<video autoplay muted loop height="648">
						<source src="<c:url value='/templates/images/y2meta.com-Gucci Gift 2020-(1080p).mp4'/>" type="video/mp4">
				
						<source src="movie.ogg" type="video/ogg">
						Your browser does not support the video tag.
					</video>
					<div class="carousel-caption d-none d-md-block mb-5 z-1000 transformY-sm">
						<!-- <h5>Second slide label</h5> -->
						<!-- <p> -->
						<!-- 	Some representative placeholder content for the second slide. -->
						<!-- </p> -->
						<p class="child--2 text-uppercase fs-xl ls-lg no-mp">
							gucci gift
						</p>
						<button class="text-uppercase btn-shop py-2 mt-2 px-4">
							shop now
						</button>
					</div>
				</div>
				<div class="carousel-item layout" data-bs-interval="6000">
					<img src="<c:url value='/templates/images/HeroBigStandard_Gucci-Exquisite-2023-014_001_Default.jpg'/>" class="d-block w-100" alt="..."
						style="height: 550px" />
					<div class="carousel-caption d-none d-md-block mb-5 z-1000">
						<!-- <h5>Second slide label</h5> -->
						<!-- <p> -->
						<!-- 	Some representative placeholder content for the second slide. -->
						<!-- </p> -->
						<p class="child--1 text-uppercase ls-sm fw-light no-mp" style="font-size: 0.9rem">
							exquisite gucci
						</p>
						<p class="child--2 text-uppercase fs-xl ls-lg no-mp">
							women's jewellery
						</p>
						<button class="text-uppercase btn-shop py-2 mt-4 px-4">
							shop now
						</button>
					</div>
				</div>
				<div class="carousel-item layout" data-bs-interval="4000">
					<img src="<c:url value='/templates/images/HeroBigStandard_Vogue-Exquisite-008-new_001_Default.jpg'/>" class="d-block w-100" alt="..."
						style="height: 550px" />
					<div class="carousel-caption d-none d-md-block mb-5 z-1000">
						<!-- <h5>Second slide label</h5> -->
						<!-- <p> -->
						<!-- 	Some representative placeholder content for the second slide. -->
						<!-- </p> -->
						<p class="child--1 text-uppercase ls-sm fw-light no-mp" style="font-size: 0.9rem">
							gucci gift
						</p>
						<p class="child--2 text-uppercase fs-xl ls-lg no-mp">
							women's leathergoods
						</p>
						<button class="text-uppercase btn-shop py-2 mt-4 px-4">
							shop now
						</button>
					</div>
				</div>
				<div class="carousel-item layout" data-bs-interval="4000">
					<img src="<c:url value='/templates/images/HeroBigStandard_HarryStyles-Nov3-02_001_Default.jpg'/>" class="d-block w-100" alt="..."
						height="550" />
					<div class="carousel-caption d-none d-md-block mb-5 z-1000">
						<!-- <h5>Second slide label</h5> -->
						<!-- <p> -->
						<!-- 	Some representative placeholder content for the second slide. -->
						<!-- </p> -->
						<p class="child--1 text-uppercase ls-sm fw-light no-mp" style="font-size: 0.9rem">
							exquisite gucci
						</p>
						<p class="child--2 text-uppercase fs-xl ls-lg no-mp">
							gucci ha ha ha
						</p>
						<button class="text-uppercase btn-shop py-2 mt-4 px-4">
							shop now
						</button>
					</div>
				</div>
			</div>
			<button class="carousel-control-prev z-1000" type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide="prev">
				<span class="carousel-control-prev-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Previous</span>
			</button>
			<button class="carousel-control-next z-1000" type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide="next">
				<span class="carousel-control-next-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Next</span>
			</button>
		</div>
	</section>

	<!-- Carousel products -->
	<section class="carousel-products mt-4 pt-4 ">
		<div class="owl-carousel">
			<div class="contents">
				<div class="child--1 text-center">
					<img style="width: auto !important;margin: auto;" src="<c:url value='/templates/images/Gucci-HA-HA-HA-denim-jacket.png'/>" alt="" />
				</div>
				<div class="child--2">
					<p class="child--1 text-uppercase fw-light no-mp" style="font-size: 1rem; letter-spacing: 2px">
						exquisite gucci
					</p>
					<p class="child--2 fs-lg ls-sm no-mp" style="color: #313131">
						Gucci HA HA HA denim jacket
					</p>
				</div>
				<div class="child--3">
					<button class="text-uppercase btn-products py-2 mt-4 px-4">
						shop now
					</button>
				</div>
			</div>
			<div class="contents">
				<div class="child--1 text-center">
					<img style="width: auto !important;margin: auto;" src="<c:url value='/templates/images/Ophidia GG zip around wallet.png'/>" alt="" />
				</div>
				<div class="child--2">
					<p class="child--1 text-uppercase fw-light no-mp" style="font-size: 1rem; letter-spacing: 2px">
						gucci gift
					</p>
					<p class="child--2 fs-lg ls-sm no-mp" style="color: #313131">
						Ophidia GG zip around wallet
					</p>
				</div>
				<div class="child--3">
					<button class="text-uppercase btn-products py-2 mt-4 px-4">
						shop now
					</button>
				</div>
			</div>
			<div class="contents">
				<div class="child--1 text-center">
					<img style="width: auto !important;margin: auto;" src="<c:url value='/templates/images/Ophidia GG mini bag.png'/>" alt="" />
				</div>
				<div class="child--2">
					<p class="child--1 text-uppercase fw-light no-mp" style="font-size: 1rem; letter-spacing: 2px">
						gucci gift
					</p>
					<p class="child--2 fs-lg ls-sm no-mp" style="color: #313131">
						Ophidia GG mini bag
					</p>
				</div>
				<div class="child--3">
					<button class="text-uppercase btn-products py-2 mt-4 px-4">
						shop now
					</button>
				</div>
			</div>
			<div class="contents">
				<div class="child--1 text-center">
					<img style="width: auto !important;margin: auto;" src="<c:url value='/templates/images/Ophidia small handbag.png'/>" alt="" />
				</div>
				<div class="child--2">
					<p class="child--1 text-uppercase fw-light no-mp" style="font-size: 1rem; letter-spacing: 2px">
						gucci gift
					</p>
					<p class="child--2 fs-lg ls-sm no-mp" style="color: #313131">
						Ophidia small handbag
					</p>
				</div>
				<div class="child--3">
					<button class="text-uppercase btn-products py-2 mt-4 px-4"> shop now </button>
				</div>
			</div>
			<div class="contents">
				<div class="child--1 text-center">
					<img style="width: auto !important;margin: auto;" src="<c:url value='/templates/images/Women_s GG Gucci Tennis 1977 sneaker.png'/>"
						alt="" />
				</div>
				<div class="child--2">
					<p class="child--1 text-uppercase fw-light no-mp" style="font-size: 1rem; letter-spacing: 2px">
						gucci gift
					</p>
					<p class="child--2 fs-lg ls-sm no-mp" style="color: #313131">
						Women's GG Gucci Tennis 1977 sneaker
					</p>
				</div>
				<div class="child--3">
					<button class="text-uppercase btn-products py-2 mt-4 px-4">
						shop now
					</button>
				</div>
			</div>
		</div>

	</section>
	<section class="lg-img">
		<img src="<c:url value='/templates/images/A model wearing.jpg'/>" width="100%" />


		<div class="text-center bg-gray py-5">
			<p class=" fs-lg ls-sm no-mp" style="color: #313131">
				Gucci Gift
			</p>
			<button class="text-uppercase btn-products py-2 mt-4 px-5" style="font-weight: normal;">
				shop now
			</button>
		</div>

	</section>

	<section class="carousel-products mt-1 text-center" style="padding: 0;">
		<div class="child--1">
			<img src="<c:url value='/templates/images/An archival design from the 1930s inspired the_yyth.jpg'/>" />
		</div>
		<div class="child--2" style="transform: translateY(-90%);">
			<p class="child--1 text-uppercase fw-light no-mp" style="font-size: 1rem; letter-spacing: 2px">
				gucci gift
			</p>
			<p class="child--2 fs-lg ls-sm no-mp" style="color: #313131">
				Gucci Savoy medium trolley
			</p>
			<button class="text-uppercase btn-products py-2 mt-4 px-5" style="font-weight: normal;">
				shop now
			</button>
		</div>
	</section>

	<section class="lg-img relative mt-1" style="overflow: hidden;">
		<img src="<c:url value='/templates/images/HeroBigStandard_GUCCI-GIFT-GIVING-Nov2022-038_001_Default.jpg'/>" style="transform: scale(1.3);"
			width="100%" />

		<div class="discover p-3">
			<p style="font-size: 1.5rem;color: #4B4B4B;" class="pt-4">
				Gucci Gift
			</p>
			<div class="link-box pt-3">
				<a href="#" class="text-uppercase " style="font-size: 1rem;">discover more <i
						class="fa-solid fa-chevron-right"></i></a>
			</div>
		</div>
	</section>


<%@include file="/common/home/footer.jsp" %>
<%-- <%@ include file="menu.jsp" %> --%>
</body>

</html>
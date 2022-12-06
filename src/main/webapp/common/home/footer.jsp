<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp" %>
    <footer class="container-fluid mt-4">
		<div>Hello World!</div>
	</footer>


	<!-- Scripts -->

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
		crossorigin="anonymous"></script>
	<script src="https://code.jquery.com/jquery-3.6.1.min.js"
		integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ=" crossorigin="anonymous"></script>
	<script src="<c:url value='/templates/owlcarousel/owl.carousel.min.js'/>" ></script>


	<script>
		$(document).ready(function () {
			$('.owl-carousel').owlCarousel({
				center: true,
				items: 1,
				loop: true,
				margin: 0,
				autoplay: true,
				autoplayTimeout: 5000,
				autoplayHoverPause: true,
			});
		});

		window.addEventListener("scroll", function () {
			const header = document.getElementById('header');
			header.classList.toggle("sticky", window.scrollY > 100);
		})
	</script>
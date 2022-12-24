<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp" %>

	<div class="loading-animation">
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
    </header>
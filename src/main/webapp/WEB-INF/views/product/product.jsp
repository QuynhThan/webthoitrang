<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="/common/taglib.jsp" %>
	<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
  <head>
  <base href="${pageContext.servletContext.contextPath }" />	
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>${thisProduct.tenmh}</title>
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
    <link
      rel="stylesheet"
      type="text/css"
      href="<c:url value='/templates/styles/slick/slick/slick.css'/>"
    />
    <link
      rel="stylesheet"
      type="text/css"
      href="<c:url value='/templates/styles/slick/slick/slick-theme.css'/>" 
    />
    <link rel="stylesheet" href="<c:url value='/templates/styles/index.css'/>"  />
    <link rel="stylesheet" href="<c:url value='/templates/styles/item-detail.css'/>"  />
  </head>

  <body>
    <div class="loading-animation">
      <img src="<c:url value='/templates/images/animation/loading-black-2x.gif'/>" alt=""  />
    </div>
    <div class="layout"></div>
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
          <a href="#" class="fs-small"
            ><span class="signin-popover m-0">Sign In</span></a
          >
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
          <a href="#" class="fs-small"
            ><i class="fa-regular fa-user signin-popover"></i
          ></a>
          <a href="#" class="fs-small"><i class="fa-regular fa-heart"></i></a>
          <a href="#" class="fs-small bag-popover" data-bs-toggle="popover"
            ><i class="fa-sharp fa-solid fa-bag-shopping"></i>&nbsp;</a
          >
        </div>
      </div>
    </header>
    <section class="hero-section">
      <div class="item-detail-carousel">
        <img
          src="<c:url value='/templates/images/men-shirts/men-shirts-detail/blue-shirt/blue-shirt-men-1-800px.jpg'/>"
          alt="" 
        />
        <img
          src="<c:url value='/templates/images/men-shirts/men-shirts-detail/blue-shirt/blue-shirt-1.jpg'/>"
          alt="" 
        />
        <img
          src="<c:url value='/templates/images/men-shirts/men-shirts-detail/blue-shirt/blue-shirt-men-2.jpg'/>"
          alt="" 
        />
        <img
          src="<c:url value='/templates/images/men-shirts/men-shirts-detail/blue-shirt/blue-shirt-2.jpg'/>"
          alt="" 
        />
        <img
          src="<c:url value='/templates/images/men-shirts/men-shirts-detail/blue-shirt/blue-shirt-men-3.jpg'/>"
          alt="" 
        />
        <img
          src="<c:url value='/templates/images/men-shirts/men-shirts-detail/blue-shirt/blue-shirt-men-4.jpg'/>"
          alt=""
        />
      </div>

      <div class="item-detail-content groteskFont">
        <h6>Double G cotton poplin shirt</h6>
        <div class="money groteskFont">C$ &nbsp;&nbsp;1,005</div>
        <form action="#" method="post">
          <div class="color-container">
            <div class="color-circus" style="background-color: #0e4276"></div>
            <button class="btn color-name-container" type="button">
              <span class="color-name">dark blue</span>
              <span class="icon">
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  width="16"
                  height="16"
                  fill="currentColor"
                  class="bi bi-chevron-down"
                  viewBox="0 0 16 16"
                >
                  <path
                    fill-rule="evenodd"
                    d="M1.646 4.646a.5.5 0 0 1 .708 0L8 10.293l5.646-5.647a.5.5 0 0 1 .708.708l-6 6a.5.5 0 0 1-.708 0l-6-6a.5.5 0 0 1 0-.708z"
                  />
                </svg>
              </span>
            </button>
          </div>
          <div class="size-container">
            <select
              class="form-select select-size no-radius"
              aria-label="Default select example"
            >
              <option selected>Select Size</option>
              <option value="1">XXXS</option>
              <option value="2">XXS</option>
              <option value="3">XS</option>
              <option value="4">S</option>
              <option value="4">M</option>
              <option value="5">L</option>
              <option value="6">XL</option>
              <option value="7">XXL</option>
              <option value="8">XXXL</option>
            </select>
            <!-- Button trigger modal -->
            <button
              type="button"
              class="btn groteskFont view-size-guide-btn"
              data-bs-toggle="modal"
              data-bs-target="#viewSizeGuideModal"
            >
              <img
                src="<c:url value ='/templates/images/icons/ruler-svgrepo-com.svg'/> "
                height="20px"
                width="20px"
                alt=""
              />
              <span class="d-inline-block">view size guide</span>
            </button>
          </div>
          <button class="btn brown-btn no-radius">ADD TO SHOPPING BAG</button>
        </form>
      </div>
    </section>

    <section class="item-detail-section container-fluid">
      <div class="scroll-container">
        <div class="left">
          <div class="variation">
            <p class="groteskFont" style="font-size: 0.8rem">VARIATION (2)</p>
            <ul class="variation-list">
              <li>
                <a href="#">
                  <img
                    src="<c:url value='/templates/images/men-shirts/men-shirts-detail/blue-shirt/variation/blue-shirt.png'/>"
                    alt="" 
                  />
                </a>
              </li>
              <li>
                <a href="item-detail-1.html">
                  <img
                    src="<c:url value='/templates/images/men-shirts/men-shirts-detail/blue-shirt/variation/black-shirt.png'/>"
                    alt="" 
                  />
                </a>
              </li>
            </ul>
          </div>
        </div>
        <div class="right groteskFont">
          <div class="item-detail">
            <div class="img">
              <img
                src="<c:url value='/templates/images/men-shirts/men-shirts-detail/blue-shirt/blue-shirt-item-detail.jpg'/>"
                class="img"
                alt=""  
              />
            </div>
            <div class="item-detail-content">
              <h6>PRODUCT DETAILS</h6>
              <p class="content groteskFont">
                Socialites from the 1970s represent a strong source of
                inspiration for Alessandro Michele, resulting in a series of
                tailored looks. Bold new color palettes mix with archival
                details and show the long-standing tradition of the House. This
                crisp cotton shirt has a subtle Double G embroidery detail.
              </p>
              <ul class="detail-list">
                <li>Black cotton</li>
                <li>Double G embroidery</li>
                <li>Long sleeves</li>
                <li>Point collar</li>
                <li>Mother of pearl buttons</li>
                <li>Made in Italy</li>
                <li>The product shown in this image is a size 15++</li>
                <li>Fabric: 100% Cotton.</li>
                <li>Embroidery: 100% Polyester.</li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </section>

    <!-- You may also like section -->
    <section class="you-also-like-section">
      <h5>You May Also Like</h5>
      <div class="carousel">
      <c:forEach var="product" items="${productList}">
      
	      <div class="item">
	          <a href="#">
	            <div class="item-img--1">
	              <img src="<c:url value='/templates/images/${product.hinhanhmhs[0].duongdan }'/>" alt=""  />
	            </div>
	            <div class="item-img--2">
	              <img src="<c:url value='/templates/images/${product.hinhanhmhs[1].duongdan }'/>" alt="" />
	            </div>
	            <div class="item-content mt-4">
	              <p class="item-name">${product.tenmh }</p>
	              <c:if test="${product.banggias.size() eq 0 }">
	                	<p class="item-price"> $ null</p>
	                </c:if>
	                <c:if test="${product.banggias.size() > 0 }">
	                	<c:forEach items="${product.banggias}" var="banggia" begin="${product.banggias.size() - 1}">
			              	<p class="item-price"> $ ${banggia.giamoi}</p>
			             </c:forEach>
	                </c:if>
	              <a href="#" class="item-detail-link"
	                >shop this &nbsp; <i class="fa-solid fa-angle-right fa-2xs"></i
	              ></a>
	            </div>
	          </a>
	        </div>
      </c:forEach>
        <div class="item">
          <a href="#">
            <div class="item-img--1">
              <img src="<c:url value='/templates/images/men-shirts/white-shirt.jpg'/>" alt=""  />
            </div>
            <div class="item-img--2">
              <img src="<c:url value='/templates/images/men-shirts/men-white-shirt-1.jpg'/>" alt="" />
            </div>
            <div class="item-content mt-4">
              <p class="item-name">Double G cotton poplin shirt</p>
              <p class="item-price">$ 780</p>
              <a href="#" class="item-detail-link"
                >shop this &nbsp; <i class="fa-solid fa-angle-right fa-2xs"></i
              ></a>
            </div>
          </a>
        </div>
        <div class="item">
          <a href="">
            <div class="item-img--1">
              <img src="<c:url value='/templates/images/men-shirts/blue-stripe-shirt.jpg'/>" alt=""  />
            </div>
            <div class="item-img--2">
              <img
                src="<c:url value='/templates/images/men-shirts/blue-stripe-shirt--1-men-3.jpg'/>" 
                alt=""
              />
            </div>
            <div class="item-content mt-4">
              <p class="item-name">Double G cotton poplin shirt</p>
              <p class="item-price">$ 780</p>
              <a href="#" class="item-detail-link"
                >shop this &nbsp; <i class="fa-solid fa-angle-right fa-2xs"></i
              ></a>
            </div>
          </a>
        </div>
        <div class="item">
          <a href="">
            <div class="item-img--1">
              <img src="<c:url value='/templates/images/men-shirts/brown-shirt.jpg'/>" alt=""  />
            </div>
            <div class="item-img--2">
              <img src="<c:url value='/templates/images/men-shirts/brown-shirt-men-3.jpg'/>" alt=""  />
            </div>
            <div class="item-content mt-4">
              <p class="item-name">Double G cotton poplin shirt</p>
              <p class="item-price">$ 780</p>
              <a href="#" class="item-detail-link"
                >shop this &nbsp; <i class="fa-solid fa-angle-right fa-2xs"></i
              ></a>
            </div>
          </a>
        </div>
        <div class="item">
          <a href="">
            <div class="item-img--1">
              <img src="<c:url value='/templates/images/men-shirts/green-flower.jpg'/>" alt="" />
            </div>
            <div class="item-img--2">
              <img src="<c:url value='/templates/images/men-shirts/green-flower-men2.jpg'/>" alt="" />
            </div>
            <div class="item-content mt-4">
              <p class="item-name">Double G cotton poplin shirt</p>
              <p class="item-price">$ 780</p>
              <a href="#" class="item-detail-link"
                >shop this &nbsp; <i class="fa-solid fa-angle-right fa-2xs"></i
              ></a>
            </div>
          </a>
        </div>
        <div class="item">
          <a href="">
            <div class="item-img--1">
              <img src="<c:url value='/templates/images/men-shirts/pink-shirt.jpg'/>" alt=""  />
            </div>
            <div class="item-img--2">
              <img src="<c:url value='/templates/images/men-shirts/pink-shirt-men.jpg'/>" alt=""  />
            </div>
            <div class="item-content mt-4">
              <p class="item-name">Double G cotton poplin shirt</p>
              <p class="item-price">$ 780</p>
              <a href="#" class="item-detail-link"
                >shop this &nbsp; <i class="fa-solid fa-angle-right fa-2xs"></i
              ></a>
            </div>
          </a>
        </div>
      </div>
    </section>

    <footer class="container-fluid mt-4">
      <div>Hello World!</div>
    </footer>

    <!-- Modal -->
    <div
      class="modal fade"
      id="viewSizeGuideModal"
      tabindex="-1"
      aria-labelledby="viewSizeGuideModal"
      aria-hidden="true"
    >
      <div class="modal-dialog" style="max-width: 1200px">
        <div class="modal-content">
          <div class="modal-header">
            <button
              type="button"
              class="btn-close"
              data-bs-dismiss="modal"
              aria-label="Close"
            ></button>
          </div>
          <div class="modal-body mb-5">
            <div class="header">
              <h4 class="">MEN'S READY-TO-WEAR</h4>
              <p>
                The size charts display sizes based on body measurements. Use
                our measuring tips and refer to the sketches below to determine
                your size.
              </p>
            </div>
            <div class="measure-tips">
              <ul class="measure-nav">
                <li class="active" id="child-1" style="margin-right: 5rem">
                  TOPS
                </li>
                <li id="child-2">MEASURING TIPS</li>
              </ul>
              <div class="measure-tips-content">
                <div class="tops-content">
                  <table class="size-table table table-striped">
                    <thead>
                      <tr>
                        <th>size</th>
                        <th>it</th>
                        <th>
                          shoulders <br />
                          (cm/in)
                        </th>
                        <th>
                          chest <br />
                          (cm/in)
                        </th>
                        <th>
                          formal shirts <br />
                          neck (cm/in)
                        </th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>xxxs</td>
                        <td>40</td>
                        <td>43/17</td>
                        <td>82/32.3</td>
                        <td>36/14</td>
                      </tr>
                      <tr>
                        <td>xxs</td>
                        <td>42</td>
                        <td>44/17.3</td>
                        <td>86/33.8</td>
                        <td>37/14.5</td>
                      </tr>
                      <tr>
                        <td>xs</td>
                        <td>44</td>
                        <td>45/17.7</td>
                        <td>90/35.4</td>
                        <td>38/15</td>
                      </tr>
                      <tr>
                        <td>s</td>
                        <td>46</td>
                        <td>46/18.1</td>
                        <td>94/37</td>
                        <td>39/15.5</td>
                      </tr>
                      <tr>
                        <td>m</td>
                        <td>48</td>
                        <td>47/18.5</td>
                        <td>98/38.6</td>
                        <td>40/15.75</td>
                      </tr>
                      <tr>
                        <td>l</td>
                        <td>50</td>
                        <td>48/18.9</td>
                        <td>102/40.2</td>
                        <td>41/16</td>
                      </tr>
                      <tr>
                        <td>xl</td>
                        <td>52</td>
                        <td>49/19.3</td>
                        <td>106/41.7</td>
                        <td>42/16.5</td>
                      </tr>
                      <tr>
                        <td>xxl</td>
                        <td>54</td>
                        <td>50/19.7</td>
                        <td>110/43.3</td>
                        <td>43/17</td>
                      </tr>
                      <tr>
                        <td>xxxl</td>
                        <td>56</td>
                        <td>51/20.1</td>
                        <td>114/44.9</td>
                        <td>44/17.5</td>
                      </tr>
                      <tr>
                        <td>-</td>
                        <td>58</td>
                        <td>52/20.5</td>
                        <td>118/46.5</td>
                        <td>45/17.75</td>
                      </tr>
                      <tr>
                        <td>-</td>
                        <td>60</td>
                        <td>53/20.9</td>
                        <td>122/48</td>
                        <td>46/18</td>
                      </tr>
                      <tr>
                        <td>-</td>
                        <td>62</td>
                        <td>-</td>
                        <td>-</td>
                        <td>47/18.5</td>
                      </tr>
                      <tr>
                        <td>-</td>
                        <td>64</td>
                        <td>-</td>
                        <td>-</td>
                        <td>48/19</td>
                      </tr>
                    </tbody>
                  </table>
                </div>
                <div class="measuring-tips-content">
                  <div class="body-img">
                    <img
                      height="500px"
                      src="<c:url value='/templates/images/person-model.jpg'/>"
                      alt="" 
                    />
                  </div>
                  <div class="how-to">
                    <h6>How to Measure</h6>
                    <ol>
                      <li>Neck</li>
                      <li>Shoulders</li>
                      <li>Chest</li>
                    </ol>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <!-- TEST POPOVER -->
    <div id="bag-detail-popover" class="my-popover">
      <h6>Shopping Bag</h6>
      <div>
        <ul class="detail-list scroll">
          <li class="item">
            <div class="item-img">
              <img
                src="<c:url value='/templates/images/men-shirts/men-shirt-bag/blue-shirt/blue-shirt.jpg'/>"
                alt="" 
              />
            </div>
            <div class="item-content">
              <p class="item-name">Cotton shirt with Double G</p>
              <p class="quantity">Quantity: 1</p>
              <p class="price">Price: C$ 1,005</p>
              <p class="size">Size: XL</p>
            </div>
          </li>

          <li class="item">
            <div class="item-img">
              <img
                src="<c:url value='/templates/images/men-shirts/men-shirt-bag/blue-shirt/blue-shirt.jpg'/>"
                alt="" 
              />
            </div>
            <div class="item-content">
              <p class="item-name">Cotton shirt with Double G</p>
              <p class="quantity">Quantity: 1</p>
              <p class="price">Price: C$ 1,005</p>
              <p class="size">Size: XL</p>
            </div>
          </li>
        </ul>
        <div class="total">
          <div class="total-left">
            <span>Sub Total</span>
          </div>
          <div class="total-right">
            <p class="total-money">C$ 2,0101</p>
            <p class="include">Import Duties Included</p>
          </div>
        </div>
        <div class="view-bag-checkout">
          <a href="#" class="view-bag">view bag details</a>
          <button type="button" class="btn brown-btn no-radius btn-hover">
            checkout
          </button>
        </div>
      </div>
    </div>

    <!-- Sign in Popover -->
    <div id="signin-popover" class="my-popover">
      <div class="sign-in">
        <!-- Phần này để rảnh thì làm tiếp  -->
        <div class="carousel-text">
          <div>Save you favorite item</div>
        </div>
        <button class="btn brown-btn no-radius white-btn" type="button">
          create my gucci account
        </button>
      </div>
      <div class="register">
        <button class="btn brown-btn no-radius" type="button">sign in</button>
      </div>
    </div>
    <!-- Scripts -->

    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://code.jquery.com/jquery-3.6.1.min.js"
      integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ="
      crossorigin="anonymous"
    ></script>
    
    <script
      type="text/javascript"
      src="<c:url value='/templates/styles/slick/slick/slick.min.js'/>" 
    ></script>
	
	<script type="text/javascript"
		src="<c:url value='/templates/scripts/loading-animation.js'/>" 
	></script>

    <script type="text/javascript" src="<c:url value='/templates/scripts/popover.js'/>" 
    ></script>
    <script type="text/javascript" src="<c:url value='/templates/scripts/item-detail.js'/>" 
    ></script>
    <script type="text/javascript" src="<c:url value='/common/item-detail.js'/>" 
    ></script>
     <script type="text/javascript" src="<c:url value='/common/popover.js'/>" 
    ></script>
  </body>
</html>

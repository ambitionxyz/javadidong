<%@page import="bean.didongbean_luan"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html class="with-height100">
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
 	<link href="Content/bootstrap.css" rel="stylesheet" />
 	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
 	 <style>
 	 	.with-height100 {
 	 		width: 100%;
   			height: 100%;
 	 	}
 	 	.app {
 	 		
 	 		width: 100%;
 	 		height: 100%;
 	 		
 	 	 	background-image: linear-gradient(to bottom, black, white);
 	 	}
 	 	.slide1 {
 	 	 display: flex;
  		justify-content: center;
 	 	height: 400px;
 	 	width: 100%;
 	 	margin-bottom:20px;
 	 	}
 	 	.content1 {
 	 		width: 80%;
    margin: 0 auto;
 	 	}
 	 </style>
</head>
<body class="with-height100">

    <div class = "app with-height100">
    	<div class ="header">
			<nav class="navbar navbar-expand-lg bg-dark">
				  <div class="container-fluid">
				    <a class="navbar-brand" href="didongcontroller">
      					<img src="images/logo.png" alt="Bootstrap" width="30" height="24" class="with-height100" style="    position: relative;
    right: -34px;">
    				</a>
				    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
				      <span class="navbar-toggler-icon"></span>
				    </button>
				    <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
				      <ul class="navbar-nav me-auto mb-2 mb-lg-0" style="    position: relative;
    right: -45px;">
				        <li class="nav-item">
				          <a class="nav-link active text-light fs-2" aria-current="page" href="#">Home</a>
				        </li>
				        <li class="nav-item">
				          <a class="nav-link text-light fs-2" href="#">Account</a>
				        </li>
				      </ul>
				      <form class="d-flex w-50 p-3" role="search" action="didongcontroller" method="post" style="position: absolute;
    right: 69px;">
				        <input class="form-control me-2 fs-2" name="key" type="search" placeholder="Search" aria-label="Search">
				        <button class="btn btn-outline-dark fs-2" type="submit">Search</button>
				      </form>
				    </div>
				  </div>
			</nav>
    	</div>
    	<div class = "content1">
    	<div class="slide1">
    		<div id="carouselExampleDark" class="carousel carousel-dark slide" data-bs-ride="carousel" style="width: 100%">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="2" aria-label="Slide 3"></button>
  </div>
  <div class="carousel-inner h-100">
    <div class="carousel-item active h-100" data-bs-interval="10000">
      <img src="images/slide3.jpg" class="d-block w-100 h-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5 class="text-light">First slide label</h5>
        <p class="text-light">Some representative placeholder content for the first slide.</p>
      </div>
    </div>
    <div class="carousel-item h-100" data-bs-interval="2000">
      <img src="images/slide1.jpg" class="d-block w-100 h-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5 class="text-light">Second slide label</h5>
        <p class="text-light">Some representative placeholder content for the second slide.</p>
      </div>
    </div>
    <div class="carousel-item h-100">
      <img src="images/slide2.jpg" class="d-block w-100 h-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5 class="text-light">Third slide label</h5>
        <p class="text-light">Some representative placeholder content for the third slide.</p>
      </div>
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>
    </div>
    	<h1 style="text-align: center" class="text-light">BẢNG</h1>
		<table class="table table-dark table-striped table-hover">
  		<thead>
    		<tr>
		      <th scope="col">#</th>
		      <th scope="col">Mã di động</th>
		      <th scope="col">Tên di động</th>
		      <th scope="col">Nhà cung cấp</th>
		      <th scope="col">giá</th>
		      <th scope="col">số lượng</th>
		      <th scope="col">Thành tiền</th>
		      <th scope="col">Mức</th>
    		</tr>
 		</thead>
  		<tbody class="table-group-divider">
  		<%
  		double thanhtien;
  		String muc;
		ArrayList<didongbean_luan> ds =(ArrayList<didongbean_luan>)request.getAttribute("dsdidong");
		int n=ds.size();
		if(n == 0) {%>
			<h2 class = "text-danger">Không tìm thấy kết quả</h2>
			
		<%}  else {%>
			<h2>Đã tìm thấy: <%=n%> kết quả</h2>
		<% }%>
		
		<%for(int i = 0; i<n; i++) {
			didongbean_luan dd = ds.get(i);
			thanhtien = dd.getSoluong()*dd.getGia();
			muc = thanhtien > 1000000 ? "Cao":"Thấp";
  		%>
		    <tr>
		      <th scope="row"><%=i+1 %></th>
		      <td><%=dd.getMadidong() %></td>
		      <td><%=dd.getTendidong() %></td>
		      <td><%=dd.getNhacungcap() %></td>
		      <td><%=dd.getGia() %></td>
		      <td><%=dd.getSoluong() %></td>
		      <td><%=thanhtien %></td>
		      <td><%=muc%></td>
		    </tr>
		    <%}
		    %>
		    
		    
  		</tbody>
	</table>
	<nav aria-label="Page navigation example" >
		  <ul class="pagination justify-content-center" style="background-image: linear-gradient(to right, black, white, black)">
		    <li class="page-item">
		      <a class="page-link text-dark" href="#" aria-label="Previous">
		        <span aria-hidden="true">&laquo;</span>
		      </a>
		    </li>
		    <li class="page-item"><a class="page-link text-dark" href="didongcontroller?t=1">1</a></li>
		    <li class="page-item"><a class="page-link text-dark" href="didongcontroller?t=2">2</a></li>
		    <li class="page-item"><a class="page-link text-dark" href="didongcontroller?t=2">3</a></li>
		    <li class="page-item">
		      <a class="page-link text-dark" href="#" aria-label="Next">
		        <span aria-hidden="true">&raquo;</span>
		      </a>
		    </li>
		  </ul>
</nav>
	</div>
    </div>
	    <!-- jQuery -->
	    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
    <script src="/Scripts/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="/Scripts/bootstrap.min.js"></script>
</body>
</html>
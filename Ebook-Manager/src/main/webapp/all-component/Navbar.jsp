<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
    
    <!-- Inclure les CSS -->
    <%@ include file="/all-component/all-css.jsp" %>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/all-component/style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"
        integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>

<body>
    <!-- Header -->
    <div class="container-fluid mt-4">
        <div class="row justify-content-center">
            <div class="col-md-3 text-center">
                <strong>ebook</strong>
            </div>
            <div class="col-md-6">
                <form class="form-inline my-2 my-lg-0 justify-content-center">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-primary my-2 my-sm-0" type="submit">Search</button>
                </form>
            </div>
            <div class="col-md-3 text-center">
                <a href="login.jsp" class="btn btn-primary mx-1"><i class="fa-solid fa-user"></i>Login</a>
                <a href="register.jsp" class="btn btn-success mx-1"><i class="fa-solid fa-right-to-bracket"></i>Register</a>
            </div>
        </div>
    </div>

    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-custom mt-4">
        <a class="navbar-brand" href="#"><i class="fa-solid fa-house"></i></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="#">Home</a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="#"><i class="fa-solid fa-book-open"></i>Recent Book</a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="#"><i class="fa-solid fa-book-open"></i>New Book</a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="#"><i class="fa-solid fa-book-open"></i>Old Book</a>
                </li>
            </ul>
            <form class="form-inline my-2 my-lg-0">
                <button class="btn btn-light my-2 my-sm-0" type="submit"><i class="fa-solid fa-gear"></i>Setting</button>
                <button class="btn btn-light my-2 my-sm-0" type="submit"><i class="fa-regular fa-address-card"></i>Contact Us</button>
            </form>
        </div>
    </nav>

    <!-- Fin du corps de la page -->
</body>

</html>

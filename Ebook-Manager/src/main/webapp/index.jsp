<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ebook Page</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  
<style>
.backimg{
background:url("image/op.jpg");
background-repeat: no-repeat;
height:50vh;
width:100%;
background-size:cover;
}
#imgCard{
	width:150px;
	height:200px;
}
.crd-ho:hover{
background-color:#fcf7f7;
}
</style>
<%@include file="/all-component/all-css.jsp" %>
</head>
<body class="bg-light">



 <!---- NavBar-->
<%@include file="/all-component/Navbar.jsp" %>
     
     <div class="container-fluid backimg">
        <h2 class="text-center text-white pt-5"> Ebook System Management</h2>
     </div>  
     
     
 <!---- Start  Recent book--->
 
 
<div class="container">
        <h3 class="text-center pt-5">Recent Book</h3>

       <div class="row">
            <div class="col-md-3">
                <div class="card text-center crd-ho">
                    <div class="card-body">
                        <img class="img-thumbnail" id="imgCard" alt="book" src="image/jk.jpg">
                        <p>Programming java</p>
                        <p>Wiley</p>
                        <p>Categorie New</p>
                        <div class=" d-flex justify-content-center">
                            <a href="#" class="btn btn-danger btn-sm "><i class="fa-solid fa-cart-plus"></i>Add to Cart</a>
                            <a href="#" class="btn btn-success btn-sm ml-1">View Details</a>
                            <a href="#" class="btn btn-danger btn-sm ml-1">299dh</a>
                        </div>
                    </div>
                </div>
            </div>
            
            
            
            
            <div class="col-md-3">
                <div class="card text-center crd-ho">
                    <div class="card-body">
                        <img class="img-thumbnail" id="imgCard" alt="book" src="image/jk.jpg">
                        <p>Programming java</p>
                        <p>Wiley</p>
                        <p>Categorie New</p>
                        <div class=" d-flex justify-content-center">
                            <a href="#" class="btn btn-danger btn-sm ">Add to Cart</a>
                            <a href="#" class="btn btn-success btn-sm ml-1">View Details</a>
                            <a href="#" class="btn btn-danger btn-sm ml-1">299dh</a>
                        </div>
                    </div>
                </div>
            </div>
            
            
            
            
            
            
            <div class="col-md-3">
                <div class="card text-center crd-ho">
                    <div class="card-body">
                        <img class="img-thumbnail" id="imgCard" alt="book" src="image/jk.jpg">
                        <p>Programming java</p>
                        <p>Wiley</p>
                        <p>Categorie New</p>
                        <div class=" d-flex justify-content-center">
                            <a href="#" class="btn btn-danger btn-sm ">Add to Cart</a>
                            <a href="#" class="btn btn-success btn-sm ml-1">View Details</a>
                            <a href="#" class="btn btn-danger btn-sm ml-1">299dh</a>
                        </div>
                    </div>
                </div>
            </div>
            
            
            
            
            
            
            
            <div class="col-md-3">
                <div class="card text-center crd-ho">
                    <div class="card-body">
                        <img class="img-thumbnail" id="imgCard" alt="book" src="image/jk.jpg">
                        <p>Programming java</p>
                        <p>Wiley</p>
                        <p>Categorie New</p>
                        <div class=" d-flex justify-content-center">
                            <a href="#" class="btn btn-danger btn-sm ">Add to Cart</a>
                            <a href="#" class="btn btn-success btn-sm ml-1">View Details</a>
                            <a href="#" class="btn btn-danger btn-sm ml-1">299dh</a>
                        </div>
                    </div>
                </div>
            </div>
            
            
        </div>
        
        <div class="text-center mt-5">
         <a href="" class="btn btn-danger btn-sm ">View All</a>
        </div>
    </div>
    
 <!---- End  Recent book--->
 
 
 
 <hr>
 
 
 
 
 
 
 
 
 
      
 <!---- Start  New book--->
 
 
<div class="container">
        <h3 class="text-center pt-5">New Book</h3>

       <div class="row">
            <div class="col-md-3">
                <div class="card text-center crd-ho">
                    <div class="card-body">
                        <img class="img-thumbnail" id="imgCard" alt="book" src="image/jk.jpg">
                        <p>Programming java</p>
                        <p>Wiley</p>
                        <p>Categorie New</p>
                        <div class=" d-flex justify-content-center">
                            <a href="#" class="btn btn-danger btn-sm ">Add to Cart</a>
                            <a href="#" class="btn btn-success btn-sm ml-1">View Details</a>
                            <a href="#" class="btn btn-danger btn-sm ml-1">299dh</a>
                        </div>
                    </div>
                </div>
            </div>
            
            
            
            
            <div class="col-md-3">
                <div class="card text-center crd-ho">
                    <div class="card-body">
                        <img class="img-thumbnail" id="imgCard" alt="book" src="image/jk.jpg">
                        <p>Programming java</p>
                        <p>Wiley</p>
                        <p>Categorie New</p>
                        <div class=" d-flex justify-content-center">
                            <a href="#" class="btn btn-danger btn-sm ">Add to Cart</a>
                            <a href="#" class="btn btn-success btn-sm ml-1">View Details</a>
                            <a href="#" class="btn btn-danger btn-sm ml-1">299dh</a>
                        </div>
                    </div>
                </div>
            </div>
            
            
            
            
            
            
            <div class="col-md-3">
                <div class="card text-center crd-ho">
                    <div class="card-body">
                        <img class="img-thumbnail" id="imgCard" alt="book" src="image/jk.jpg">
                        <p>Programming java</p>
                        <p>Wiley</p>
                        <p>Categorie New</p>
                        <div class=" d-flex justify-content-center">
                            <a href="#" class="btn btn-danger btn-sm ">Add to Cart</a>
                            <a href="#" class="btn btn-success btn-sm ml-1">View Details</a>
                            <a href="#" class="btn btn-danger btn-sm ml-1">299dh</a>
                        </div>
                    </div>
                </div>
            </div>
            
            
            
            
            
            
            
            <div class="col-md-3">
                <div class="card text-center crd-ho">
                    <div class="card-body">
                        <img class="img-thumbnail" id="imgCard" alt="book" src="image/jk.jpg">
                        <p>Programming java</p>
                        <p>Wiley</p>
                        <p>Categorie New</p>
                        <div class=" d-flex justify-content-center">
                            <a href="#" class="btn btn-danger btn-sm ">Add to Cart</a>
                            <a href="#" class="btn btn-success btn-sm ml-1">View Details</a>
                            <a href="#" class="btn btn-danger btn-sm ml-1">299dh</a>
                        </div>
                    </div>
                </div>
            </div>
            
            
        </div>
        
        <div class="text-center mt-5">
         <a href="" class="btn btn-danger btn-sm ">View All</a>
        </div>
    </div>
    
 <!---- End  New book--->
 
 
 <hr>
 
 
 
      
 <!---- Start  Old book--->
 
 
<div class="container">
        <h3 class="text-center pt-5">Old Book</h3>

       <div class="row">
            <div class="col-md-3">
                <div class="card text-center crd-ho">
                    <div class="card-body">
                        <img class="img-thumbnail" id="imgCard" alt="book" src="image/jk.jpg">
                        <p>Programming java</p>
                        <p>Wiley</p>
                        <p>Categorie New</p>
                        <div class=" d-flex justify-content-center">
                            <a href="#" class="btn btn-success btn-sm ml-5">View Details</a>
                            <a href="#" class="btn btn-danger btn-sm ml-1">299dh</a>
                        </div>
                    </div>
                </div>
            </div>
            
            
            
            
            <div class="col-md-3">
                <div class="card text-center crd-ho">
                    <div class="card-body">
                        <img class="img-thumbnail" id="imgCard" alt="book" src="image/jk.jpg">
                        <p>Programming java</p>
                        <p>Wiley</p>
                        <p>Categorie New</p>
                        <div class=" d-flex justify-content-center">
                            <a href="#" class="btn btn-success btn-sm ml-5">View Details</a>
                            <a href="#" class="btn btn-danger btn-sm ml-1">299dh</a>
                        </div>
                    </div>
                </div>
            </div>
            
            
            
            
            
            
            <div class="col-md-3">
                <div class="card text-center crd-ho">
                    <div class="card-body">
                        <img class="img-thumbnail" id="imgCard" alt="book" src="image/jk.jpg">
                        <p>Programming java</p>
                        <p>Wiley</p>
                        <p>Categorie New</p>
                        <div class=" d-flex justify-content-center">
                            <a href="#" class="btn btn-success btn-sm ml-5">View Details</a>
                            <a href="#" class="btn btn-danger btn-sm ml-1">299dh</a>
                        </div>
                    </div>
                </div>
            </div>
            
            
            
            
            
            
            
            <div class="col-md-3">
                <div class="card text-center crd-ho">
                    <div class="card-body">
                        <img class="img-thumbnail" id="imgCard" alt="book" src="image/jk.jpg">
                        <p>Programming java</p>
                        <p>Wiley</p>
                        <p>Categorie New</p>
                        <div class=" d-flex justify-content-center">
                            <a href="#" class="btn btn-success btn-sm ml-5">View Details</a>
                            <a href="#" class="btn btn-danger btn-sm ml-1">299dh</a>
                        </div>
                    </div>
                </div>
            </div>
            
            
        </div>
        
        <div class="text-center mt-5">
         <a href="" class="btn btn-danger btn-sm ">View All</a>
        </div>
    </div>
    
 <!---- End  Old book--->
 
 
 
 <hr>
 
 
 
 
 
 
 
 
 
 
 <!---- Footer-->
 
 
<%@include file="/all-component/footer.jsp" %>
 

</body>
</html>
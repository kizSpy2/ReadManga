<%-- 
    Document   : checkCode
    Created on : Oct 26, 2022, 1:05:02 AM
    Author     : ducan
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DAL.*" %>
<%@page import="Models.*" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/main.css" rel="stylesheet">
        <!--<link href="CSS/home.css" rel="stylesheet">-->
        <!--        <link rel="stylesheet" href="CSS/bootstrap.min.css">-->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.10.2/css/all.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
        <title>Add Chapter</title>
    </head>
    <body>
        <%DAO dao = (DAO)request.getAttribute("dao");%>
        <!-- start navbar -->
        <nav class="navbar navbar-expand-lg navbar-light shadow py-2 py-sm-0">
            <a class="navbar-brand" href="http://localhost:8080/ReadManga/LoadDB">
                <img src="image/logo.png" height="90" width="160" >
            </a>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <div class="container-fluid">
                    <div class="row py-3">
                        <div class="col-lg-6 col-sm-12 mb-3 mb-sm-0">
                            <ul class="navbar-nav mr-auto">
                                <!-- always use single word for li -->
                                <li class="nav-item active">
                                    <a class="nav-link" href="http://localhost:8080/ReadManga/LoadDB">Home<span class="sr-only">(current)</span></a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#">New</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#">Populer</a>
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        Browse
                                    </a>

                                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                        <% 
                                            for (Map.Entry<Integer, Category> entry : dao.getCategory().entrySet()) {
                                            Integer key = entry.getKey();
                                            Category val = entry.getValue();%>
                                        <a class="dropdown-item" href="http://localhost:8080/ReadManga/Search?theloai=<%=val.getCategory_name()%>"><%=val.getCategory_name()%></a>
                                        <%}%>
                                        <div class="dropdown-divider"></div>
                                        <a class="dropdown-item" href="#">Something else here</a>
                                    </div>

                                </li>
                            </ul>
                        </div>
                        <div class="col">
                            <form class="form-inline search">
                                <div class="input-group">
                                    <input type="text" class="form-control" placeholder="Type Title, auther or genre"
                                           aria-label="Type Title, auther or genre">
                                    <div class="input-group-append">
                                        <button class="btn btn-outline-secondary" type="button"><i
                                                class="fa fa-search"></i></button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <div class="profile float-right">
                <div class="saved">
                    <button class="btn" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true"
                            aria-expanded="false">
                        <i class="fa fa-bookmark fa-2x"></i>
                    </button>
                    <!--                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="dropdownMenuButton">
                                            <a class="dropdown-item" href="#">
                                                <div class="row">
                                                    <div class="col"><img src="img/cover1.jpg" width="50"></div>
                                                    <div class="col">
                                                        <h5>One piece 1</h5>
                                                        <small>Lastest <span>VOL. 11</span></small>
                                                    </div>
                                                </div>
                                            </a>
                                            <a class="dropdown-item" href="#">
                                                <div class="row">
                                                    <div class="col"><img src="img/cover1.jpg" width="50"></div>
                                                    <div class="col">
                                                        <h5>One piece 1</h5>
                                                        <small>Lastest <span>VOL. 11</span></small>
                                                    </div>
                                                </div>
                                            </a>
                                            <hr>
                                            <a class="dropdown-item" href="#">View all saved mangas (14)</a>
                                        </div>-->
                </div>
                <div class="account">
                    <button class="btn" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true"
                            aria-expanded="false">
                        <i class="fa fa-user-circle fa-2x"></i><i class="fa fa-angle-down"></i>
                    </button>
                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="dropdownMenuButton">
                        <a class="dropdown-item" href="#">My account</a>
                        <a class="dropdown-item" href="#">logout</a>
                    </div>
                </div>
            </div>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
        </nav>
        <nav>
            <h1>Vui long nhap ma xac nhan o day</h1><!-- comment -->
            <form action="Login" method="post">
                Ma xac nhan: <input type="text" name="code"><br/><!-- comment -->
                <input type="submit" value="Submit">
            </form>
        </nav>
        <script src="js/jquery-3.4.1.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
                integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/main.js"></script>   
    </body>
</html>

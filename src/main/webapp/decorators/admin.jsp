<%--
  Created by IntelliJ IDEA.
  User: Hieu
  Date: 23/07/2023
  Time: 11:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp" %>

<html>
<head>
    <title>admin home</title>
    <!-- Custom fonts for this template-->
    <link href="<c:url value="/template/admin/vendor/fontawesome-free/css/all.min.css"/>" rel="stylesheet" type="text/css">
    <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="<c:url value="/template/admin/css/sb-admin-2.min.css"/>" rel="stylesheet" type="text/css">
</head>
<body id="page-top">
<!-- Page Wrapper -->
<div id="wrapper">
    <%@include file="/common/admin/sidebar.jsp" %>
        <div id="content-wrapper" class="d-flex flex-column">
            <!-- Main Content -->
            <div id="content">
                <%@include file="/common/admin/header.jsp" %>
                <dec:body />
            </div>
        </div>
</div>



<!-- Bootstrap core JavaScript-->
<script src="<c:url value="/template/admin/vendor/jquery/jquery.min.js"/>"></script>
<script src="<c:url value="/template/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"/>"></script>

<!-- Core plugin JavaScript-->
<script src="<c:url value="/template/admin/vendor/jquery-easing/jquery.easing.min.js"/>"></script>

<!-- Custom scripts for all pages-->
<script src="<c:url value="/template/admin/js/sb-admin-2.min.js"/>"></script>

<!-- Page level plugins -->
<script src="<c:url value="/template/admin/vendor/chart.js/Chart.min.js"/>"></script>

<!-- Page level custom scripts -->
<script src="<c:url value="/template/admin/js/demo/chart-area-demo.js"/>"></script>
<script src="<c:url value="/template/admin/js/demo/chart-pie-demo.js"/>"></script>

</body>
</html>

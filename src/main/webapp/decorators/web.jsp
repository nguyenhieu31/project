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
    <title>Home</title>
    <!-- Favicon-->
    <link href="<c:url value="/template/web/assets/favicon.ico"/>" rel="icon" type="image/x-icon" />
    <!-- Bootstrap icons-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet" />
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="<c:url value="/template/web/css/styles.css"/>" rel="stylesheet"/>
</head>
<body>
    <%@include file="/common/web/header.jsp" %>
    <dec:body />
    <%@include file="/common/web/footer.jsp" %>
<!-- Bootstrap core JS-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<!-- Core theme JS-->
<script src="<c:url value="/template/web/js/scripts.js"/>"></script>
</body>
</html>

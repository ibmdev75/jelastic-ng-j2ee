<%@ page import="java.net.Inet4Address" %>
<html>
<head>
<script type="text/javascript" src="components/angular/angular.min.js"></script>
<script type="text/javascript" src="src/app.js"></script>

</head>
<body ng-app="jelasticApp">
<h2>Application NG J2EE Jelastic</h2>
adresse ip de l'application : <%=Inet4Address.getLocalHost().getHostAddress()%>
</body>
</html>

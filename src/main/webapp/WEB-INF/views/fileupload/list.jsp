<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>My Homepage</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link type="text/css" rel="stylesheet"
	href='<c:url value="/css/board.css" />' />
</head>
<body>
	<div id="container">

		<!-- header include -->
		<c:import url="/WEB-INF/views/includes/header.jsp">
			<c:param name="param1" value="value1" />
			<c:param name="param2" value="value2" />
		</c:import>

		<!-- navigation include -->
		<c:import url="/WEB-INF/views/includes/navigation.jsp" />

		<div id="wrapper">
			<div id="content">

				<!-- Content -->


				<c:forEach items="${list }" var="vo">
					<h3>${vo.no }</h3>
					<h3>${vo.originalName }</h3>
					<img src="<c:url value="/upload-images/${vo.saveName }" />"
						style="width: 100%; height: 100%;" />

				</c:forEach>

				<!-- /Content -->

			</div>
		</div>

		<!-- footer include -->
		<%@ include file="/WEB-INF/views/includes/footer.jsp"%>


	</div>
</body>
</html>

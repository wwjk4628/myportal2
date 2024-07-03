<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link type="text/css" rel="stylesheet"
	href='<c:url value="/css/guestbook.css" />' />
<meta charset="UTF-8">
<title>파일 업로드</title>
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
				<img src="<c:url value="/upload-images/${imgFilename }" />" style="width: 100%; height: 100%;" />
				</div>
		</div>

		<!-- footer include -->
		<%@ include file="/WEB-INF/views/includes/footer.jsp"%>


	</div>
</body>
</html>
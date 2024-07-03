<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link type="text/css" rel="stylesheet"
	href='<c:url value="/css/guestbook.css" />' />
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
				<h1>파일 업로드</h1>

				<form method="post" action="<c:url value="/fileupload/upload"/>"
					enctype="multipart/form-data">
					<label>File</label> <input type="file" name="file1" /> <input
						type="submit" value="upload" />
				</form>
				<form method="post" action="<c:url value="/fileupload/list"/>">
					<input type="submit" value="리스트">
				</form>
	
			</div>
		</div>

		<!-- footer include -->
		<%@ include file="/WEB-INF/views/includes/footer.jsp"%>


	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="navigation">
	<ul>
		<li><a href="<%=request.getContextPath()%>/">My Home</a></li>
		<li><a href="<%=request.getContextPath()%>/guestbook">방명록</a></li>
		<li><a href="<%=request.getContextPath()%>/board">게시판</a></li>
		<li><a href='<c:url value="/fileupload" />'>파일 업로드</a></li>
	</ul>
</div>
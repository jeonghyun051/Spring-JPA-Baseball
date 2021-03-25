<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<h1 style="text-align: center;">포지션별 선수 리스트</h1>
<div style="text-align: -webkit-center">
  <table border="5" style="text-align: center">
	<th>포지션</th>
	<th>롯데</th>
	<th>삼성</th>
	<th>기아</th>
	
	<c:forEach var="dto" items="${dto}">
	<tr><!-- 첫번째 줄 시작 -->
	    <td>${dto.position}</td>
	    <td>${dto.lot}</td>
	    <td>${dto.sam}</td>
	    <td>${dto.kia}</td>
	</tr><!-- 첫번째 줄 끝 -->
	</c:forEach>

    </table>
</div>
</body>
</html>
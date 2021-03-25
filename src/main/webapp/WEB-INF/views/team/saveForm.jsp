<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<h1>팀 등록 페이지</h1>

<div class="container">
	<form action="/team/save" method="post">
		<div>
			<!-- 팀명 -->
			<div>
				<span>팀명</span>
			</div>
			<input name="teamName" type="text" class="form-control" style="width: 50%" placeholder="팀명을 입력해주세요" required="required"> <br />
			<br />

			<!-- 구장명 -->
			<span>구장 이름</span>
		</div>
		<select name="stadium" required="required">
			<option value="">선택</option>
			<c:forEach var="stadiums" items="${stadiums}">
				<option value="${stadiums.id}">${stadiums.stadiumName}</option>
			</c:forEach>
		</select> <br/>
		<br/>

		<!-- 등록버튼 -->
		<div>
			<input type="submit" value="등록하기">
		</div>
		<div class="bottomText">
			이미 팀등록을 하셨나요? <a href="/team/list">TEAM LIST</a>
		</div>
	</form>
</div>
</body>
</html>
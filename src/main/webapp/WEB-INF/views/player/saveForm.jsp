<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<h1 style="text-align:center">선수 등록 페이지</h1>

<div class="container" style="text-align:center">
	<form action="/player/save" method="post">
		<div style="text-align:center">
		    <!-- 선수이름 -->
			<div>
				<span>선수 이름</span>
			</div>			
			<input name="name" type="text" class="form-control" style="width: 50%" placeholder="선수 이름을 입력해주세요" required="required">
			<br/>
			<br/>
			
			<!-- 포지션 -->
			<div>
				<span class="input-group-text">포지션</span>
			</div>
			<select name="position" required="required">
				<option value="">선택</option>
				<option value="1루수">1루수</option>
				<option value="2루수">2루수</option>
				<option value="3루수">3루수</option>
				<option value="좌익수">좌익수</option>
				<option value="우익수">우익수</option>
				<option value="중견수">중견수</option>
			</select>
			<br/>
			<br/>
			
			<!-- 팀이름 -->
			<div>
				<span class="input-group-text">팀 이름</span>
			</div>
			<select name="team" required="required">
				<option value="">선택</option>
				<c:forEach var="teams" items="${teams}">
					<option value="${teams.id}">${teams.teamName}</option>
				</c:forEach>
			</select>
		</div>
		<br/>
				
		<!-- 등록버튼 -->
		<div class="text-center">
			<input type="submit" value="등록하기">
		</div>
		<div class="bottomText">
		이미 선수등록을 하셨나요? <a href="/player/list">PLAYER LIST</a>
	</div>
	</form>
</div>
</body>
</html>
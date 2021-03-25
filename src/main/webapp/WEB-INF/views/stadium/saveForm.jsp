<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<h1 style="text-align:center">구단 등록 페이지</h1>

<div class="container" style="text-align:center">
	<form action="/stadium/save" method="post">
		<div>
		
			<!-- 구단 -->
			<div>
				<span class="input-group-text">구단명</span>
			</div>
			<input name="stadiumName" type="text" style="width: 50%" placeholder="구단명을 입력해주세요" required="required"> <br />
			<br />	
		</div>


		<!-- 등록버튼 -->
		<div class="text-center">
			<input type="submit" value="등록하기">
		</div>
		<div class="bottomText">
			이미 구단등록을 하셨나요? <a href="/stadium/list">STADIUM LIST</a>
		</div>
	</form>
</div>
</body>
</html>
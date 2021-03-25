<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<h1 style="text-align: center;">야구장 리스트</h1>

<div>
	<div
		style="background-color: white; display: flex; justify-content: space-around; margin-left: 7px; margin-right: 7px; font-size: 14px; /* font: 12px/1.5 &amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;quot;돋움&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;quot;, Dotum, &amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;quot;굴림&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;quot;, Gulim, Arial, NanumSquare, sans-serif; */ font: 12px/1.5&amp;amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; quot; 돋움 &amp;amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; quot; , Dotum , &amp;amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; quot; 굴림 &amp;amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; quot; , Gulim , Arial, NanumSquare, sans-serif; font-weight: bold;">

		<div>NO</div>
		<div style="width: 100px; align-content: center; text-align: center;">구장</div>
		<div style="">팀</div>
		<div>기타</div>
	</div>
	<div style="margin-left: 20px; margin-top: -6px;"></div>
	<br />

	<c:forEach var="stadiums" items="${stadiums}">
		<div id="stadium-${stadiums.id}"
			style="background-color: white; display: flex; justify-content: space-around; margin-left: 15px; margin-right: 7px; font-size: 14px;">

			<div>${stadiums.id}</div>
			<div style="width: 100px; align-content: center; text-align: center; margin-left: 30px">${stadiums.stadiumName}</div>
			<div style="">${stadiums.team.teamName}</div>
			<div>
				<button onClick="deleteById(${stadiums.id})">삭제</button>
			</div>
		</div>
		<div style="margin-left: 20px; margin-top: -6px;">
			<img alt="" src="">
		</div>
	</c:forEach>

</div>
<script>
function deleteById(id){

	 $.ajax({
         type: "DELETE",
         url: "/stadium/"+id,
      }).done(res=>{
         console.log(res);
         if(res.statusCode === 1){
            $("#stadium-"+id).remove();
            /* location.reload(); */
            /* location.href = "/player/list"; */
         }else{
            alert("삭제에 실패하였습니다.");
         }
      });
}

</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<h1 style="text-align: center;">팀 리스트</h1>

<div>
	<div
		style="background-color: white; display: flex; justify-content: space-around; margin-left: 7px; margin-right: 7px; font-size: 14px; /* font: 12px/1.5 &amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;quot;돋움&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;quot;, Dotum, &amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;quot;굴림&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;quot;, Gulim, Arial, NanumSquare, sans-serif; */ font: 12px/1.5&amp;amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; quot; 돋움 &amp;amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; quot; , Dotum , &amp;amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; quot; 굴림 &amp;amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; amp; quot; , Gulim , Arial, NanumSquare, sans-serif; font-weight: bold;">

		<div>NO</div>
		<div style="width: 100px; align-content: center; text-align: center;">팀이름</div>
		<div style="">구장</div>
		<div>기타</div>
	</div>
	<div style="margin-left: 20px; margin-top: -6px;"></div>
	<br />
	<c:forEach var="teams" items="${teams}">
		<div id="team-${teams.id}"
			style="background-color: white; display: flex; justify-content: space-around; margin-left: 15px; margin-right: 7px; font-size: 14px;">

			<div>${teams.id}</div>
			<div style="width: 100px; align-content: center; text-align: center; margin-left: 60px">${teams.teamName}</div>
			<div style="width: 100px; align-content: center; text-align: center;">${teams.stadium.stadiumName}</div>
			<div>
				<button onClick="deleteById(${teams.id})">삭제</button>
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
         url: "/team/"+id,
      }).done(res=>{
         console.log(res);
         if(res.statusCode === 1){
            $("#team-"+id).remove();
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
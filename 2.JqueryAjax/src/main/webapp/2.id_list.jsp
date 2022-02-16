<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js"
	type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function() {

		$('#b1').change(function() {
			var name = $("#b1 option:selected").val();
			var data = 'id=' + name;
			//alert(data);

			$.ajax({

				type : "POST",
				url : "/2.JqueryAjax/FindMemberController",
				//url:"welcome.jsp",    

				data : data,
				success : function(data) {
					//alert(data);
					m = $.parseJSON(data);
					$('div').html(m.id+"/"+m.address+"/"+m.name);
				}
			});
			
			
		});
	});
</script>

</head>
<body>
	<%-- 
		select option에 회원 id를 표현 
		option change 될 때 ajax 방식으로 서버에서 회원 정보를
		조회해 온다.(이름과 주소)
--%>

	<select id="b1">
		<option>-아이디-</option>
		<c:forEach var="list" items="${list }">
			<option value="${list.id }">${list.id }</option>
		</c:forEach>
	</select>
	<div></div>


</body>
</html>







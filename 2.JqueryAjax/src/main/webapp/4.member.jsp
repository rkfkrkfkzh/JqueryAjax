<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js"
	type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#btn1").click(function() {
			var id = $("#id").val();
			var data = "id="+id;
			$.ajax({

				type : "POST",
				url : "${pageContext.request.contextPath}/IdCheckController",
				//url:"welcome.jsp",    

				data : data,
				success : function(data) {
					var result = $.parseJSON(data);
					var str = "�ߺ��� ���̵�";
					if(result.flag){
						str = "��� ������ ���̵�";
					}
					$('#res').html(str);
				}
			});
		});
	});
</script>

</head>
<body>
	<form action ="<%=request.getContextPath()%>/RegisterController">
		���̵� : <input type="text" name="id" id="id"">
		<input type="button" value="�ߺ�üũ" id="btn1">
		<span id="res"></span><br> 
		�н����� : <input type="password" name="password"><br> 
		�� �� : <input type="text" 	name="name"><br> 
		�� �� : <input type="text" name="address"><br>
		<input type="submit" value="ȸ�� ����">
	</form>
</body>
</html>
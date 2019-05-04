<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List,beans.Mensaje"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta http-equiv="cache-control" content="max-age=0" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="expires" content="Tue, 01 Jan 1980 1:00:00 GMT" />
<meta http-equiv="pragma" content="no-cache" />
<script type="text/javascript">
	function activar(){
		window.setInterval(function(){
			window.location.replace("principal.jsp");			
		},2000);
	}

</script>
</head>
<body onload="activar();">
	<center>
		<form action="Grabar" method="post">
			mensaje:<textarea rows="5" cols="40" name="texto" placeholder="escribe mensaje">
			
			</textarea>
			<br/><br/>
			<button type="submit">Enviar</button>
		</form>
		<br/><br/>
		<%List<Mensaje> mensajes=(List<Mensaje>)application.getAttribute("mensajes");
		if(mensajes!=null){
			for(Mensaje m:mensajes){%>
				<p>
					ip:<%=m.getIp() %>&nbsp;&nbsp;&nbsp;<%=m.getTexto()%>
				</p>
		<%} 
		}%>
		
	</center>
</body>
</html>
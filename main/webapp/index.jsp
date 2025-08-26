<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<style type="text/css">
	body{
		margin: 0;
		padding: 0;
	}
	#top{
		background-color: black;
		color: fuchsia;
		left: 0;
		width: 100vw;
		height: 15vh;
		float: left;
	}
	#main{
		background-color: gray;
		color: fuchsia;
		width: 100vw;
		height: 70vh;
		float: left;
	}
	#left{
		background-color: yellow;
		color:  blue;
		width:  50vw;
		height: 70vh;
		float:  left;
		overflow: auto;
	}
	#right{
		background-color: green;
		color: black;
		width:  50vw;
		height: 70vh;
		float:  left;
	}
	#foot{
		background-color: red;
		color: white;
		left: 0;
		width: 100vw;
		height: 15vh;
		float: left;
	}
</style>

</head>
<body>
<div id="top">Conteúdo de Topo</div>
<div id="main">	
	<div id="left">
		Conteúdo da Esquerda
		<hr><hr><hr><hr><hr><hr><hr><hr><hr><hr><hr><hr><hr><hr>
		<hr><hr><hr><hr><hr><hr><hr><hr><hr><hr><hr><hr><hr><hr>
		<hr><hr><hr><hr><hr><hr><hr><hr><hr><hr><hr><hr><hr><hr>
		<hr><hr><hr><hr><hr><hr><hr><hr><hr><hr><hr><hr><hr><hr>
		<hr><hr><hr><hr><hr><hr><hr><hr><hr><hr><hr><hr><hr><hr>
	</div>
	<div id="right">
		Conteúdo da Direita
	
	</div>
</div>
<div id="foot">Conteúdo da Base</div>

<script type="text/javascript">
	$(document).ready( function() {
		$("#top").load("topo.jsp");
		$("#left").load("esquerda.jsp");
		$("#right").load("direita.jsp");
		$("#foot").load("foot.jsp");
	});

</script>
</body>
</html>
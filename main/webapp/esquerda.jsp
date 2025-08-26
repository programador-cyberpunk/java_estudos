<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
aqui vai aparecer o conteúdo da Esquerda

<button id="btnAbrirQualquerCoisa"> Abrir </button>

<script type="text/javascript">
$(document).ready( function() {
	$("#btnAbrirQualquerCoisa").click(function() {
		$("#right").load("outracoisa.jsp");		
	});
});

</script>


</script>
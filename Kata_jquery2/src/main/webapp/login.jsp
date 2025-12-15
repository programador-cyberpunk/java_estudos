<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Seguro</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
</head>
<body class="bg-light d-flex align-items-center justify-content-center" style="height: 100vh;">

    <div class="card shadow p-4" style="width: 400px;">
        <h3 class="text-center mb-4">Acesso ao Sistema</h3>

        <form id="form-login">
            <input type="hidden" name="acao" value="login">
            <div class="mb-3">
                <label>Email</label>
                <input type="email" name="email" class="form-control" value="admin@loja.com" required>
            </div>
            <div class="mb-3">
                <label>Senha</label>
                <input type="password" name="senha" class="form-control" value="123" required>
            </div>
            <button type="submit" class="btn btn-primary w-100">Entrar</button>
        </form>

        <form id="form-token" style="display:none;">
            <input type="hidden" name="acao" value="validar">
            <div class="alert alert-info text-center">
                Verifique seu e-mail e digite o código abaixo.
            </div>
            <div class="mb-3">
                <input type="text" name="token" class="form-control text-center fs-4" placeholder="000000" maxlength="6" required>
            </div>
            <button type="submit" class="btn btn-success w-100">Validar Código</button>
        </form>

        <div id="msg-erro" class="mt-3 text-center text-danger fw-bold"></div>
    </div>

<script>
$(document).ready(function() {
    
    // --- 1. Enviar Login ---
    $('#form-login').submit(function(e) {
        e.preventDefault(); // Impede a página de recarregar
        $('#msg-erro').text("Processando...");
        
        $.ajax({
            url: 'auth', // Nome definido no @WebServlet do Java
            method: 'POST',
            data: $(this).serialize(), // Pega email e senha
            dataType: 'json',
            success: function(retorno) {
                // Se o Java disser que precisa de 2FA
                if (retorno.status === '2fa_required') {
                    $('#form-login').slideUp(); // Esconde login
                    $('#form-token').slideDown(); // Mostra campo do token
                    $('#msg-erro').text("");
                }
            },
            error: function(xhr) {
                // Se der erro (ex: senha errada)
                let msg = xhr.responseJSON ? xhr.responseJSON.msg : "Erro no servidor.";
                $('#msg-erro').text(msg);
            }
        });
    });

    // --- 2. Enviar Token ---
    $('#form-token').submit(function(e) {
        e.preventDefault();
        $('#msg-erro').text("Validando...");

        $.ajax({
            url: 'auth',
            method: 'POST',
            data: $(this).serialize(), // Pega o token
            dataType: 'json',
            success: function(retorno) {
                // Se o token estiver certo
                if (retorno.status === 'ok') {
                    window.location.href = retorno.redirect; // Manda para home.jsp
                }
            },
            error: function(xhr) {
                let msg = xhr.responseJSON ? xhr.responseJSON.msg : "Token inválido.";
                $('#msg-erro').text(msg);
            }
        });
    });

});
</script>

</body>
</html>
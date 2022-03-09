<?php
    $email = $_POST["email"] ?? "";
    $senha = $_POST["senha"] ?? "";
    
    
    function carregaString($arquivo)
    {
    $arq = fopen($arquivo, "r");
    $string = fgets($arq);
    fclose($arq);
    return $string;
    }

    $emailValidacao = carregaString("email.txt");
    $senhaValidacao = carregaString("senhaHash.txt");



    if ($email == $emailValidacao && password_verify($senha,$senhaValidacao)) {
        header("Location: conclusao.html");
        exit();
    } else {
        header("Location: ex5.html");
        exit();
    }
    

?>
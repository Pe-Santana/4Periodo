<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>exercicio3</title>
</head>
<body>
    <div><h1>Cadastro Efetuado com Sucesso!</h1></div>
<?php

$email = $_POST["email"];
$senha = $_POST["senha"];
function salvaString($string, $arquivo)
{
 $arq = fopen($arquivo, "w");
 fwrite($arq, $string);
 fclose($arq);
}

salvaString($email,"email.txt");

salvaString(password_hash($senha,PASSWORD_DEFAULT),"senhaHash.txt");

?>
</body>
</html>
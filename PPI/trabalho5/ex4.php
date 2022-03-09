<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">


    <title>exercicio4</title>
</head>
<body>
    <div class="container">
        <table class="table table-striped table-hover">
            <tr>
                <th>E-mail</th>
                <th>Senha</th>

            </tr>
    <?php
       function carregaString($arquivo)
       {
            $arq = fopen($arquivo, "r");
            $string = fgets($arq);
            fclose($arq);
            return $string;
       }


       $email = htmlspecialchars(carregaString("email.txt"));
       $senha = htmlspecialchars(carregaString("senhaHash.txt"));

       echo <<<HTML
            <tr>
                <td>$email</td>
                <td>$senha</td>
            </tr>
        HTML;
    ?>
        </table>
    </div>

</body>
</html>
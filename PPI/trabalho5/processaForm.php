<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

    <title>formulario</title>
    <style>
        td {
            border: solid 1px gray;
            padding: auto;
        }
    </style>
</head>

<body>
    <div class="container">


        <?php
            $cep = $_POST["cep"];
            $logradouro = $_POST["logradouro"];
            $bairro = $_POST["bairro"];
            $cidade = $_POST["cidade"];
            $estado = $_POST["estado"];

            $cep = htmlspecialchars($cep);
            $logradouro = htmlspecialchars($logradouro);
            $bairro = htmlspecialchars($bairro);
            $cidade = htmlspecialchars($cidade);
            $estado = htmlspecialchars($estado);
            
            echo <<<HTML
                
                <table>
                    <tr class="row mt-2">
                        <td class="col-md"> $cep </td>
                        <td class="col-md"> $logradouro </td>
                        <td class="col-md"> $bairro </td>
                        <td class="col-md"> $cidade </td>
                        <td class="col-md"> $estado </td>
                    </tr>
                </table>

            HTML;
        ?>
    </div>
    <!-- Bootstrap CSS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
    crossorigin="anonymous">
</script>

</body>
</html>
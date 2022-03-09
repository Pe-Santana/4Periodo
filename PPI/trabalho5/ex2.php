<!DOCTYPE html>
<html lang="pt-BR">
    <?php
    
    $produtos = array(
        0 =>  "Caneta",
        1 =>  "Lapis",
        2 =>  "Caderno",
        3 =>  "Apontador",
        4 =>  "Clipe",
        5 =>  "Pasta",
        6 =>  "Estilete",
        7 =>  "Tesoura",
        8 =>  "Papel",
        9 =>  "Borracha",
    );
    $descricoes = array(
        0 =>  "Usada para escrita permanente.",
        1 =>  "Usada para escrita temporarea.",
        2 =>  "Conjunto de folhas encadernadas.",
        3 =>  "Usado para apontar lapis.",
        4 =>  "Usado para juntar folhas.",
        5 =>  "Usado para guardar documentos.",
        6 =>  "Usado para cortar.",
        7 =>  "Usado para recortar papel.",
        8 =>  "Usado para registrar escritas.",
        9 =>  "Usado para apagar escrita feita a lapis.",
    );
    $qde = $_GET["qde"];

    ?>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">


    <title>exercicio2</title>
</head>
<body>
    <div class="container">
        <table class="table table-striped table-hover">
            <tr>
                <th>Numero</th>
                <th>Produto</th>
                <th>Descrição</th>
            </tr>
        <?php
            if ($qde != null) {
                for ($i=1; $i < $qde+1; $i++) { 
    
                    $a = rand(0,9);
                    echo <<<HTML

                        <tr>
                            <td>$i</td>
                            <td>$produtos[$a]</td>
                            <td>$descricoes[$a]</td>
                        </tr>

                    HTML;

                }

            }

        ?>

        </table>

    </div>

    <!-- Bootstrap CSS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
    crossorigin="anonymous">
    </script>
</body>
</html>
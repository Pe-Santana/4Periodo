<?php

require "../conexaoMysql.php";


class Especialista
{
  public $nome_medico;
  public $telefone_medico;


  function __construct($nome_medico, $telefone_medico)
  {
    $this->nome_medico = $nome_medico;
    $this->telefone_medico = $telefone_medico;
  }
}
$pdo = mysqlConnect();

$especialidade = $_GET["esp"] ?? "";


$sql = <<<SQL
  SELECT nome_medico, telefone_medico
  FROM medico
  WHERE especialidade_medico = ? 
  SQL;

  try {

  $stmt = $pdo->prepare($sql);
  $stmt->execute([$especialidade]);

    while ($row = $stmt->fetch()) {

      $resp [] = new Especialista($row['nome_medico'],$row['telefone_medico']);
    }
  
} 
catch (Exception $e) {
  exit('Falha inesperada: ' . $e->getMessage());
}

echo json_encode($resp);

?>
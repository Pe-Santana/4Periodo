<?php
require "../conexaoMysql.php";
$pdo = mysqlConnect();

$cep = $_GET['cep'] ?? '';
try {

  $sql = <<<SQL
  SELECT rua, bairro, cidade
  FROM exercicio2 WHERE cep = ?
  SQL;

  // Neste exemplo não é necessário utilizar prepared statements
  // porque não há possibilidade de injeção de SQL, 
  // pois nenhum parâmetro é utilizado na query SQL
  $stmt = $pdo->prepare($sql);
  $stmt->execute([$cep]);
} 
catch (Exception $e) {
  //error_log($e->getMessage(), 3, 'log.php');
  exit('Ocorreu uma falha: ' . $e->getMessage());
}
class Endereco
{
  public $rua;
  public $bairro;
  public $cidade;

  function __construct($rua, $bairro, $cidade)
  {
    $this->rua = $rua;
    $this->bairro = $bairro; 
    $this->cidade = $cidade;
  }
}
if ($row = $stmt->fetch()) {

  // Limpa os dados produzidos pelo usuário
  // com possibilidade de ataque XSS
  // antes de inserí-los na página HTML
  $rua = $row['rua'];
  $bairro = $row['bairro'];
  $cidade = $row['cidade'];
  
  $endereco = new Endereco($rua, $bairro, $cidade);

}

    
echo json_encode($endereco);
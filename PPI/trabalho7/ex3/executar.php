<?php

require "../conexaoMysql.php";

class RequestResponse
{
 public $success;
 public $destination;
 function __construct($success, $destination)
 {
 $this->success = $success;
 $this->destination = $destination;
 }
}
$pdo = mysqlConnect();

$email = $_POST["email"] ?? "";
$senha = $_POST["senha"] ?? "";

$sql = <<<SQL
  SELECT hash_senha
  FROM user
  WHERE email = ?
  SQL;

try {

  $stmt = $pdo->prepare($sql);
  $stmt->execute([$email]);
  $row = $stmt->fetch();

  if (!$row) {
    $resp = new RequestResponse(false, '');
  }
  elseif (password_verify($senha, $row['hash_senha'])) {
    $resp = new RequestResponse(true,'fazerLogin.html');
  }
  else {
    $resp = new RequestResponse(false, '');
  }
  
} 
catch (Exception $e) {
  exit('Falha inesperada: ' . $e->getMessage());
}

echo json_encode($resp);

?>
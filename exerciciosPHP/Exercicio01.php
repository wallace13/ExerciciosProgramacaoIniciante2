<?php
echo "Digite o da conta a ser paga no restaurante: ";
$pagar = fgets(STDIN); 

$valor = $pagar * (1+0.10);

echo "Valor com o acréscimo dos 10% da gorjeta do garçom R$".$valor;

?>
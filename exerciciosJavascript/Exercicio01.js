const prompt = require('prompt-sync')();
var pagar = prompt("Digite o da conta a ser paga no restaurante: ");

var valor = pagar * (1+0.10);

console.log("Valor em real: R$"+ valor);
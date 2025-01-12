package exerciciosJava;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o da conta a ser paga no restaurante: ");
        double pagar = scanner.nextDouble();

        double valor = (pagar*(1+0.10));
		System.out.println("Valor com o acréscimo dos 10% da gorjeta do garçom R$"+ valor);

        scanner.close();
	}
}

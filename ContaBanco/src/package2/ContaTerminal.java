package package2;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número da Conta");
		int numeroConta = sc.nextInt();
		System.out.println("Digite sua Agencia");
		String agencia = sc.next();
		System.out.println("Digite seu nome");
		String nomeCliente = sc.next();
		double saldo = 100.00;
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", sua conta conta " + numeroConta +" e seu saldo de R$" + saldo +" já está disponível para saque");
	
		sc.close();
	}

}
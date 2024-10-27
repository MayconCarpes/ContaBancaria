package view;

import model.Data;

import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        int number = sc.nextInt();

        System.out.println("Por favor, digite a numeracao da Agência !");
        String agency = sc.next();

        sc.nextLine(); // Consumir a quebra de linha deixada pelo `nextInt` ou `next`

        System.out.println("Por favor, digite o nome do cliente");
        String nameClient = sc.nextLine();

        System.out.println("Por favor, digite o saldo da conta!");
        double account = sc.nextDouble();

        System.out.println("Olá " + nameClient + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + number + " e seu saldo " + account + " já está disponível para saque");


    }
}
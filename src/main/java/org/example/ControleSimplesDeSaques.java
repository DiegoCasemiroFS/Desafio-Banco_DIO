package org.example;

import java.util.Scanner;

public class ControleSimplesDeSaques {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double limiteDiario = scanner.nextDouble();

// TODO: Crie um loop 'for' para iterar sobre os saques:
    for (double contador = 0; contador <= limiteDiario; contador++){

// TODO: Solicite ao usuário o valor do saque:
      double saque = scanner.nextDouble();

// TODO: Verifique se o valor do saque é zero, encerrando as transações:
// Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o limiteDiario;
      if(saque == 0) {
        System.out.println("Transacoes encerradas.");
        break;
// TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
      } else if (saque > limiteDiario) {
        System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
        break;
      } else {
      // TODO: Informe que o saque foi realizado e mostre o limite restante:
        double saldo = limiteDiario - saque;
        System.out.println("Saque realizado. Limite restante: " + saldo);
      }
}
// Fechamos o Scanner para evitar vazamento de recursos:
    scanner.close();
    }
}

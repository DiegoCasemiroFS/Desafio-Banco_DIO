package org.example;

import java.util.Scanner;

public class SimulacaoBancaria {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double saldo = 0;
    boolean encerrar = false;

    // Loop infinito para manter o programa em execução até que o usuário decida sair
    while (encerrar == false) {

      int opcao = scanner.nextInt();

      // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
      // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.

      switch (opcao){

        case 1 :{
          int valor = scanner.nextInt();

          saldo += valor;
          System.out.println("Saldo atual: " + saldo);

          break;
        }
        case 2 :{
          int valor = scanner.nextInt();

          if (valor > saldo){
            System.out.println("Saldo insuficiente.");

          } else {
            saldo -= valor;

            System.out.println("Saldo atual: " + saldo);
          }
          break;
        }
        case 3 :{
          System.out.println("Saldo atual: " + saldo);
          break;

        }
        case 0 :{
          encerrar = true;
          break;
        }

        // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
        default:
        System.out.println("Opção inválida. Tente novamente.");
      }
    }
    System.out.println("Programa encerrado.");
  }
}
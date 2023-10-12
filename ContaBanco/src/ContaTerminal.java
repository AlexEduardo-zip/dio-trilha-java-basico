/*
* Classe ContaTerminal
* Classe que representa a interface de terminal para o usuário
* @autor: AlexEduardo-zip
* @version: 1.0
* @since: 2021-03-10
*/

import java.util.Locale; // Importando a classe Locale para definir o padrão de localização do usuário
import java.util.Scanner; // Importando a classe Scanner para receber os dados do usuário

public class ContaTerminal {
    /**
     * Método main
     * Método que inicia a aplicação
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // Instanciando o objeto scanner para receber os
                                                                       // dados do usuário

        System.out.println("Por favor, digite o número da sua conta !"); // Solicitando o número da conta
        String conta = scanner.nextLine(); // Recebendo o número da conta

        System.out.println("Por favor, digite a Agência com o digito separado por traço [-] !"); // Solicitando a
                                                                                                 // agência
        String agencia = scanner.nextLine(); // Recebendo a agência

        System.out.println("Por favor, digite o seu nome completo !"); // Solicitando o nome do usuário
        String nome = scanner.nextLine(); // Recebendo o nome do usuário

        System.out.println("Por favor, digite o seu saldo"); // Solicitando o saldo do usuário
        double saldo = scanner.nextDouble(); // Recebendo o saldo do usuário

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "); // Exibindo
                                                                                                             // a
        System.out.println(agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque"); // mensagem
                                                                                                                       // de
                                                                                                                       // boas
                                                                                                                       // vindas

        scanner.close();
    }
}

import java.util.Scanner;

import static java.lang.Math.random;


public class ContaTerminal {
    public static void main(String[] args) {
        Integer numero;
        String agencia;
        String nome;
        Double saldo = 0.0;

        Scanner scan = new Scanner(System.in);

        numero = (int) (10000 + random() * 10000);

        System.out.print("Por favor ! Digite o número da Agência:");
        agencia = scan.next();

        System.out.print("Agora, digite seu nome:");
        nome = scan.next();

        System.out.print("Ok, qual valor deseja depositar ?:");
        saldo = scan.nextDouble();


        System.out.print("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta "+ numero +" e seu saldo R$"+ saldo +" já está disponível para saque !");
    }


}

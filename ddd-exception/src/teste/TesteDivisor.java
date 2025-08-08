package teste;

import model.Divisor;


import java.util.InputMismatchException;
import java.util.Scanner;
public class TesteDivisor {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Divisor divisor = new Divisor();

        try {


        System.out.println("Digite primeiro numero : ");
        divisor.setNumero1(leitor.nextInt());

        System.out.println("Digite segundo numero: ");
        divisor.setNumero2(leitor.nextInt());

        divisor.calcular();

        } catch (ArithmeticException e) {
            System.out.println("Nao e possivel dividirpor zero.");

            System.out.println("Digite segundo numero: ");
            divisor.setNumero2(leitor.nextInt());
            divisor.calcular();

        } catch (InputMismatchException e) {
            System.out.println("Entrada invalida, favor digitar um numero");


        } catch (RuntimeException e) {
            System.out.println("Erro insesperado");


        } finally {
            System.out.println("Obrigado por usar o nosso sistema");
        }

    }
}

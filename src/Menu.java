import java.util.Scanner;

public class Menu {
    /*    metodos */
    public void menuOperacao() {
        System.out.println("Digite o numero do que deseja fazer");

        System.out.println("1) Soma");
        System.out.println("2) Divisao ");
        System.out.println("3) Subtração  ");
        System.out.println("4) Multiplicação");
    }


    public String decisaoUsuario() {
        Scanner decisaoUsuario = new Scanner(System.in);

        String valorDecisao = decisaoUsuario.next();

        return valorDecisao;
    }

}

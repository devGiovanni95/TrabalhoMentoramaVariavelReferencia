import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Menu menu = new Menu();

        System.out.println("Digite um numero: ");
        Scanner valor = new Scanner(System.in);

        Integer n1 = valor.nextInt();

        System.out.println("Digite outro numero: ");
        Integer n2 = valor.nextInt();

        double numero1 = n1;
        double numero2 = n2;

        List<String> operacao = new ArrayList<String>();

        boolean continua = true;
        while (continua) {

                menu.menuOperacao();

                String valorDecisao = menu.decisaoUsuario();

                continua = false;

                switch (valorDecisao) {
                    case "1": {
                        System.out.println(numero1 + numero2);

                        break;
                    }

                    case "2": {
                        System.out.println(numero1 / numero2);

                        break;
                    }

                    case "3": {
                        System.out.println(numero1 - numero2);
                        break;
                    }

                    default: {
                        System.out.println("Opção invalida!!");
                        break;
                    }
                    case "4": {
                        System.out.println(numero1 * numero2);
                        break;

                    }

                }
            }
        }
    }


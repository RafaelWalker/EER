package EER;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Menu {

    Scanner teclado = new Scanner(System.in);

    public void menu() throws IOException {
        Eer eer = new Eer();

        int opcao;

        do {
            System.out.println("INFORME A OPÇÃO DO EER A CALCULAR!");
            System.out.println();
            System.out.println("|--------- Menu ---------|");
            System.out.println("| 1. Criança             |");
            System.out.println("| 2. Adolescente         |");
            System.out.println("| 3. Adultos / Idosos    |");
            System.out.println("| 4. Gestantes           |");
            System.out.println("| 5. Nutriz              |");
            System.out.println("| 6. Sair                |");
            System.out.println("|------------------------|");
            System.out.println();
            System.out.print("Informe a Opção: ");
            opcao = teclado.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    menu2();
                    break;
                case 6:
                    break;
            }

        } while (opcao != 6);
    }

    public void menu2() throws IOException {

        int opcao;

        do {
            System.out.println("INFORME O SEXO DO PACIÊNTE!");
            System.out.println();
            System.out.println("|----------- Menu -----------|");
            System.out.println("| 1. Homem                   |");
            System.out.println("| 2. Mulher                  |");
            System.out.println("| 3. Voltar Menu Principal   |");
            System.out.println("| 6. Sair                    |");
            System.out.println("|----------------------------|");
            System.out.println();
            System.out.print("Informe a Opção: ");
            opcao = teclado.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    adultoIdoso();
                    break;
                case 2:
                    adultoIdosa();
                    break;
                case 3:
                    menu();
                    break;
                case 6:
                    break;
            }

        } while (opcao != 6);
    }

    public void adultoIdoso() {
        System.out.print("Informe o IMC de Referência: ");
        double imcReferencia = teclado.nextDouble();
        double eutroficos;
        double tee;
        System.out.print("Informe o Peso: ");
        double peso = teclado.nextDouble();
        System.out.print("Informe a Altura: ");
        double altura = teclado.nextDouble();
        System.out.print("Informe a Idade: ");
        int idade = teclado.nextInt();
        System.out.println();
        System.out.println("Valores PA de Referência a Ultilizar:");
        System.out.println("PA= 1,00 (sedentário)");
        System.out.println("PA= 1,11 (pouco ativo)");
        System.out.println("PA= 1,25 (ativo)");
        System.out.println("PA= 1,48 (muito ativo)");
        System.out.println();
        System.out.print("Informe o PA: ");
        double pa = teclado.nextDouble();
        double imc = peso / (altura * altura);
        double pi = imcReferencia * altura * altura;
        eutroficos = 662 - (9.53 * idade) + pa * (15.91 * peso + 593.6 * altura);
        tee = 1086 - (10.1 * idade) + pa * (13.7 * peso + 416 * altura);
        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.printf("O IMC do Paciente é de: %.2f\n", imc);
        System.out.printf("O PI do Paciente é de: %.2f\n", pi);
        System.out.printf("O EER H Eutróficos do Paciente é de: %.2f\n", eutroficos);
        System.out.printf("O TEE H Sobr/Obes do Paciente é de: %.2f\n", tee);
        System.out.println("-----------------------------------------------------");
        System.out.println();

    }

    public void adultoIdosa() {
        System.out.print("Informe o IMC de Referência: ");
        double imcReferencia = teclado.nextDouble();
        double eutroficos;
        double tee;
        System.out.print("Informe o Peso: ");
        double peso = teclado.nextDouble();
        System.out.print("Informe a Altura: ");
        double altura = teclado.nextDouble();
        System.out.print("Informe a Idade: ");
        int idade = teclado.nextInt();
        System.out.println();
        System.out.println("Valores PA de Referência a Ultilizar:");
        System.out.println("PA= 1,00 (sedentário)");
        System.out.println("PA= 1,11 (pouco ativo)");
        System.out.println("PA= 1,25 (ativo)");
        System.out.println("PA= 1,48 (muito ativo)");
        System.out.println();
        System.out.print("Informe o PA: ");
        double pa = teclado.nextDouble();
        double imc = peso / (altura * altura);
        double pi = imcReferencia * altura * altura;
        eutroficos = 354 - (6.91 * idade) + pa * (9.36 * peso + 726 * altura);
        tee = 448 - (7.95 * idade) + pa * (11.4 * peso + 619 * altura);
        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.printf("O IMC do Paciente é de: %.2f\n", imc);
        System.out.printf("O PI do Paciente é de: %.2f\n", pi);
        System.out.printf("O EER H Eutróficos do Paciente é de: %.2f\n", eutroficos);
        System.out.printf("O TEE H Sobr/Obes do Paciente é de: %.2f\n", tee);
        System.out.println("-----------------------------------------------------");
        System.out.println();

    }
}

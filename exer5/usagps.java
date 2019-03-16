package exer5;

import java.util.Scanner;

import exer5.gps;

public class usagps {
    public void main(Scanner leitor) {
        boolean exec = true;
        gps Gps;
        System.out.println("Deseja iniciar o gps com idioma e rota definida?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        if (leitor.nextInt() == 1) {
            System.out.print("Digite o idioma desejado: ");
            String idioma = leitor.next();
            System.out.print("Digite a rota desejada: ");
            String rota = leitor.next();
            Gps = new gps(idioma, rota);
        } else {
            Gps = new gps();
        }
        while (exec) {
            System.out.println("Selecione uma opção");
            System.out.println("1 - Definir idioma do GPS");
            System.out.println("2 - Definir rota do GPS");
            System.out.println("3 - Mostrar informações Atuais do GPS");
            System.out.println("0 - Sair");
            switch (leitor.nextInt()) {
                case 1:
                    System.out.print("1 - Digite o novo idioma: ");
                    Gps.setIdioma(leitor.next());
                    break;
                case 2:
                    System.out.print("1 - Digite a nova rota: ");
                    Gps.setRota(leitor.next());
                    break;
                case 3:
                    Gps.mostrar();
                    break;
                case 0:
                    exec = false;
                    break;
            }
        }
    }
}
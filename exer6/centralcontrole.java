package exer6;

import java.util.Scanner;
import exer6.controlador;
public class centralcontrole {
    private controlador controladores = new controlador(555);
    public void menu(Scanner ler) {
        boolean exec = true;
        while (exec) {
            System.out.println("Selecione uma opção:");
            if (controladores.Ativo()) {
                System.out.println("1 - Desligar Sistema");
                System.out.println("2 - Verificar Sensores");
                System.out.println("3 - Ligar Sensor");
                System.out.println("4 - Desligar Sensor");
                System.out.println("5 - Testar Sensor");
            } else {
                System.out.println("1 - Ligar Sistema");
            }
            System.out.println("0 - Sair");
            int opcao = ler.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o código de segurança:");
                    if (controladores.verificarCodigo(ler.nextInt())){
                        if (controladores.AlarmeAtivado())
                            controladores.desativarAlarmes();
                        else
                            controladores.ligarSistema();
                    }
                    break;
                case 2:
                    if (controladores.Ativo())
                        controladores.mostrarStatusSensores();
                    else
                        System.out.println("Opção inválida");
                    break;
                case 3:
                    if (controladores.Ativo()){
                        controladores.mostrarSensoresDesligados();
                        System.out.print("Digite o código do sensor: ");
                        controladores.ligarSensor(ler.next());
                    } else {
                        System.out.println("Opção inválida");
                    }
                    break;
                case 4:
                    if (controladores.Ativo()){
                        controladores.mostrarSensoresLigados();
                        System.out.print("Digite o código do sensor: ");
                        controladores.desligarSensor(ler.next());
                    } else {
                        System.out.println("Opção inválida");
                    }
                    break;
                case 5:
                    if (controladores.Ativo()){
                        controladores.mostrarSensoresLigados();
                        System.out.print("Digite o código do sensor: ");
                        controladores.testarSensor(ler.next());
                    } else {
                        System.out.println("Opção inválida");
                    }
                    break;
                case 0:
                    exec = false;
                    break;
                default:
                    if (opcao != controladores.getCodSeguranca())
                        System.out.println("Opção inválida");
                    else
                        controladores.desativarAlarmes();
                    break;
            }
        }
    }
}
package exer7;
import java.util.Scanner;

public class exer7 {
    private static Scanner leitor;
	public static void main(String []args) {
	
		controleremoto c = new controleremoto();
		televisao t1 = new televisao();
		int opc;
		int x=0;
		int canal=0;
		while(x <= 10) {
            System.out.println("-------------- Menu ---------------");
            System.out.println("Digite 1 Para ligar tv.");
            System.out.println("Digite 2 Para desligar tv.");
            System.out.println("Digite 3 Para aumentar volume.");
            System.out.println("Digite 4 para diminuir volume.");
            System.out.println("Digite 5 para aumentar canal.");
            System.out.println("Digite 6 para diminuir canal.");
            System.out.println("Digite 7 para escolher canal.");
            System.out.println("Digite 8 para mostrar status.");
            System.out.println("Digite 9 para fechar o programa.");
            System.out.println("-------------- Menu ---------------");
            leitor = new Scanner(System.in);
            opc = leitor.nextInt();
            switch(opc) {
                case 1:
                    c.ligarTV(t1);
                break;
                case 2:
                    c.desligarTV(t1);
                break;   
                case 3:
                    c.aumentarVolume(t1);
                break;
                case 4:
                	c.diminuirVolume(t1);
                break;
                case 5:
                	c.aumentarCanal(t1);
                break;
                case 6:
                	c.diminuirCanal(t1);
                break;
                case 7:
					c.escolherCanal(t1, canal);
                break;
                case 8:
                	t1.mostrarStatus();
                break;	
                case 9:
                	System.out.println("Encerrando...");
                    System.exit(0);
                break;    
            }
        }
    }
	
}
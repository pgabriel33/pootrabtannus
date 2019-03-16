import exer4.bombagua;
import java.util.Scanner;
public class exer4{
public static void main(String []args) {
        bombagua b1 = new bombagua();
        boolean exec = true;
        Scanner leitor = new Scanner(System.in);
        while (exec) {
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Ligar a bomba");
            System.out.println("0 - Sair");
           
            int opcao = leitor.nextInt();
          
            switch (opcao){
                case 1:
                    System.out.print("Digite o tempo para a bomba ficar ligada em segundos:");
                    int segundo = leitor.nextInt();
                    b1.ligar(segundo);
                    break;
                case 0:
                    exec = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
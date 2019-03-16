package Exer2;
import java.util.Scanner;
import java.util.ArrayList;
public class exer2{
    private static Scanner ler;
	public static void main (String args[]) {
        int exec;
        int y = 0;
        ArrayList<pessoa> lista = new ArrayList<pessoa>();
        pessoa p1 = new pessoa();
        while(y <= 10) {
            System.out.println("-------------- Menu ---------------");
            System.out.println("Digite 1 Para cadastrar Pessoa.");
            System.out.println("Digite 2 Para Buscar uma Pessoa.");
            System.out.println("Digite 3 Para Mostrar todas as pessoas cadastradas.");
            System.out.println("Digite 0 para encerrar o programa.");
            ler = new Scanner(System.in);
            exec = ler.nextInt();
            switch(exec) {
                case 1:
                    p1 = p1.cadPessoa();
                    lista.add(p1);
                    System.out.println("Pessoa Cadastrada com Sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o numero do elemento ");
                    int x = ler.nextInt();
                    if(x < 0 || x > 10) {
                        System.out.println("Elemento nao existe !");
                    }
                    p1 = lista.get(x);
                    p1.Mostrar();
                    break;
                    
                case 3:
                    for(pessoa pessoas: lista) {
                        p1.Mostrar();
                    }
                break;
                
                case 0:
                	System.out.println("Encerrando...");
                    System.exit(0);
                break;    
            }
        }
    }
}
package exer8;

import java.util.Scanner;

public class numerocomplexo {
    private double parteReal, parteReal1, parteReal2;
    private double parteImaginaria, parteImaginaria1, parteImaginaria2;
    Scanner ler = new Scanner(System.in);
    public numerocomplexo(double parteReal1, double parteImaginaria1, 
            double parteReal2, double parteImaginaria2) {
        this.parteReal1 = parteReal1;
        this.parteImaginaria1 = parteImaginaria1;
        this.parteReal2 = parteReal2;
        this.parteImaginaria2 = parteImaginaria2;        
    }
    public numerocomplexo() {
        parteReal1 = 0.0;
        parteImaginaria1 = 0.0;
        parteReal2 = 0.0;
        parteImaginaria2 = 0.0;
    }
    public void inicializa(double parteReal,double parteImaginaria){
    	this.parteReal = parteReal;
    	this.parteImaginaria = parteImaginaria;
    }
    public void eIgual() {
        System.out.println("Digite a parte real do numero a verificado: ");
        double parteReal = ler.nextDouble();
        System.out.println("Digite a parte imaginária do numero a ser verificado: ");
        double parteImaginaria = ler.nextDouble();
        if (parteReal == parteImaginaria) {
            System.out.println("Os números complexos são iguais!");
        } else {
            System.out.println("Os números complexos não são iguais!");
        }
    }
    public void imprimenumero () {
        System.out.println(this.parteReal + " + (" + this.parteImaginaria + ")i");
    }
    public void adicao() {
        parteReal = parteReal1 + parteReal2;
        parteImaginaria = parteImaginaria1 + parteImaginaria2;
        System.out.printf("(%.1f + %.1fi) + (%.1f + %.1fi) = (%.1f + %.1fi)\n",
                parteReal1, parteImaginaria1, parteReal2, parteImaginaria2,
                parteReal, parteImaginaria);
    }
    public void subtracao() {
        parteReal = parteReal1 - parteReal2;
        parteImaginaria = parteImaginaria1 - parteImaginaria2;
        System.out.printf("(%.1f + %.1fi) - (%.1f + %.1fi) = (%.1f + %.1fi)\n",
                parteReal1, parteImaginaria1, parteReal2, parteImaginaria2,
                parteReal, parteImaginaria);
    }
    public void multiplicacao() {
    	parteReal = parteReal1 *parteReal2;
        parteImaginaria = parteImaginaria1 * parteImaginaria2;
        System.out.printf("(%.1f + %.1fi) * (%.1f + %.1fi) = (%.1f + %.1fi)\n",
                parteReal1, parteImaginaria1, parteReal2, parteImaginaria2,
                parteReal, parteImaginaria);
    }
    public void divisao() {
    	parteReal = parteReal1 /parteReal2;
        parteImaginaria = parteImaginaria1 / parteImaginaria2;
        System.out.printf("(%.1f + %.1fi) / (%.1f + %.1fi) = (%.1f + %.1fi)\n",
                parteReal1, parteImaginaria1, parteReal2, parteImaginaria2,
                parteReal, parteImaginaria);
    }
	
}

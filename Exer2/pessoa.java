package Exer2;
import java.util.Scanner;

public class pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    public String getName() {
        return nome;
    }
    public void setName(String name) {
        this.nome = name;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    Scanner ler = new Scanner(System.in);
    
    pessoa cadPessoa() {
        pessoa p1 = new pessoa();
        System.out.println("Digite o nome da pessoa: ");
        p1.nome = ler.next();
        System.out.println("Digite a idade da pessoa: ");
        p1.idade = ler.nextInt();
        System.out.println("Digite o sexo da pessoa: ");
        p1.sexo = ler.next();
        return p1;
    }
    
    void Mostrar() {
    	System.out.println("-------------------------------------------------------------");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Idade: "+ this.idade);
        System.out.println("Sexo: "+ this.sexo);
        System.out.println("-------------------------------------------------------------");
    }
}
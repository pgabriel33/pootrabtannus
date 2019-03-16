package Exer1;

public class estudante {
    String name;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double media;
    private String num_sala;
    
    public String getNum_sala() {
        return num_sala;
    }
    public void setNum_sala(String num_sala) {
        this.num_sala = num_sala;
    }

    double verificarMedia() {
        return this.media = (nota1 + nota2 + nota3 + nota4)/4;
    }
}
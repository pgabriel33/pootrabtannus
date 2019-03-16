package Exer1;
import javax.swing.JOptionPane;

public class exer1{

    public static void main (String args[]) {
        estudante est1 = new estudante();
        est1.name = JOptionPane.showInputDialog("digite o nome do aluno:");
        est1.setNum_sala(JOptionPane.showInputDialog("digite o numero da sala do aluno " + est1.name));  
        est1.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota de " + est1.name));
        est1.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota de " + est1.name));
        est1.nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota de " + est1.name));
        est1.nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota de " + est1.name));
        est1.verificarMedia();
        JOptionPane.showMessageDialog(null, "A média será de: " + est1.media);
    }

}
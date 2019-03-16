
package exer3;
import javax.swing.JOptionPane;

public class menu {
	
	contacorrente c1 = new contacorrente(); 
	
	public Integer Menu(){
		double saldo = c1.getSaldo();
		String menu = "[Saldo da conta: " + saldo +"]";
		menu += "\n[0] - Sair";
		menu += "\n[1] - Depositar.";
		menu += "\n[2] - Sacar";
		menu += "\n[ ------------------------- ]";
		menu += "\nInforme o numero da opção desejada:  ";
		String xOpcao = JOptionPane.showInputDialog(null,menu);
		c1.setSaldo(saldo); 
		return Integer.parseInt(xOpcao);
	}			
}
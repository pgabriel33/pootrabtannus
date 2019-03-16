package exer3;

import javax.swing.JOptionPane;

public class contacorrente {
	private int id;
	private double saldo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double efetuarDeposito() {
		String xvalor = JOptionPane.showInputDialog(null, "Digite o valor a ser depositado");
		return Double.parseDouble(xvalor);
	}
	
	public double efetuarSaque() {
		String xvalor = JOptionPane.showInputDialog(null, "Digite o valor a ser sacado");
		return Double.parseDouble(xvalor);
	}
	
	void depositar(double valor) {
		this.saldo = (saldo + valor);
	}
	
	void sacar(double valor) {
		if (valor <= this.saldo) {
			this.saldo = (saldo - valor);
		}else {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente");
		}
	}
		
}
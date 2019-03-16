package exer3;

import javax.swing.JOptionPane;
public class exer3 {
		public static void main(String[] args) {
			
			contacorrente c1 = new contacorrente();
			menu menu = new menu();
			
			Integer exe = 1;
			while(exe != 0){
				
				exe = menu.Menu();
				
				switch(exe){
				case 1:
					double deposito = c1.efetuarDeposito();
					c1.depositar(deposito);
					break;
				case 2:
					double saque = c1.efetuarSaque();
					c1.sacar(saque);
					break;
				case 0:
					JOptionPane.showMessageDialog(null,"[Programa encerrado!]");
					break;
				 default:
					 JOptionPane.showMessageDialog(null,"Opcao Invalida!");
					 break;
				}
				
				menu.c1.setSaldo(c1.getSaldo());
				
			}
			
		}
		
	}

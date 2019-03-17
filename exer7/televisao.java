package exer7;
public class televisao {
	
	private int volume;
	private int canal;
	private boolean status;
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void mostrarStatus() {
		if(this.status) {
			System.out.println("Status: Ligada");
			System.out.println("Volume: " + this.volume);
			System.out.println("Canal: " + this.canal);
		}else {
			System.out.println("Tv esta Desligada");
		}
	}
}
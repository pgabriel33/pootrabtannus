package exer4;

import java.util.Timer;
import java.util.TimerTask;

public class bombagua {
    private boolean status;
    Timer t1 = new Timer();

    public void ligar(int s) {
        System.out.println("Bomba da agua esta Ligada!");
        this.status = true;
        t1.schedule(new RemindTask(s),0, 1000);
        try { Thread.sleep ((s + 1)*1000); } catch (InterruptedException ex) {}
    }

    class RemindTask extends TimerTask {
        private int tempo;
        private int segundos;
        public RemindTask(int time) {
            this.tempo = time;
        }
        public void run() {
            if (this.segundos < this.tempo) {
                System.out.println("Em " + (this.tempo - this.segundos) + " segundos será desligada a bomba!");
                this.segundos = this.segundos + 1;
            } else {
                desligar();
                t1.cancel();
            }
        }
    }

    public void desligar() {
        System.out.println("Bomba da agua esta Desligada!");
        this.status = false;
    }
}
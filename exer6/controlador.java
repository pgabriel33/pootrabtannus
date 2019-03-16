package exer6;

import java.util.Timer;
import java.util.TimerTask;
import exer6.sensor;
public class controlador {
    private int codSeguranca;
    private boolean ativo = false;
    private boolean alarmeativado = false;
    private alarme sirene = new alarme("Sirene");
    private alarme campainha = new alarme("Campainha");
    private sensor[] sensores = new sensor[10];
    private Timer t1;

    public controlador(int codSeguranca) {
        this.codSeguranca = codSeguranca;
        for (int x = 0; x < 10; x++) {
            this.sensores[x] = new sensor ("sensor" + x);
        }
    }

    public int getCodSeguranca() {
        return codSeguranca;
    }

    public boolean Ativo() {
        return ativo;
    }

    public void ligarSistema() {
        this.t1 = new Timer();
        for (sensor sensor : this.sensores) {
            sensor.ligar();
        }
        this.ativo = true;
        TimerTask check = new TimerTask() {
            public void run() {
                verificarSensores();
            }
        };
        this.t1.schedule(check, 1000, 1000);
    }

    public void desligarSistema() {
        for (sensor sensor : this.sensores) {
            t1.cancel();
            sensor.desativar();
            if(sensor.Ativado())
                sensor.desligar();
        }
        this.ativo = false;
    }

    public boolean verificarCodigo(int cod) {
        return this.codSeguranca == cod;
    }

    public void ativarAlarmes(sensor sensor) {
        if(!this.alarmeativado) {
            this.alarmeativado = true;
            this.sirene.ativar();
            this.campainha.ativar();
            System.out.println("------------------------- Atenção -----------------------");
            System.out.println("Foi detectado presença na localização do: " + sensor.getCodigo());
            System.out.println("Digite o código de segurança para desativar!");
            System.out.println("---------------------------------------------------------");
        }
    }

    public void desativarAlarmes() {
        this.alarmeativado = false;
        this.sirene.desativar();
        this.campainha.desativar();
        for (sensor sensor : this.sensores) {
            sensor.desativar();
        }
    }

    public boolean AlarmeAtivado() {
        return alarmeativado;
    }

    public void verificarSensores() {
        for (sensor sensor : this.sensores) {
            if (sensor.Ligado() && sensor.Ativado()) {
                this.ativarAlarmes(sensor);
            }
        }
    }

    public void ligarSensor(String cod) {
        boolean sensorAtivo = false;
        for (sensor sensor : this.sensores) {
            if (sensor.getCodigo().equals(cod) && !sensor.Ligado()) {
                sensor.ligar();
                sensorAtivo = true;
            }
        }
        if (!sensorAtivo) {
            System.out.println("Código do sensor inválido!");
        }
    }

    public void desligarSensor(String cod) {
        boolean sensorDesativo = false;
        for (sensor sensor : this.sensores) {
            if (sensor.getCodigo().equals(cod) && sensor.Ligado()) {
                sensor.ligar();
                sensorDesativo = true;
            }
        }
        if (!sensorDesativo) {
            System.out.println("Código do sensor inválido!");
        }
    }

    public void testarSensor(String cod) {
        boolean sensorTestado = false;
        for (sensor sensor : this.sensores) {
            if (sensor.getCodigo().equals(cod) && sensor.Ligado()) {
                sensorTestado = true;
                sensor.ativar();
            }
        }
        if (!sensorTestado) {
            System.out.println("Código do sensor inválido!");
        }
    }

    public void mostrarStatusSensores() {
        System.out.println("Verificando Sensores...");
        for (sensor sensor : this.sensores) {
            System.out.println("Sensor - Código: " + sensor.getCodigo() + " - Status: " + (sensor.Ligado() ? "Ligado" : "Desligado") + " - " + (sensor.Ativado() ? " Ativado" : "Desativado"));
        }
    }

    public void mostrarSensoresLigados() {
        int num = 0;
        System.out.println("Sensores Ligados");
        for (sensor sensor : this.sensores) {
            if (sensor.Ligado()) {
                num++;
                System.out.println("Sensor - Código: " + sensor.getCodigo() + " - Status: " + (sensor.Ligado() ? "Ligado" : "Desligado") + " - " + (sensor.Ativado() ? " Ativado" : "Desativado"));
            }
        }
        if (num == 0) {
            System.out.println("Nenhum sensor está ligado!");
        }
    }

    public void mostrarSensoresDesligados() {
        int num = 0;
        System.out.println("Sensores Desligados");
        for (sensor sensor : this.sensores) {
            if (!sensor.Ligado()) {
                num++;
                System.out.println("Sensor - Código: " + sensor.getCodigo() + "-Status: " + (sensor.Ligado() ? "Ligado" : "Desligado") + " - " + (sensor.Ativado() ? " Ativado" : "Desativado"));
            }
        }
        if (num == 0) {
            System.out.println("Nenhum sensor está desligado!");
        }
    }
}
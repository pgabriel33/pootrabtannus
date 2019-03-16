package exer6;

public class sensor {
    private boolean ligado;
    private String codigo;
    private boolean ativado;

    public sensor(String codigo) {
        this.codigo = codigo;
        this.ativado = false;
        this.ligado = false;
    }

    public boolean Ligado() {
        return ligado;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean Ativado() {
        return ativado;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void ativar() {
        this.ativado = true;
    }

    public void desativar() {
        this.ativado = false;
    }
}
package exer6;

public class alarme {
    private String tipo;
    private boolean ativo;

    alarme(String tipo) {
        this.tipo = tipo;
    }

    public void ativar() {
        this.ativo = true;
    }

    public void desativar() {
        this.ativo = false;
    }
}
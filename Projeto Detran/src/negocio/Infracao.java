package negocio;

import java.util.Arrays;

public class Infracao {
    private String tipo;
    private int Valor;
    private int dataInfracao;
    private String local;
    private String status;
    private String id;
    private static Infracao[] infracoes  = new Infracao[0];


    public Infracao(String tipo, int valor, int dataInfracao, String local, String status, String id) {
        this.tipo = tipo;
        Valor = valor;
        this.dataInfracao = dataInfracao;
        this.local = local;
        this.status = status;
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int valor) {
        Valor = valor;
    }

    public int getDataInfracao() {
        return dataInfracao;
    }

    public void setDataInfracao(int dataInfracao) {
        this.dataInfracao = dataInfracao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static void adicionarInfracao(Infracao novaInfracao) {
        infracoes = Arrays.copyOf(infracoes, infracoes.length + 1);
        infracoes[infracoes.length - 1] = novaInfracao;
    }
}
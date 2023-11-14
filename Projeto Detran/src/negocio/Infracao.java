package negocio;

import java.util.Arrays;

public class Infracao {
    private String tipo;
    private int valor;
    private int dataInfracao;
    private String local;
    private String status;
    private String id;
    private static Infracao[] infracoes  = new Infracao[0];


    public Infracao(String tipo, int valor, int dataInfracao, String local, String status, String id) {
        this.tipo = tipo;
        this.valor = valor;
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
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
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

//    public static void adicionarInfracao(String[] dadosNovaInfracao) {
//
//        String tipo = dadosNovaInfracao[0].trim();
//        int valor = Integer.parseInt(dadosNovaInfracao[1].trim());
//        int dataInfracao = Integer.parseInt(dadosNovaInfracao[2].trim());
//        String local = dadosNovaInfracao[3].trim();
//        String status = dadosNovaInfracao[3].trim();
//        String id = dadosNovaInfracao[3].trim();
//
//
//        Infracao novaInfracao = new Infracao(tipo, valor, dataInfracao, local, status, id);
//
//        Infracao[] cadastroUsuario = new Infracao[infracoes.length + 1];
//        for (int i = 0; i < infracoes.length; i++) {
//            cadastroUsuario[i] = infracoes[i];
//        }
//        cadastroUsuario[infracoes.length] = novaInfracao;
//        infracoes = cadastroUsuario;
//
//        return novoUsuario;
//
//    }
}
package cnh;

import infracao.Infracao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class Cnh {

    private String categoria;
    private String ufEmissao;
    private String dataValidade;
    private String dataEmissao;
    private int pontuacao;
    private String status;
    private String numCnh;
    private List<Infracao> infracoes = new ArrayList<>();


    public Cnh(String categoria, String ufEmissao, String dataValidade, String dataEmissao, int pontuacao,
               String status, String numCnh, List<Infracao> infracoes) {
        this.categoria = categoria;
        this.ufEmissao = ufEmissao;
        this.dataValidade = dataValidade;
        this.dataEmissao = dataEmissao;
        this.pontuacao = pontuacao;
        this.status = status;
        this.numCnh = numCnh;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getUfEmissao() {
        return ufEmissao;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public String getStatus() {
        return status;
    }

    public String getNumCnh() {
        return numCnh;
    }

    public List<Infracao> getInfracoes() {
        return infracoes;
    }

    public void addInfracao(Infracao infracao) {
        this.infracoes.add(infracao);
    }
    public String obterDadosCnh(String categoria, String ufEmissao, String dataEmissao, String dataValidade,
                                int pontuacao, String status, String numCnh) {
        return "(" + categoria + ", " + ufEmissao + ", " + dataEmissao + ", " + dataValidade + pontuacao + status +
                numCnh + ")";
    }

    public void renovarCnh(String numCnh, String dataValidade) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dateValidade = sdf.parse(dataValidade);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateValidade);

        Date now = new Date();
        if (dateValidade.before(now)) {
            calendar.add(Calendar.YEAR, 10);
            dateValidade = calendar.getTime();
            dataValidade = sdf.format(dateValidade);
        }
    }
}

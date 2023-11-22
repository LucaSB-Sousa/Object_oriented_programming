package negocio;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Cnh {

    private String categoria;
    private String ufEmissao;
    private String dataValidade;
    private String dataEmissao;
    private double pontuacao;
    private String status;
    private String numCnh;

    public Cnh(String categoria, String ufEmissao, String dataValidade, String dataEmissao, double pontuacao,
               String status, String numCnh) {
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

    public double getPontuacao() {
        return pontuacao;
    }

    public String getStatus() {
        return status;
    }

    public String getNumCnh() {
        return numCnh;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
	public String toString() {
		return "Cnh [categoria=" + categoria + ", ufEmissao=" + ufEmissao + ", dataValidade=" + dataValidade
				+ ", dataEmissao=" + dataEmissao + ", pontuacao=" + pontuacao + ", status=" + status + ", numCnh="
				+ numCnh + "]";
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

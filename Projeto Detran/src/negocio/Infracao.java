package negocio;

public class Infracao {
    private String tipo;
    private double valor;
    private String dataInfracao;
    private String local;
    private static boolean status;
    private String id;
    private static Cnh cnh;
	public static int numInfracoes;

    public Infracao(String tipo, double valor, String dataInfracao, String local, boolean status, String id,Cnh cnh) {
        this.tipo = tipo;
        this.valor = valor;
        this.dataInfracao = dataInfracao;
        this.local = local;
        Infracao.status = status;
        this.id = id;
        Infracao.cnh = cnh;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDataInfracao() {
        return dataInfracao;
    }

    public void setDataInfracao(String dataInfracao) {
        this.dataInfracao = dataInfracao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public boolean getStatus() {
        return status;
    }

    public static void setStatus(boolean status) {
        Infracao.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

	public Cnh getCnh() {
		return cnh;
	}

	public void setCnh(Cnh cnh) {
		Infracao.cnh = cnh;
	}

	@Override
	public String toString() {
		return "Infracao [tipo=" + tipo + ", valor=" + valor + ", dataInfracao=" + dataInfracao + ", local=" + local
				+ ", status=" + status + ", id=" + id + ", cnh=" + cnh.getNumCnh() + "]";
	}

	
}
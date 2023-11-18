package negocio;

public class Infracao {
    private String tipo;
    private double valor;
    private String dataInfracao;
    private String local;
    private String status;
    private String id;
    private Cnh cnh;

    public Infracao(String tipo, double valor, String dataInfracao, String local, String status, String id,Cnh cnh) {
        this.tipo = tipo;
        this.valor = valor;
        this.dataInfracao = dataInfracao;
        this.local = local;
        this.status = status;
        this.id = id;
        this.cnh = cnh;
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

	public Cnh getCnh() {
		return cnh;
	}

	public void setCnh(Cnh cnh) {
		this.cnh = cnh;
	}

	@Override
	public String toString() {
		return "Infracao [tipo=" + tipo + ", valor=" + valor + ", dataInfracao=" + dataInfracao + ", local=" + local
				+ ", status=" + status + ", id=" + id + ", cnh=" + Cnh.getNumCnh() + "]";
	}

	
}
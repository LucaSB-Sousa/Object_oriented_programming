package negocio;

public class AutomoveisComEixo extends Veiculo {
	private int peso;
	private int nPassageiros;
	private String tipo;
	
	public AutomoveisComEixo(String modelo, String placa, String cor, int ano, String estado,
			String marca,int peso, int nPassageiros, String tipo) {
		
		super(modelo,placa,cor,ano,estado,marca);
		this.peso = peso;
		this.nPassageiros = nPassageiros;
		this.tipo = tipo;
	}

	//Gets	
	public int getPeso() {
		return peso;
	}

	public int getnPassageiros() {
		return nPassageiros;
	}

	public String getTipo() {
		return tipo;
	}

	//Sets
	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setnPassageiros(int nPassageiros) {
		this.nPassageiros = nPassageiros;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "AutomoveisComEixo [peso=" + peso + ", nPassageiros=" + nPassageiros + ", tipo=" + tipo + ", modelo="
				+ modelo + ", placa=" + placa + ", cor=" + cor + ", ano=" + ano + ", estado=" + estado + ", marca="
				+ marca + "]";
	}
	
	
}

package negocio;

public abstract class Veiculo {
	protected String modelo;
	protected String placa;
	protected String cor;
	protected int ano;
	protected String estado;
	protected String marca;
	
	public Veiculo(String modelo, String placa, String cor, int ano, String estado, String marca) {
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.ano = ano;
		this.estado = estado;
		this.marca = marca;
	}

	//Gets
	public String getModelo() {
		return modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public String getCor() {
		return cor;
	}

	public int getAno() {
		return ano;
	}

	public String getEstado() {
		return estado;
	}

	public String getMarca() {
		return marca;
	}

	
	//Sets
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String obterDadosVeiculo() {
		return "Veiculo [modelo=" + modelo + ", placa=" + placa + ", cor=" + cor + ", ano=" + ano + ", estado=" + estado
				+ ", marca=" + marca + "]";
	}
	
	
	
	
}

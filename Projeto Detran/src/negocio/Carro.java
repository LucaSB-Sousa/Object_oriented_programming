package negocio;

public class Carro extends Veiculo {
	private int peso;
	private int nPassageiros;
	
	public Carro(String modelo, String placa, String cor, int ano, String estado,
			String marca,int peso, int nPassageiros) {
		
		super(modelo,placa,cor,ano,estado,marca);
		this.peso = peso;
		this.nPassageiros = nPassageiros;
	}

	//Gets
	public int getPeso() {
		return peso;
	}

	public int getnPassageiros() {
		return nPassageiros;
	}

	//sets
	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setnPassageiros(int nPassageiros) {
		this.nPassageiros = nPassageiros;
	}

	@Override
	public String toString() {
		return "Carro [peso=" + peso + ", nPassageiros=" + nPassageiros + ", modelo=" + modelo + ", placa=" + placa
				+ ", cor=" + cor + ", ano=" + ano + ", estado=" + estado + ", marca=" + marca + "]";
	}
	
	
	
}

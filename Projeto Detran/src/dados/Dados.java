package dados;

import negocio.*;

public class Dados {
	private Usuario[] usuarios;
	private int nUsuarios = 0;
	private Cnh[] cnhs ;
	private int nCnhs = 0;
	private Infracao[] infracoes;
	private int nInfracoes;
	
	private Veiculo[] veiculos;
	private int nVeiculos = 0;
	private AutomoveisComEixo[] autosComEixo;
	private int nAutosComEixo;
	private Caminhao[] caminhoes;
	private int nCaminhoes;
	private Moto[] motos;
	private int nMotos;
	private Van[] vans;
	private int nVans;
	private Carro[] carros;
	private int nCarros;

	
	public Dados() {
		usuarios = new Usuario[100];
		cnhs = new Cnh[50];
		infracoes = new Infracao[100];
		veiculos = new Veiculo[50];
		autosComEixo = new AutomoveisComEixo[50];
		caminhoes = new Caminhao[50];
		motos = new Moto[50];
		carros = new Carro[50];
		vans = new Van[50];
	}
	
	public Usuario[] getUsuarios() {
		return usuarios;
	}
	
	public Usuario getUsuarios(int i) {
		return usuarios[i];
	}

	public String[] getNomeUsuarios() {
		String[] s = new String[nUsuarios];
		for(int i = 0; i < nUsuarios; i++) {
			s[i] = usuarios[i].getNome();
		}
		return s;
	}
	
	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}
	
	public void setAluno(int i, Usuario a) {
		usuarios[i] = a;
	}

	public int getnUsuarios() {
		return nUsuarios;
	}

	public void setnUsuarios(int nUsuarios) {
		this.nUsuarios = nUsuarios;
	}

	public Cnh[] getCnhs() {
		return cnhs;
	}
	
	public Cnh getCnhs(int i) {
		return cnhs[i];
	}

	public String[] getNumCnh() {
		String[] s = new String[nCnhs];
		for(int i = 0; i < nCnhs; i++) {
			s[i] = Cnh.getNumCnh();
		}
		return s;
	}


	public void setCnhs(Cnh[] cnhs) {
		this.cnhs = cnhs;
	}
	
	public void setCnh(int i, Cnh c) {
		cnhs[i] = c;
	}

	public int getnCnhs() {
		return nCnhs;
	}

	public void setnCnhs(int nCnhs) {
		this.nCnhs = nCnhs;
	}

	public Infracao[] getInfracoes() {
		return infracoes;
	}
	
	public Infracao getInfracoes(int i) {
		return infracoes[i];
	}

	public void setInfracoes(Infracao[] infracoes) {
		this.infracoes = infracoes;
	}
	
	public void setInfracoes(int i, Infracao inf) {
		infracoes[i] = inf;
	}

	public int getnInfracoes() {
		return nInfracoes;
	}
	
	public Veiculo[] getVeiculos() {
		return veiculos;
	}
	
	public Veiculo getVeiculos(int i) {
		return veiculos[i];
	}

	public void setVeiculo(Veiculo[] veiculos) {
		this.veiculos = veiculos;
	}
	
	public void setVeiculo(int i, Veiculo v) {
		veiculos[i] = v;
	}

	public int getnVeiculos() {
		return nVeiculos;
	}

	public void setnVeiculos(int nVeiculos) {
		this.nVeiculos = nVeiculos;
	}

	public AutomoveisComEixo[] getAutosComEixo() {
		return autosComEixo;
	}
	
	public AutomoveisComEixo getAutosComEixo(int i) {
		return autosComEixo[i];
	}

	public void setAutoComEixo(AutomoveisComEixo[] autosComEixo) {
		this.autosComEixo = autosComEixo;
	}
	
	public void setAutoComEixo(int i, AutomoveisComEixo a) {
		autosComEixo[i] = a;
	}

	public Caminhao[] getCaminhoes() {
		return caminhoes;
	}
	
	public Caminhao getCaminhao(int i) {
		return caminhoes[i];
	}

	public void setCaminhoes(Caminhao[] caminhoes) {
		this.caminhoes = caminhoes;
	}
	
	public void setCaminhoes(int i, Caminhao c) {
		caminhoes[i] = c;
	}

	public Moto[] getMotos() {
		return motos;
	}
	
	public Moto getMoto(int i) {
		return motos[i];
	}

	public void setMotos(Moto[] motos) {
		this.motos = motos;
	}
	
	public void setMotos(int i, Moto m) {
		motos[i] = m;
	}

	public Van[] getVans() {
		return vans;
	}
	
	public Van getVan(int i) {
		return vans[i];
	}

	public void setVans(Van[] vans) {
		this.vans = vans;
	}
	
	public void setVans(int i, Van v) {
		vans[i] = v;
	}

	public Carro[] getCarros() {
		return carros;
	}
	
	public Carro getCarros(int i) {
		return carros[i];
	}

	public void setCarros(Carro[] carros) {
		this.carros = carros;
	}
	
	public void setCarros(int i, Carro c) {
		carros[i] = c;
	}

	public int getnAutosComEixo() {
		return nAutosComEixo;
	}

	public void setnAutosComEixo(int nAutosComEixo) {
		this.nAutosComEixo = nAutosComEixo;
	}

	public int getnCaminhoes() {
		return nCaminhoes;
	}

	public void setnCaminhoes(int nCaminhoes) {
		this.nCaminhoes = nCaminhoes;
	}

	public int getnMotos() {
		return nMotos;
	}

	public void setnMotos(int nMotos) {
		this.nMotos = nMotos;
	}

	public int getnVans() {
		return nVans;
	}

	public void setnVans(int nVans) {
		this.nVans = nVans;
	}

	public int getnCarros() {
		return nCarros;
	}

	public void setnCarros(int nCarros) {
		this.nCarros = nCarros;
	}
	
	public void NovosDados() {
		for(int i = 0; i < 10; i++) {
			String s = String.valueOf(i);
			cnhs[i] = new Cnh("categoria".concat(s),"ufEmissao".concat(s),"dataValidade".concat(s),
					"dataEmissao".concat(s),i,"status".concat(s),"numCnh".concat(s));
			usuarios[i] = new Usuario("nome".concat(s),"cpf".concat(s),"sexo".concat(s),
					"email".concat(s),cnhs[i]);
			infracoes[i] = new Infracao("tipo".concat(s),i,"dataInfracao".concat(s),"local".concat(s),
					"status".concat(s),"id".concat(s),cnhs[i]);
			
			motos[i] = new Moto("modelo".concat(s),"placa".concat(s),"cor".concat(s),i,
					"estado".concat(s),"marca".concat(s),i,i);
			veiculos[i] = motos[i];
			
			autosComEixo[i] = new AutomoveisComEixo("modelo".concat(s),"placa".concat(s),"cor".concat(s),i,
					"estado".concat(s),"marca".concat(s),i,i,"tipo".concat(s));
			veiculos[i+10] = autosComEixo[i];
			
			carros[i] = new Carro("modelo".concat(s),"placa".concat(s),"cor".concat(s),i,
					"estado".concat(s),"marca".concat(s),i,i);
			veiculos[i+20] = carros[i];
			
			vans[i] = new Van("modelo".concat(s),"placa".concat(s),"cor".concat(s),i,
					"estado".concat(s),"marca".concat(s),i,i,"tipo".concat(s));
			veiculos[i+30] = vans[i];
			
			caminhoes[i] = new Caminhao("modelo".concat(s),"placa".concat(s),"cor".concat(s),i,
					"estado".concat(s),"marca".concat(s),i,i,"tipo".concat(s));
			veiculos[i+40] = caminhoes[i];
			
		}
		nAutosComEixo = nCaminhoes = nCarros = nCnhs = nMotos = nUsuarios = nVans = nInfracoes =10;
		nVeiculos = 50;
	}
}
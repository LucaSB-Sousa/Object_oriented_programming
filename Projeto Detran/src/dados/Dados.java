package dados;

import negocio.*;

public class Dados {

    private static Usuario[] usuarios;
    private static int nUsuarios = 0;
    private static Cnh[] cnhs;
    private static int nCnhs = 0;
    private static Infracao[] infracoes;
    private static int nInfracoes;

    private static Veiculo[] veiculos;
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
        cnhs = new Cnh[100];
        infracoes = new Infracao[100];
        veiculos = new Veiculo[2500];
        autosComEixo = new AutomoveisComEixo[500];
        caminhoes = new Caminhao[500];
        motos = new Moto[500];
        carros = new Carro[500];
        vans = new Van[500];
    }

    public Usuario[] getUsuarios1() {
        return usuarios;
    }

    public static Usuario[] getUsuarios() {
        return usuarios;
    }

    public static Usuario getUsuarios(int i) {
        return usuarios[i];
    }

    public static Usuario buscarUsuarioPorCpf(String cpf) {
        for (int i = 0; i < Dados.getnUsuarios(); i++) {
            if (Dados.getUsuarios(i).getCpf().equals(cpf)) {
                return Dados.getUsuarios(i);
            }
        }
        return null;
    }

    public static Cnh buscarCnh(String numeroCnh) {
        for (int i = 0; i < Dados.getnCnhs(); i++) {
            if (Dados.getCnhs(i).getNumCnh().equals(numeroCnh)) {
                return Dados.getCnhs(i);
            }
        }
        return null;
    }

    public static Usuario obterUsuarioPorNomeOuCpf(String identificador) {
        Usuario retorno = null;
        for (int i = 0; i < nUsuarios; i++) {
            if (Dados.getUsuarios(i)!=null && (Dados.getUsuarios(i).getNome().equals(identificador) || Dados.getUsuarios(i).getCpf().equals(identificador))) {
                retorno = usuarios[i];
            }
        }
        return retorno;
    }

    public static boolean removerUsuarioPorCpf(String cpf) {
        for (int i = 0; i < nUsuarios; i++) {
            if (usuarios[i] != null && usuarios[i].getCpf().equals(cpf)) {
                usuarios[i] = null;
                return true;
            }
        }
        return false;
    }

    public String[] getNomeUsuarios() {
        String[] s = new String[nUsuarios];
        for (int i = 0; i < nUsuarios; i++) {
            s[i] = usuarios[i].getNome();
        }
        return s;
    }

    public void setUsuarios(Usuario[] usuarios) {
        Dados.usuarios = usuarios;
    }

    public void setAluno(int i, Usuario a) {
        usuarios[i] = a;
    }

    public static int getnUsuarios() {
        return nUsuarios;
    }

    public static void setnUsuarios(int nUsuarios) {
        Dados.nUsuarios = nUsuarios;
    }

    public static Cnh[] getCnhs() {
        return cnhs;
    }

    public static Cnh getCnhs(int i) {
        return cnhs[i];
    }

    public String[] getNumCnh() {
        String[] s = new String[nCnhs];
        for (int i = 0; i < nCnhs; i++) {
            s[i] = cnhs[i].getNumCnh();
        }
        return s;
    }
    public void setCnhs(Cnh[] cnhs) {
        Dados.cnhs = cnhs;
    }

    public void setCnh(int i, Cnh c) {
        cnhs[i] = c;
    }

    public static int getnCnhs() {
        return nCnhs;
    }

    public static void setnCnhs(int nCnhs) {
        Dados.nCnhs = nCnhs;
    }

    public static Infracao[] getInfracoes() {
        return infracoes;
    }

    public static Infracao getInfracoes(int i) {
        return infracoes[i];
    }

    public void setInfracoes(Infracao[] infracoes) {
        Dados.infracoes = infracoes;
    }

    public void setInfracoes(int i, Infracao inf) {
        infracoes[i] = inf;
    }

    public static int getnInfracoes() {
        return nInfracoes;
    }
    
    public static void setnInfracoes(int nInfracoes) {
		Dados.nInfracoes = nInfracoes;
	}

	public Veiculo[] getVeiculos() {
        return veiculos;
    }

    public static Veiculo getVeiculos(int i) {
        return veiculos[i];
    }

    public void setVeiculo(Veiculo[] veiculos) {
        Dados.veiculos = veiculos;
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
        for (int i = 0; i < 10; i++) {
            String s = String.valueOf(i);
            cnhs[i] = new Cnh("categoria".concat(s), "ufEmissao".concat(s), "dataValidade".concat(s),
                    "dataEmissao".concat(s), i, "status".concat(s), "numCnh".concat(s));
            usuarios[i] = new Usuario("nome".concat(s), "cpf".concat(s), "sexo".concat(s),
                    "email".concat(s), cnhs[i], null);
            infracoes[i] = new Infracao("tipo".concat(s), i, "dataInfracao".concat(s), "local".concat(s),
                    false, "id".concat(s), cnhs[i]);

            motos[i] = new Moto("modelo".concat(s), "placa".concat(s), "cor".concat(s), i,
                    "estado".concat(s), "marca".concat(s), i, i);
            veiculos[i] = motos[i];

            autosComEixo[i] = new AutomoveisComEixo("modelo".concat(s), "placa".concat(s), "cor".concat(s), i,
                    "estado".concat(s), "marca".concat(s), i, i, "tipo".concat(s));
            veiculos[i + 10] = autosComEixo[i];

            carros[i] = new Carro("modelo".concat(s), "placa".concat(s), "cor".concat(s), i,
                    "estado".concat(s), "marca".concat(s), i, i);
            veiculos[i + 20] = carros[i];

            vans[i] = new Van("modelo".concat(s), "placa".concat(s), "cor".concat(s), i,
                    "estado".concat(s), "marca".concat(s), i, i, "tipo".concat(s));
            veiculos[i + 30] = vans[i];

            caminhoes[i] = new Caminhao("modelo".concat(s), "placa".concat(s), "cor".concat(s), i,
                    "estado".concat(s), "marca".concat(s), i, i, "tipo".concat(s));
            veiculos[i + 40] = caminhoes[i];

        }
        //Cada usuario recebe um tipo de veiculo
        for (int i = 0; i < 10; i++) {
            usuarios[i].associarVeiculoAoUsuario(motos[i]); // Moto
            usuarios[i].associarVeiculoAoUsuario(autosComEixo[i]); // Automóvel com Eixo
            usuarios[i].associarVeiculoAoUsuario(carros[i]); // Carro
            usuarios[i].associarVeiculoAoUsuario(vans[i]); // Van
            usuarios[i].associarVeiculoAoUsuario(caminhoes[i]); // Caminhão
        }
        nAutosComEixo = nCaminhoes = nCarros = nCnhs = nMotos = nUsuarios = nVans = nInfracoes = 10;
        nVeiculos = 50;
    }
}
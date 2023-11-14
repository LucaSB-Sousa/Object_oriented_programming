package dados;

import negocio.AutomoveisComEixo;
import negocio.Caminhao;
import negocio.Carro;
import negocio.Cnh;
import negocio.Infracao;
import negocio.Moto;
import negocio.Usuario;
import negocio.Van;
import negocio.Veiculo;

public class Dados {
	
   /* private Infracao infracoes[];
    private int nInfracao = 0;
    
    private Carro carros[];
    private int nCarros = 0;
    
    private Moto motos[];
    private int nMotos = 0;
    
    private Caminhao caminhoes[];
    private int nCaminhoes = 0;
    
    private Van vans[];
    private int nVan = 0;
    
    private AutomoveisComEixo automoveisComEixos[];
    private int nAutomoveisComEixo = 0;
    
    private Veiculo veiculos[];
    private int nVeiculos = 0;
    */

	private final String loginDetran = "Detran";
    private final String senhaDetran = "1234";
    
    public String getLoginDetran() {return loginDetran;}

    public String getSenhaDetran() {return senhaDetran;}

	public Infracao[] getInfracoes() {
		return getInfracoes();
	}

	public Carro[] getCarros() {
		return getCarros();
	}

	public Moto[] getMotos() {
		return getMotos();
	}

	public Caminhao[] getCaminhoes() {
		return getCaminhoes();
	}

	public Van[] getVans() {
		return getVans();
	}

	public AutomoveisComEixo[] getAutomoveisComEixos() {
		return getAutomoveisComEixos();
	}

	public Veiculo[] getVeiculos() {
		return getVeiculos();
	}

	public static void NovosDados() {
        //Carro carromeucarro = new Carro("Fiesta", "ABC-1234", "Azul", 2020, "SP", "Ford", 1200, 5);
        //Moto motoCB = new Moto("CB 500", "XYZ-5678", "Preta", 2019, "RJ", "Honda", 200, 2);
        //Caminhao caminhaoFH = new Caminhao("FH 540", "JKL-9101", "Branco", 2018, "MG", "Volvo", 8000, 2, "Caminhão Toco");
        //Van vanSprinter = new Van("Sprinter", "MNO-1122", "Prata", 2021, "ES", "Mercedes", 3000, 16, "Van Passageiro");
        //AutomoveisComEixo automovelEco = new AutomoveisComEixo("Ecosport", "QRS-1314", "Vermelho", 2022, "BA", "Ford", 1300, 5, "SUV");

        Cnh.cadastrarCnh(new Cnh("B", "SP", "01/01/2025", "01/01/2015", 0, "Ativa", "12345678901"),Cnh.quantDeCnhs());
        Cnh.cadastrarCnh(new Cnh("A", "RJ", "15/05/2024", "15/05/2014", 0, "Ativa", "98765432109"),Cnh.quantDeCnhs());
        Cnh.cadastrarCnh(new Cnh("D", "MG", "10/10/2023", "10/10/2013", 0, "Ativa", "11223344556"),Cnh.quantDeCnhs());
        
		Usuario.cadastrarUsuario(new Usuario("Matheus", "12345678901", "Masculino", "matheus@email.com", null, null), Usuario.quantDeUsuarios());
        Usuario.cadastrarUsuario(new Usuario("Julia", "98765432109", "Feminino", "julia@email.com", null, null),Usuario.quantDeUsuarios());
        Usuario.cadastrarUsuario(new Usuario("Carlos", "11223344556", "Masculino", "carlos@email.com", null, null),Usuario.quantDeUsuarios());
        
        //infracoes[1] = (new Infracao("Excesso de velocidade", 150, 20220101, "Av. Paulista, SP", "Pendente", "INF001"));
        //infracoes[2] = (new Infracao("Estacionamento proibido", 100, 20220105, "Rua Augusta, SP", "Pendente", "INF002"));
        //infracoes[3] = (new Infracao("Uso de celular ao dirigir", 200, 20220110, "Av. Brasil, RJ", "Pendente", "INF003"));
        
        //cnhMatheus.addInfracao(infracoes.get(0));
        //cnhJulia.addInfracao(infracoes.get(1));
        //cnhCarlos.addInfracao(infracoes.get(2));
    }
}

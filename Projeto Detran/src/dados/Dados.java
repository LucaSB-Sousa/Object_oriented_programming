package dados;

import negocio.Usuario;
import negocio.Infracao;
import negocio.Cnh;
import negocio.Carro;
import negocio.Moto;
import negocio.Caminhao;
import negocio.Van;
import negocio.AutomoveisComEixo;
import java.util.ArrayList;
import java.util.List;

public class Dados {
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Infracao> infracoes = new ArrayList<>();
    private List<Cnh> cnhs = new ArrayList<>();
    private List<Carro> carros = new ArrayList<>();
    private List<Moto> motos = new ArrayList<>();
    private List<Caminhao> caminhoes = new ArrayList<>();
    private List<Van> vans = new ArrayList<>();
    private List<AutomoveisComEixo> automoveisComEixo = new ArrayList<>();

    private final String loginDetran = "Detran";
    private final String senhaDetran = "1234";



    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void removeUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void addInfracao(Infracao infracao) {
        infracoes.add(infracao);
    }

    public List<Infracao> getInfracoes() {
        return infracoes;
    }

    public void addCnh(Cnh cnh) {
        cnhs.add(cnh);
    }

    public List<Cnh> getCnhs() {
        return cnhs;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public List<Moto> getMotos() {
        return motos;
    }

    public List<Caminhao> getCaminhoes() {
        return caminhoes;
    }

    public List<Van> getVans() {
        return vans;
    }

    public List<AutomoveisComEixo> getAutomoveisComEixo() {
        return automoveisComEixo;
    }
    public String getLoginDetran() {return loginDetran;}

    public String getSenhaDetran() {return senhaDetran;}


    //usar dados como coisa adicional
    public Dados() {

        Carro carroFiesta = new Carro("Fiesta", "ABC-1234", "Azul", 2020, "SP", "Ford", 1200, 5);
        Moto motoCB = new Moto("CB 500", "XYZ-5678", "Preta", 2019, "RJ", "Honda", 200, 2);
        Caminhao caminhaoFH = new Caminhao("FH 540", "JKL-9101", "Branco", 2018, "MG", "Volvo", 8000, 2, "Caminhão Toco");
        Van vanSprinter = new Van("Sprinter", "MNO-1122", "Prata", 2021, "ES", "Mercedes", 3000, 16, "Van Passageiro");
        AutomoveisComEixo automovelEco = new AutomoveisComEixo("Ecosport", "QRS-1314", "Vermelho", 2022, "BA", "Ford", 1300, 5, "SUV");

        carros.add(carroFiesta);
        motos.add(motoCB);
        caminhoes.add(caminhaoFH);
        vans.add(vanSprinter);
        automoveisComEixo.add(automovelEco);

        Cnh cnhMatheus = new Cnh("B", "SP", "01/01/2025", "01/01/2015", 0, "Ativa", "12345678901", new ArrayList<>());
        Cnh cnhJulia = new Cnh("A", "RJ", "15/05/2024", "15/05/2014", 0, "Ativa", "98765432109", new ArrayList<>());
        Cnh cnhCarlos = new Cnh("D", "MG", "10/10/2023", "10/10/2013", 0, "Ativa", "11223344556", new ArrayList<>());

        cnhs.add(cnhMatheus);
        cnhs.add(cnhJulia);
        cnhs.add(cnhCarlos);

        usuarios.add(new Usuario("Matheus", "12345678901", "Masculino", "matheus@email.com", cnhMatheus, carroFiesta));
        usuarios.add(new Usuario("Julia", "98765432109", "Feminino", "julia@email.com", cnhJulia, motoCB));
        usuarios.add(new Usuario("Carlos", "11223344556", "Masculino", "carlos@email.com", cnhCarlos, caminhaoFH));

        infracoes.add(new Infracao("Excesso de velocidade", 150, 20220101, "Av. Paulista, SP", "Pendente", "INF001"));
        infracoes.add(new Infracao("Estacionamento proibido", 100, 20220105, "Rua Augusta, SP", "Pendente", "INF002"));
        infracoes.add(new Infracao("Uso de celular ao dirigir", 200, 20220110, "Av. Brasil, RJ", "Pendente", "INF003"));

        cnhMatheus.addInfracao(infracoes.get(0));
        cnhJulia.addInfracao(infracoes.get(1));
        cnhCarlos.addInfracao(infracoes.get(2));


    }

}

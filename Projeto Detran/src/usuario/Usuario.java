package usuario;

import cnh.Cnh;
import infracao.Infracao;
import veiculo.Veiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Usuario {
    private String nome;
    private String cpf;
    private String sexo;
    private String email;
    private Cnh cnh;
    private  Veiculo Veiculo;
    private final List<Infracao> infracoes = new ArrayList<>();

    public Usuario(String nome, String cpf, String sexo, String email, Cnh cnh, veiculo.Veiculo veiculo) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.email = email;
        this.cnh = cnh;
        Veiculo = veiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cnh getCnh() {
        return cnh;
    }

    public void setCnh(Cnh cnh) {
        this.cnh = cnh;
    }

    public veiculo.Veiculo getVeiculo() {
        return Veiculo;
    }

    public void setVeiculo(veiculo.Veiculo veiculo) {
        Veiculo = veiculo;
    }

    public void cadastrarConta(String nome, String cpf, String sexo, String email, Cnh cnh, veiculo.Veiculo veiculo){

    }

    public String obterDadosUsuario(String nome, String cpf, String sexo, String email) {
        return "(" + nome + ", " + cpf + ", " + sexo + ", " + email + ")";
    }
    public List<Infracao> obterInfracoesCnh() {
        if (this.cnh != null) {
            return this.cnh.getInfracoes();
        }
        return new ArrayList<>();
    }

    public Veiculo procurarVeiculo(String placa) {
        if (this.Veiculo != null && this.Veiculo.getPlaca().equals(placa)) {
            return this.Veiculo;
        }
        return null;
    }

    public void removerVeiculo(Veiculo veiculo) {
        if (this.Veiculo != null && this.Veiculo.equals(veiculo)) {
            this.Veiculo = null;
        }
    }

    public void transferirInfracao(Usuario outroUsuario, String idInfracao) {
        Iterator<Infracao> iterator = this.infracoes.iterator();
        while (iterator.hasNext()) {
            Infracao infracao = iterator.next();
            if (infracao.getId().equals(idInfracao)) {
                outroUsuario.getCnh().addInfracao(infracao);
                iterator.remove();
                break;
            }
        }

    }
}



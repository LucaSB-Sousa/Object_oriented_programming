package negocio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class Usuario {
    private String nome;
    private String cpf;
    private String sexo;
    private String email;
    private Cnh cnh;
    private  Veiculo Veiculo;
    private static Usuario[] usuarios = new Usuario[0];


    public Usuario(String nome, String cpf, String sexo, String email, Cnh cnh, negocio.Veiculo veiculo) {
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

    public negocio.Veiculo getVeiculo() {
        return Veiculo;
    }

    public void setVeiculo(negocio.Veiculo veiculo) {
        Veiculo = veiculo;
    }

    public static Usuario[] getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(Usuario[] usuarios) {
        Usuario.usuarios = usuarios;
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

//    public void transferirInfracao(Usuario outroUsuario, String idInfracao) {
//        Iterator<Infracao> iterator = this.infracoes.iterator();
//        while (iterator.hasNext()) {
//            Infracao infracao = iterator.next();
//            if (infracao.getId().equals(idInfracao)) {
//                outroUsuario.getCnh().addInfracao(infracao);
//                iterator.remove();
//                break;
//            }
//        }
//
//    }

    public static Usuario obterDadosPorNome(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nome)) {
                return usuario;
            }
        }
        return null;
    }

    public static Usuario obterUsuarioPorNomeOuCpf(String nomeOuCpf) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nomeOuCpf) || usuario.getCpf().equals(nomeOuCpf)) {
                return usuario;
            }
        }
        return null;
    }

    public static Usuario cadastrarConta(String[] dadosNovoUsuario) {
        String nome = dadosNovoUsuario[0].trim();
        String cpf = dadosNovoUsuario[1].trim();
        String sexo = dadosNovoUsuario[2].trim();
        String email = dadosNovoUsuario[3].trim();

        Usuario novoUsuario = new Usuario(nome, cpf, sexo, email, null, null);

        usuarios = Arrays.copyOf(usuarios, usuarios.length + 1);
        usuarios[usuarios.length - 1] = novoUsuario;

        return novoUsuario;
    }
}



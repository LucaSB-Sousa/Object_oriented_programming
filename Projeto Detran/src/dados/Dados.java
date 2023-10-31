package dados;

import usuario.Usuario;
import infracao.Infracao;
import cnh.Cnh;
import java.util.ArrayList;
import java.util.List;

public class Dados {
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Infracao> infracoes = new ArrayList<>();
    private List<Cnh> cnhs = new ArrayList<>();

    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    public Usuario obterDadosPorNome(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nome)) {
                return usuario;
            }
        }
        return null;
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
}

package detran;

import infracao.Infracao;
import usuario.Usuario;
import cnh.Cnh;
import java.util.ArrayList;
import java.util.List;

public class Detran {
    private List<Usuario> usuarios = new ArrayList<>();
    private Infracao infracao;
    private Cnh cnh;

    public Detran() {
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void adicionarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        this.usuarios.remove(usuario);
    }

    public Infracao getInfracao() {
        return infracao;
    }

    public void setInfracao(Infracao infracao) {
        this.infracao = infracao;
    }

    public void adicionarInfracaoAoUsuario(Usuario usuario, Infracao infracao){
        if (usuario != null && usuario.getCnh() != null) {
            usuario.getCnh().addInfracao(infracao);
        }
    }

    public void deletarUsuario(Usuario usuario) {
        this.usuarios.remove(usuario);
    }

    public void adicionarCnhAoUsuario(Usuario usuario, Cnh cnh) {
        if (usuario != null) {
            usuario.setCnh(cnh);
        }
    }

    public void removerCnhDoUsuario(Usuario usuario) {
        if (usuario != null) {
            usuario.setCnh(null);
        }
    }

    public void editarInfracao(String id, String novoTipo, int novoValor, int novaDataInfracao, String novoLocal, String novoStatus) {
        if (this.infracao != null && this.infracao.getId().equals(id)) {
            this.infracao.setTipo(novoTipo);
            this.infracao.setValor(novoValor);
            this.infracao.setDataInfracao(novaDataInfracao);
            this.infracao.setLocal(novoLocal);
            this.infracao.setStatus(novoStatus);
        }
    }
}

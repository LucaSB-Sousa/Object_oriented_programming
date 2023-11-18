package negocio;

import dados.Dados;

import java.util.ArrayList;
import java.util.List;

public class Detran {
    private Infracao infracao;
    private Cnh cnh;
    private Dados dados;
    
    public Detran(Dados dados) {
        this.dados = dados;
    }
    
    public Cnh getCnh() {
		return cnh;
	}

	public void setCnh(Cnh cnh) {
		this.cnh = cnh;
	}

    public boolean autenticarDetran(String login, String senha) {
        return dados.getLoginDetran().equals(login) && dados.getSenhaDetran().equals(senha);
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

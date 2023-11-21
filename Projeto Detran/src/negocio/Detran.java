package negocio;

import dados.Dados;

public class Detran {
    //private Infracao infracao;
    private Cnh cnh;
    private static Dados dados = new Dados();

    public Detran(Dados dados) {
        Detran.dados = dados;
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

    public void adicionarInfracaoAoUsuario(Usuario usuario, Infracao infracao) {

    }

    public void deletarUsuario(Usuario usuario) {

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

    }

    public static Infracao cadastrarInfracao(String[] infracaoData) {
        // TODO Auto-generated method stub
        return null;
    }

}

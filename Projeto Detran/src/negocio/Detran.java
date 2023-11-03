package negocio;

import dados.Dados;

public class Detran {
    private Usuario usuarios;
    private Infracao infracao;
    private Cnh cnh;
    private Dados dados;


    public Usuario getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario usuarios) {
        this.usuarios = usuarios;
    }

    public Detran(Dados dados) {
        this.dados = dados;
    }

    public boolean autenticarDetran(String login, String senha) {
        return dados.getLoginDetran().equals(login) && dados.getSenhaDetran().equals(senha);
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

    public static void deletarUsuario(String cpfUsuarioASerRemovido) {
        Usuario[] usuariosAtuais = Usuario.getUsuarios();
        int indexToRemove = -1;

        for (int i = 0; i < usuariosAtuais.length; i++) {
            if (usuariosAtuais[i].getCpf().equals(cpfUsuarioASerRemovido)) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            Usuario[] novosUsuarios = new Usuario[usuariosAtuais.length - 1];
            // Copiar todos os usuários, exceto o que queremos remover
            for (int i = 0, j = 0; i < usuariosAtuais.length; i++) {
                if (i != indexToRemove) {
                    novosUsuarios[j++] = usuariosAtuais[i];
                }
            }

            Usuario.setUsuarios(novosUsuarios);
        }

    }

    public static Infracao cadastrarInfracao (String[] dadosInfracao){
        String tipo = dadosInfracao[0].trim();
        int valor = Integer.parseInt(dadosInfracao[1].trim());
        int dataInfracao = Integer.parseInt(dadosInfracao[2].trim());
        String local = dadosInfracao[3].trim();
        String status = dadosInfracao[4].trim();
        String id = dadosInfracao[5].trim();

        Infracao novaInfracao = new Infracao(tipo, valor, dataInfracao, local, status, id);
        return novaInfracao;
    }
}

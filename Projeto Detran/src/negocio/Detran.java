package negocio;

import dados.Dados;

public class Detran {
    //private Infracao infracao;
    private Cnh cnh;
    private Dados dados = new Dados();

    public Detran(Dados dados) {
        this.dados = dados;
    }

    public Cnh getCnh() {
        return cnh;
    }

    public void setCnh(Cnh cnh) {
        this.cnh = cnh;
    }

    public void adicionarInfracaoAoUsuario(Usuario usuario, Infracao infracao) {

    }

    public static boolean deletarUsuario(String cpf) {
        return Dados.removerUsuarioPorCpf(cpf);
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
    
	public static void cadastrarInfracao(String tipoInfracao, String data, String local, 
			double valor,String id,Cnh cnhUser) {
		Dados.getInfracoes()[Dados.getnInfracoes()] = new Infracao(tipoInfracao, valor, data, local, false, id, cnhUser);		
		Dados.setnInfracoes(Dados.getnInfracoes()+1);
		Infracao.setNumInfracoes(Infracao.getNumInfracoes()+1);
	}

}

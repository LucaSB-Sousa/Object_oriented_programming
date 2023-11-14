package dados;

import negocio.Cnh;
import negocio.Infracao;
import negocio.Usuario;

public class Dados {
    private final String loginDetran = "Detran";
    private final String senhaDetran = "1234";

    public String getLoginDetran() {return loginDetran;}

    public String getSenhaDetran() {return senhaDetran;}

    private Usuario[] usuarios;
    private int nUsuarios = 0;
    private Cnh[] cnhs;
    private int nCnhs = 0;
    private Infracao[] infracoes;
    private int nInfracoes = 0;

    public Dados() {
        usuarios = new Usuario[100];
        cnhs = new Cnh[100];
        infracoes = new Infracao[100];
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    public void setUsuario(int i, Usuario novoUsuario) {
        usuarios[i] = novoUsuario;
    }

    public int getnUsuarios() {
        return nUsuarios;
    }

    public void setnUsuarios(int nUsuarios) {
        this.nUsuarios = nUsuarios;
    }

    public Cnh[] getCnhs() {
        return cnhs;
    }

    public void setCnhs(Cnh[] cnhs) {
        this.cnhs = cnhs;
    }

    public int getnCnhs() {
        return nCnhs;
    }

    public void setnCnhs(int nCnhs) {
        this.nCnhs = nCnhs;
    }

    public Infracao[] getInfracoes() {
        return infracoes;
    }

    public void setInfracoes(Infracao[] infracoes) {
        this.infracoes = infracoes;
    }

    public int getnInfracoes() {
        return nInfracoes;
    }

    public void setnInfracoes(int nInfracoes) {
        this.nInfracoes = nInfracoes;
    }

    public void preencherDados() {
        for (int i = 0; i < 10; i++) {
            String s = String.valueOf(i);
            usuarios[i] = new Usuario("nome".concat(s), "cpf".concat(s), "sexo".concat(s),
                    "email".concat(s), null, null);

            nUsuarios = 10;
        }
    }
}

package user;

public class Usuario {
    private String tipoUsuario;

    public Usuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {

        if (tipoUsuario.equals("free") || tipoUsuario.equals("premium")){
            this.tipoUsuario = tipoUsuario;
        }
    }
}

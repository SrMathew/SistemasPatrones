package Sistema.EstadoUsuario;

import Sistema.Usuario;

public interface EstadoUsuario {
    public void liberar(Usuario usuario);
    public void levantar(Usuario usuario);
    public void irEnViaje(Usuario usuario);
    public void serCuidador(Usuario usuario);
}

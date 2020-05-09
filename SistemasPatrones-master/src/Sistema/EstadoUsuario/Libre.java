package Sistema.EstadoUsuario;

import Sistema.Usuario;

public class Libre implements EstadoUsuario{
    @Override
    public void liberar(Usuario usuario) {
        //nada
    }

    @Override
    public void levantar(Usuario usuario) {
        //nada
    }

    public void irEnViaje(Usuario usuario) {
        usuario.cambiarEstado(new EnViaje());
    }
    public void serCuidador(Usuario usuario){
        usuario.cambiarEstado(new Cuidador());
    }
}

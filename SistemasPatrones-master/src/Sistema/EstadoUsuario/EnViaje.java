package Sistema.EstadoUsuario;

import Sistema.Usuario;

public class EnViaje implements EstadoUsuario{
    public EnViaje(){

    }

    @Override
    public void liberar(Usuario usuario) {
        usuario.cambiarEstado(new Libre());
    }

    @Override
    public void levantar(Usuario usuario) {
        //nada
    }

    @Override
    public void irEnViaje(Usuario usuario) {
        //nada
    }

    @Override
    public void serCuidador(Usuario usuario) {
        //nada
    }
}

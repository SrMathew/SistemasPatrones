package Sistema.EstadoUsuario;

import Sistema.Usuario;

public class Suspendido implements EstadoUsuario{
    public Suspendido(){

    }

    @Override
    public void levantar(Usuario usuario) {
        usuario.cambiarEstado(new Libre());
    }

    @Override
    public void irEnViaje(Usuario usuario) {
        //nada
    }

    @Override
    public void serCuidador(Usuario usuario) {
        //nada
    }

    @Override
    public void liberar(Usuario usuario) {
        //nada
    }
}

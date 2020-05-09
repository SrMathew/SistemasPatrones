package Sistema.EstadoUsuario;

import Sistema.Usuario;

public class Cuidador implements EstadoUsuario{
    public Cuidador(){

    }

    @Override
    public void liberar(Usuario usuario) {
        usuario.cambiarEstado(new Libre());
    }

    @Override
    public void serCuidador(Usuario usuario) {
        //nada
    }

    @Override
    public void levantar(Usuario usuario) {
        //nada
    }

    @Override
    public void irEnViaje(Usuario usuario) {
        //nada
    }
}

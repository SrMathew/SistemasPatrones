package Sistema.EstadoViaje;

import Sistema.Viaje;

public class Inicio implements EstadoViaje{

    public Inicio(){}


    @Override
    public void iniciar(Viaje viaje) {

    }

    @Override
    public void enProgreso(Viaje viaje) {
        viaje.cambiarEstado(new EnProgreso());
    }

    @Override
    public void finalizar(Viaje viaje) {

    }

    @Override
    public void ocurreIncidente(Viaje viaje) {

    }
}

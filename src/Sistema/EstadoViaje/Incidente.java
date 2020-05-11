package Sistema.EstadoViaje;

import Sistema.Viaje;

public class Incidente implements EstadoViaje{

    public Incidente(){}


    @Override
    public void iniciar(Viaje viaje) {

    }

    @Override
    public void enProgreso(Viaje viaje) {

    }

    @Override
    public void finalizar(Viaje viaje) {
        viaje.cambiarEstado(new Finalizado());
    }

    @Override
    public void ocurreIncidente(Viaje viaje) {

    }
}

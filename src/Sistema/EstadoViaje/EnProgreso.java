package Sistema.EstadoViaje;

import Sistema.Viaje;

public class EnProgreso implements EstadoViaje{


    public EnProgreso(){}


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
        viaje.cambiarEstado(new Incidente());
    }
}

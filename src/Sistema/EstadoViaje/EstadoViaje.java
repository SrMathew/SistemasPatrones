package Sistema.EstadoViaje;

import Sistema.Viaje;

public interface EstadoViaje {

    public void iniciar(Viaje viaje);
    public void enProgreso(Viaje viaje);
    public void finalizar(Viaje viaje);
    public void ocurreIncidente(Viaje viaje);
    
}

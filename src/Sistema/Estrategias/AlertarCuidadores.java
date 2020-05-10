package Sistema.Estrategias;

import Sistema.Viaje;

public class AlertarCuidadores implements Estrategia{
    public AlertarCuidadores(){

    }
    @Override
    public void ejecutarEstrategia(Viaje viaje) {
        viaje.notificarCuidadores();
    }
}

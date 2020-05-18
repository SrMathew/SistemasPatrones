package Sistema.Estrategias;

import Sistema.Viaje;

public class AlertarCuidadores implements Estrategia{
    public AlertarCuidadores(){

    }
    @Override
    public String ejecutarEstrategia(Viaje viaje) {
        viaje.notificarCuidadores();
        return "notificar a cuidadores";
    }
}

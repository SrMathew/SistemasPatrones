package Sistema.Estrategias;
import Sistema.Viaje;

public class llamarPolicia implements Estrategia{

    public llamarPolicia(){

    }
    @Override
    public String ejecutarEstrategia(Viaje viaje) {
        return "llamar a policia";
    }
}

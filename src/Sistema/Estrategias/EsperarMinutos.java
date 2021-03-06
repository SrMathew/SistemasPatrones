package Sistema.Estrategias;
import Sistema.Viaje;

public class EsperarMinutos implements Estrategia {
    private int minutos = 0;

    public EsperarMinutos(int min){
        this.minutos = min;
    }

    public void setMin(int min){
        this.minutos = min;
    }

    @Override
    public String ejecutarEstrategia(Viaje viaje) {
        return "esperar X cantidad de minutos";
    }
}

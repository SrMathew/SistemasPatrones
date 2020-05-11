package Sistema;

import Sistema.Adapter.*;
import Sistema.EstadoViaje.EstadoViaje;
import Sistema.Estrategias.Estrategia;

import java.util.List;

public class Viaje implements IObservable{

    //atributos
    private Usuario usuario;
    private String destino;
    private Adapter distancia;
    private List<IObserver> cuidadores;
    private EstadoViaje estado;
    private Estrategia estrategia;

    //metodos
    public void agregarCuidador(){}
    public void eliminarCuidador(){}

    @Override
    public void agrearCuidador(IObserver observador) {
        this.cuidadores.add(observador);
    }
    @Override
    public void eliminarCuidador(IObserver observador) {
        this.cuidadores.remove(observador);
    }
    @Override
    public void notificarCuidadores(){
        this.cuidadores.forEach(o -> o.serNotificadoPor(this));
    }
    public void estadoContexto(){}
    public void cambiarEstado(EstadoViaje estado){}
    public EstadoViaje obtenerEstado(){
        return this.estado;
    }
    public void ejecutarEstrategia(){}
    public void setEstrategia(Estrategia estrategia){
        this.estrategia = estrategia;
    }
    public void distancia(){}

}

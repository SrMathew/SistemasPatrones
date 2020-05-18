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
        /*
         *  for(int i = 0 ; i < this.cuidadores.size() ; i++){
         *      this.cuidadores.get(i).serNotificadoPor(this);
         *  }
        */
        //this.cuidadores.forEach(o -> o.serNotificadoPor(this));
    }

    public void estadoContexto(){}

    public void cambiarEstado(EstadoViaje estado){
        this.setEstado(estado);
    }

    public EstadoViaje getEstado() {
        return estado;
    }

    public void setEstado(EstadoViaje estado) {
        this.estado = estado;
    }

    public String ejecutarEstrategia(){
        return this.getEstrategia().ejecutarEstrategia(this);
    }

    public void cambiarEstrategia(Estrategia estrategia){
        setEstrategia(estrategia);
    }

    public void setEstrategia(Estrategia estrategia){
        this.estrategia = estrategia;
    }

    public Estrategia getEstrategia() {
        return estrategia;
    }

    public void distancia(){ }

}

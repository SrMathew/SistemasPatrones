package Sistema;

import Sistema.EstadoUsuario.EstadoUsuario;

public class Usuario implements IObserver{

    //atributos
    private String nombre;
    private String apellido;
    private String direccionActual;
    private int edad;
    private String sexo;

    //métodos
    public void serNotificadoPor(){}
    public void viajeNuevo(){}
    public void cambiarEstado(EstadoUsuario estado){}
    @Override
    public void serNotificadoPor(IObservable observable) {

    }
}

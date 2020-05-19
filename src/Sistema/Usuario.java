package Sistema;

import Sistema.EstadoUsuario.EstadoUsuario;

public class Usuario implements IObserver{

    //atributos
    private String nombre;
    private String apellido;
    private String direccionActual;
    private int edad;
    private String sexo;
    private EstadoUsuario estadoUsuario;

    //métodos
    public void serNotificadoPor(){}
    public void viajeNuevo(){}
    public void cambiarEstado(EstadoUsuario estado){
        this.setEstadoUsuario(estado);
    }
    @Override
    public void serNotificadoPor(IObservable observable) { }

    public EstadoUsuario getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(EstadoUsuario estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }
}

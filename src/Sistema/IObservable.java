package Sistema;

public interface IObservable {

    //metodos
    public void agrearCuidador(IObserver observador);
    public void eliminarCuidador(IObserver observador);
    public void notificarCuidadores();

}

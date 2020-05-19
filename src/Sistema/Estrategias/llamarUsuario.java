package Sistema.Estrategias;

import Sistema.Viaje;

public class llamarUsuario implements Estrategia{
    public  llamarUsuario(){

    }

    @Override
    public String ejecutarEstrategia(Viaje viaje) {
        return "llamar a usuario";
    }
}

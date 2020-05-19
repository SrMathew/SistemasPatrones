package Sistema;

import Sistema.Adapter.AdapterConcreto;
import Sistema.EstadoUsuario.*;
import Sistema.EstadoViaje.EnProgreso;
import Sistema.EstadoViaje.Finalizado;
import Sistema.EstadoViaje.Incidente;
import Sistema.EstadoViaje.Inicio;
import Sistema.Estrategias.AlertarCuidadores;
import Sistema.Estrategias.EsperarMinutos;
import Sistema.Estrategias.llamarPolicia;
import Sistema.Estrategias.llamarUsuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Prueba {

    @Test
    void TestAdapter(){

        AdapterConcreto adapter = new AdapterConcreto();
        int distancia = adapter.obtenerDistancia();
        assertTrue(distancia == 500);

    }

    @Test
    void TestEstadoUsuarioLibreAEnViaje(){

        Usuario usuario = new Usuario();
        usuario.cambiarEstado(new Libre());
        usuario.getEstadoUsuario().irEnViaje(usuario);
        EstadoUsuario claseParaTest = new EnViaje();
        assertTrue(usuario.getEstadoUsuario().getClass().equals(claseParaTest.getClass()));

    }

    @Test
    void TestEstadoUsuarioLibreACuidador(){

        Usuario usuario = new Usuario();
        usuario.cambiarEstado(new Libre());
        usuario.getEstadoUsuario().serCuidador(usuario);
        EstadoUsuario claseParaTest = new Cuidador();
        assertTrue(usuario.getEstadoUsuario().getClass().equals(claseParaTest.getClass()));

    }

    @Test
    void TestEstadoUsuarioCuidadorALibre(){

        Usuario usuario = new Usuario();
        usuario.cambiarEstado(new Libre());
        usuario.getEstadoUsuario().serCuidador(usuario);
        usuario.getEstadoUsuario().liberar(usuario);
        EstadoUsuario claseParaTest = new Libre();
        assertTrue(usuario.getEstadoUsuario().getClass().equals(claseParaTest.getClass()));

    }

    @Test
    void TestEstadoUsuarioEnViajeALibre(){

        Usuario usuario = new Usuario();
        usuario.cambiarEstado(new Libre());
        usuario.getEstadoUsuario().irEnViaje(usuario);
        usuario.getEstadoUsuario().liberar(usuario);
        EstadoUsuario claseParaTest = new Libre();
        assertTrue(usuario.getEstadoUsuario().getClass().equals(claseParaTest.getClass()));

    }

    @Test
    void TestEstadoUsuarioSuspendidoALibre(){

        Usuario usuario = new Usuario();
        usuario.cambiarEstado(new Suspendido());
        usuario.getEstadoUsuario().levantar(usuario);
        EstadoUsuario claseParaTest = new Libre();
        assertTrue(usuario.getEstadoUsuario().getClass().equals(claseParaTest.getClass()));

    }

    @Test
    void TestEstadoViajeInicioAEnProgreso(){
        Viaje viaje = new Viaje();
        viaje.cambiarEstado(new Inicio());
        viaje.getEstado().enProgreso(viaje);
        EnProgreso claseParaTest = new EnProgreso();
        assertTrue(viaje.getEstado().getClass().equals(claseParaTest.getClass()));
    }

    @Test
    void TestEstadoViajeEnProgresoAFinalizado(){
        Viaje viaje = new Viaje();
        viaje.cambiarEstado(new Inicio());
        viaje.getEstado().enProgreso(viaje);
        viaje.getEstado().finalizar(viaje);
        Finalizado claseParaTest = new Finalizado();
        assertTrue(viaje.getEstado().getClass().equals(claseParaTest.getClass()));
    }

    @Test
    void TestEstadoViajeEnProgresoAIncidente(){
        Viaje viaje = new Viaje();
        viaje.cambiarEstado(new Inicio());
        viaje.getEstado().enProgreso(viaje);
        viaje.getEstado().ocurreIncidente(viaje);
        Incidente claseParaTest = new Incidente();
        assertTrue(viaje.getEstado().getClass().equals(claseParaTest.getClass()));
    }

    @Test
    void TestEstadoViajeIncidenteAFinalizado(){
        Viaje viaje = new Viaje();
        viaje.cambiarEstado(new Inicio());
        viaje.getEstado().enProgreso(viaje);
        viaje.getEstado().ocurreIncidente(viaje);
        viaje.getEstado().finalizar(viaje);
        Finalizado claseParaTest = new Finalizado();
        assertTrue(viaje.getEstado().getClass().equals(claseParaTest.getClass()));
    }

    @Test
    void TestEstrategiaLlamarPolicia(){
        Viaje viaje = new Viaje();
        viaje.cambiarEstrategia(new llamarPolicia());
        String prueba = viaje.ejecutarEstrategia();
        assertTrue(prueba == "llamar a policia");
    }

    @Test
    void TestEstrategiaLlamarUsuario(){
        Viaje viaje = new Viaje();
        viaje.cambiarEstrategia(new llamarUsuario());
        String prueba = viaje.ejecutarEstrategia();
        assertTrue(prueba == "llamar a usuario");
    }

    @Test
    void TestEstrategiaEsperarMinutos(){
        Viaje viaje = new Viaje();
        viaje.cambiarEstrategia(new EsperarMinutos(10));
        String prueba = viaje.ejecutarEstrategia();
        assertTrue(prueba == "esperar X cantidad de minutos");
    }

    @Test
    void TestEstrategiaNotificarCuidadores(){
        Viaje viaje = new Viaje();
        viaje.cambiarEstrategia(new AlertarCuidadores());
        String prueba = viaje.ejecutarEstrategia();
        assertTrue(prueba == "notificar a cuidadores");
    }


}

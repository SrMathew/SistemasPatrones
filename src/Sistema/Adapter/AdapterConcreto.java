package Sistema.Adapter;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import org.json.*;

public class AdapterConcreto implements Adapter{

    private static final String BASE_URL = "https://maps.googleapis.com/maps/api";
    private static final String API_KEY = "AIzaSyBV7t8enRB7UmFmo13ddNReMUQjVZadKc4";

    @Override
    public int obtenerDistancia(){
        return adaptarDato();
    }

    public int adaptarDato(){
        String distancia = getDistance();
        String[] partes = distancia.split(" ");
        String stringDistancia = partes[0];
        int integerDistancia = Integer.parseInt(stringDistancia);

        return integerDistancia;
    }

    public String getDistance(){
        JSONObject json = getJSONInformation();
        String distancia;
        //Logica que permite agarrar 'distance' del JSON ; 500 es un ejemplo
        distancia = "500 km";
        return distancia;
    }

    public JSONObject getJSONInformation(){
        try {
            String a = BASE_URL + "/distancematrix/json?units=imperial&origins=Washington,DC&destinations=New+York+City,NY&key=" + API_KEY;
            URL url = new URL(a);
            URLConnection connection = url.openConnection();

            try (Scanner scanner = new Scanner(connection.getInputStream());) {
                String response = scanner.useDelimiter("\\A").next();
                System.out.println(response);

                try {
                    JSONObject jsonObject = new JSONObject(response);
                    return jsonObject;
                } catch (JSONException err) {
                    System.out.println("ERROR");
                }

            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new JSONObject();
    }
}

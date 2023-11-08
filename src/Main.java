import model.Cancion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        // Creo una fecha con mas de 24 hs con respecto a este instante
        LocalDateTime reproduccionAnterior = LocalDateTime.of(
                LocalDate.of(2023,11,7),
                LocalTime.of(12,38));

        Cancion cancion = new Cancion();
        cancion.setNombre("Angie");
        cancion.setAlbum("Goats Head Soup");
        cancion.setArtista("The Rolling Stones");
        cancion.setAnio(1973);

        cancion.reproducir();

        cancion.setLikes(52000);
        cancion.setReproducciones(55000);

        cancion.reproducir(); // No tengo un salto de Normal a Tendencia, por eso debo reproducir
        cancion.reproducir(); // 2 veces seguidas para que pase a Tendencia.

        cancion.setUltimaReproduccion(reproduccionAnterior);

        cancion.reproducir(); // Vuelve a normal porque pasaron mas de 24 hs despues de la ultima reproduccion
        cancion.reproducir(); // Pasa primero a Auge para luego pasar a tendencia nuevamente

        cancion.reproducir();

    }


}

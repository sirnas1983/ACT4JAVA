import icono.Icono;
import model.Cancion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        LocalDateTime fechaVieja;
        fechaVieja = LocalDateTime.of(LocalDate.of(2023,11,7), LocalTime.of(12,38));

        Cancion cancion = new Cancion();
        cancion.setAlbum("Paradaise City");
        cancion.setArtista("Gun's n Roses");
        cancion.setAnio(1995);
        cancion.setNombre("Raige against the machine");
        cancion.reproducir();
        cancion.setLikes(52000);
        cancion.setReproducciones(55000);
        cancion.reproducir();
        cancion.reproducir();
        cancion.setUltimaReproduccion(fechaVieja);
        cancion.reproducir();
        cancion.reproducir();

    }


}

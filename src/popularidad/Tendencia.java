package popularidad;

import icono.Icono;
import model.Cancion;

import java.time.Duration;
import java.time.LocalDateTime;

public class Tendencia implements Popularidad {
    private final String ICONO = Icono.FIRE.texto();
    private final String LEYENDA = "Tendencia";
    @Override
    public Popularidad getPopularidad(Cancion cancion) {
        Duration tiempo = Duration.between(cancion.getUltimaReproduccion(), LocalDateTime.now());
        if(tiempo.toHours() > 24L){
            return new Normal();
        }
        return this;
    }
    @Override
    public String getLeyenda() {
        return this.ICONO + " - " + this.LEYENDA;
    }
}

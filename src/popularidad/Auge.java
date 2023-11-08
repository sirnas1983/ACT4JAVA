package popularidad;
import icono.Icono;
import model.Cancion;

public class Auge implements Popularidad {
    private String ICONO = Icono.ROCKET.texto();
    private String LEYENDA = "Auge";

    @Override
    public Popularidad getPopularidad(Cancion cancion) {
        if(cancion.getDislikes() > 5000){
            return new Normal();
        } else if (cancion.getLikes() > 20000 && cancion.getReproducciones() > 50000){
            return new Tendencia();
        } else {
            return this;
        }
    }

    @Override
    public String getLeyenda() {
        return this.ICONO + " - " + this.LEYENDA;
    }
}

package popularidad;

import icono.Icono;
import model.Cancion;

public class Normal implements Popularidad {

    private String ICONO = Icono.MUSICAL_NOTE.texto();
    private String LEYENDA = "Normal";
    @Override
    public Popularidad getPopularidad(Cancion cancion) {
        if(cancion.getReproducciones() > 1000){
            return new Auge();
        }
        return this;
    }
    @Override
    public String getLeyenda() {
        return this.ICONO + " - " + this.LEYENDA;
    }
}

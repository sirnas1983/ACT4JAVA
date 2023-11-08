package popularidad;

import model.Cancion;

public interface Popularidad {
    Popularidad getPopularidad(Cancion cancion);
    String getLeyenda();
}

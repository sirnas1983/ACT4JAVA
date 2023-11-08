package model;

import popularidad.Normal;
import popularidad.Popularidad;

import java.time.LocalDateTime;
import java.time.Year;
public class Cancion {
    private String nombre;
    private String album;
    private String artista;
    private Integer reproducciones;
    private Popularidad popularidad;
    private Year anio;
    private Integer likes;
    private Integer dislikes;
    private LocalDateTime ultimaReproduccion;


    public Cancion(){
        this.popularidad = new Normal();
        this.reproducciones = 0;
        this.likes = 0;
        this.dislikes = 0;
    }
    public Cancion(String nombre, String album, String artista, Integer reproducciones, Integer anio, Integer likes, Integer dislikes) {
        this.nombre = nombre;
        this.album = album;
        this.artista = artista;
        this.reproducciones = reproducciones;
        this.anio = Year.of(anio);
        this.popularidad = new Normal();
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public void reproducir(){
        this.popularidad = this.popularidad.getPopularidad(this);
        this.setUltimaReproduccion(LocalDateTime.now());
        System.out.printf("Reproduciendo: %s - %s - %s\n", this.artista, this.album, this.nombre);
        System.out.println(this.popularidad.getLeyenda());
        this.reproducciones ++;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public Integer getReproducciones() {
        return reproducciones;
    }
    public void setReproducciones(Integer reproducciones) {
        this.reproducciones = reproducciones;
    }
    public Popularidad getAuge() {
        return popularidad;
    }
    public void setAuge(Popularidad popularidad) {
        this.popularidad = popularidad;
    }
    public Popularidad getPopularidad() {
        return popularidad;
    }
    public void setPopularidad(Popularidad popularidad) {
        this.popularidad = popularidad;
    }
    public Integer getLikes() {
        return likes;
    }
    public void setLikes(Integer likes) {
        this.likes = likes;
    }
    public Year getAnio() {
        return anio;
    }
    public void setAnio(Integer anio) {
        this.anio = Year.of(anio);
    }
    public Integer getDislikes() {
        return dislikes;
    }
    public void setDislikes(Integer dislikes) {
        this.dislikes = dislikes;
    }

    public LocalDateTime getUltimaReproduccion() {
        return ultimaReproduccion;
    }

    public void setUltimaReproduccion(LocalDateTime ultimaReproduccion) {
        this.ultimaReproduccion = ultimaReproduccion;
    }
}

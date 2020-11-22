package com.example.petagram;

public class Pet {

    private int foto;
    private String nombre;
    private String NoLike;

    public Pet(int foto, String nombre, String NoLike) {
        this.foto = foto;
        this.nombre = nombre;
        this.NoLike = NoLike;
    }

    public int getFoto() {
        return foto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNoLike() {
        return NoLike;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNoLike(String NoLike) {
        this.NoLike = NoLike;
    }

    public void sumLike(){
        int NoLikeIn;
        NoLikeIn = Integer.parseInt(NoLike);
        NoLikeIn++;
        this.NoLike=String.valueOf(NoLikeIn);
    }
}

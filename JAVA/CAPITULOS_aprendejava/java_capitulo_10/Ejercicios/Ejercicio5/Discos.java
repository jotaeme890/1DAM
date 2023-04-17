package Ejercicios.Ejercicio5;

public class Discos {
    private String codigo = "LIBRE";
    private String autor;
    private String titulo;
    private String genero;
    private int duracion;

    public Discos(String codigo, String autor, String titulo, String genero, int duracion){
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public int getDuracion(){
        return this.duracion;
    }
    
    public void setDuracion(int duracion){
        this.duracion = duracion;
    }

    @Override
    public String toString(){
        return "Código: " + this.codigo + "\nAutor: " + this.autor + "\nTítulo: " + this.titulo + "\nGénero: " + this.genero + "\nDuración: " + this.duracion;
    }

    @Override
    public boolean equals(Object d) {
        return (this.codigo).equals(((Discos)d).getCodigo());
    }
}

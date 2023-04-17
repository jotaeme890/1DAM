package alumnos;

public class Alumno {
    // LOS DATOS EN LA BBDD SON id,nombre,apellidos
    // EL AUTOINCREMENT DE LA BBDD ES UN LONG, POR ESO ID ES LONG
    long id;
    String nombre;
    String apellidos;
    long idGrupo;
    String curso;
    
    public Alumno(){
        this(0,"","", 0, "");
    }

    public Alumno(long id, String nombre, String apellidos, long idGrupo, String nombreCurso){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.idGrupo = idGrupo;
        this.curso = nombreCurso;
    }

    public String getCurso(){
        return this.curso;
    }

    public void setCurso(String nombreCurso) {
        this.curso = nombreCurso;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(long idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Nombre: %s, Apellidos: %s, Grupo: %s", this.id, this.nombre, this.apellidos, this.idGrupo);
    }
}

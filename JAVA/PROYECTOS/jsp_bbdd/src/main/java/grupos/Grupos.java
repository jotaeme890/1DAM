package grupos;

public class Grupos {
    long id;
    String curso;
    String profesor;

    public Grupos(){
        this(0,"","");
    }

    public Grupos(long id , String curso,String profesor){
        this.id = id;
        this.curso = curso;
        this.profesor = profesor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    } 

    public String getProfesor() {
        return profesor;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return String.format("id: %d, Curso: %s, Profesor: %s", this.id, this.curso,this.profesor);
    }
}

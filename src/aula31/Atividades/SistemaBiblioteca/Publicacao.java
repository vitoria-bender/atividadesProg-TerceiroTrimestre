package aula31.Atividades.SistemaBiblioteca;

public abstract class Publicacao {
    private String titulo;
    private String autor;
    private float anoPublic;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }


    public float getAnoPublic() {
        return anoPublic;
    }
    public void setAnoPublic(float anoPublic) {
        this.anoPublic = anoPublic;
    }


    public abstract double Emprestar();

    public abstract double Devolver();



}

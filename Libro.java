import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serializable;

public class Libro implements Serializable{
private String Titulo;
private String autor;
private String editorial;
private int pagina;

public Libro(){
	Titulo = autor = editorial = null;
}

public Libro(String titulo, String autor, String editorial, int pagina) {
	super();
	Titulo = titulo;
	this.autor = autor;
	this.editorial = editorial;
	this.pagina = pagina;
}
public String getTitulo() {
	return Titulo;
}
public void setTitulo(String titulo) {
	Titulo = titulo;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public String getEditorial() {
	return editorial;
}
public void setEditorial(String editorial) {
	this.editorial = editorial;
}
public String getPagina() {
	return pagina;
}
public void setPagina(int pagina) {
	this.pagina = pagina;
}
public void entrada(BufferedReader ent) throws IOException{
	System.out.print("Titulo: "); Titulo = ent.readLine();
	System.out.print("Autor: "); autor = ent.readLine();
System.out.print("Editorial: "); editorial = ent.readLine();
	System.out.print("Paginas: ");
	pagina = Integer.parseInt(ent.readLine());
}

}

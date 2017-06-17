
/*
 * Para que un programa en java pueda convertir 
 * un objeto en un montón de bytes y pueda 
 * luego recuperarlo, el objeto necesita 
 * ser Serializable
 */
/*
 * Java transient sirven para demarcar el 
 * carácter temporal o transitorio de dicha 
 * variable, es decir, que no siempre se 
 * tendrá acceso al valor de la variable.
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serializable;
public class Disco implements Serializable {
private String artista;
private String titulo;
private int numCancion;
private int duracion;
private transient double precio;

public Disco()
{
  artista = titulo = null;
}

public Disco(String aartista, String titulo, 
		int numCancion,int duracion, double precio) {
	super();
	this.artista = aartista;
	this.titulo = titulo;
	this.numCancion = numCancion;
	this.duracion = duracion;
	this.precio = precio;
}

public String getartista() {
	return artista;
}

public void setartista(String aartista) {
	this.artista = aartista;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public int getNumCancion() {
	return numCancion;
}

public void setNumCancion(int numCancion) {
	this.numCancion = numCancion;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}
public void entrada(BufferedReader ent) throws IOException
{
  System.out.print("Cantante: "); artista = ent.readLine();
  System.out.print("Titulo: "); titulo = ent.readLine();
  System.out.print("Canciones: ");
  numCancion = Integer.parseInt(ent.readLine());
  System.out.print("Duración(minutos): ");
  duracion = Integer.parseInt(ent.readLine());
  System.out.print("Precio: ");
  precio = Double.valueOf(ent.readLine()).doubleValue();
}
}

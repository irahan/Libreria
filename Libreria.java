import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class Libreria {
public static void main(String[] args){
	
	BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
	File mf = new File("libreria.dat");
	ObjectOutputStream fobj = null;
	Libro libro = new Libro();
	Disco disco = new Disco();
	
	int tipo;
	boolean mas = true;
	
	try{
		fobj= new ObjectOutputStream(new 
				FileOutputStream(mf));
		do{
			System.out.println("Pulsa L(libro),"
					+ "D(disco), F(finalizar)");
			tipo = System.in.read();
	System.in.skip(2); //saltar caracteres fin de linea
	switch(tipo){
	case 'L':
	case 'l': 
		libro = new Libro();
	    libro.entrada(br);
	    fobj.writeObject(libro);
	    break;
	case 'D':
	case 'd': 
		disco = new Disco();
	    disco.entrada(br);
	    fobj.writeObject(disco);
	    break; 
	case 'F':
	case 'f':
		fobj.close();
		mas = false;
	}
		}while(mas);
	}
	catch(IOException e){
		e.printStackTrace();
	}
 }
}

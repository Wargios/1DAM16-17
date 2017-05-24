import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Principal {

	private static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {

		int opcion;
		do
		{
			opcion=mostrarMenu();
			tratarMenu(opcion);
		}while (opcion!=4);

	}

	private static void tratarMenu(int opc) {
		switch (opc)
		{
		case 1:
		{
			crearDirectorio();
			break;
		}
		case 2:
		{
			crearFichero();
			break;
		}
		case 3:
		{
			borrarFichero();
			break;
		}
		
		}
		
	}

	private static void borrarFichero() {
		String nombre;
		System.out.println("Introduce el nombre del fichero a borrar");
		nombre=teclado.nextLine();
		File fichero= new File (nombre);
		if (!(fichero.exists() && fichero.isFile()))
			System.out.println("Error. No existe un fichero con ese nombre.");
		else
		{
			if (fichero.delete())
				System.out.println("Fichero " + nombre + " borrado corectamente");
			else
				System.out.println("No se ha podido borrar el fichero");
		}
		
	}

	private static void crearFichero() {
		String nombre, contenido;
		System.out.println("Introduce el nombre del fichero");
		nombre=teclado.nextLine();
		
		
		File fichero= new File (nombre);
		if ( fichero.exists() && fichero.isFile())
			System.out.println("Error. Ya existe un fichero con ese nombre.");
		else
		{
			System.out.println("Introduce una cadena de texto que ser� el contenido del fichero: ");
			contenido=teclado.nextLine();
			
			try
			{
				FileWriter flujoEscritura=new FileWriter(fichero);
				PrintWriter filtroEscritura=new PrintWriter(flujoEscritura);
				
				filtroEscritura.print(contenido);
				
				filtroEscritura.close();
				flujoEscritura.close();
				System.out.println("Fichero creado correctamente");
			}
			catch (IOException e)
			{
				System.out.println(e.getMessage());
			}
			
		}
		
	}

	private static void crearDirectorio() {
		
		String nombre;
		boolean creado;
		System.out.println("Introduce el nombre del directorio");
		nombre=teclado.nextLine();
		
		File fichero= new File (nombre);
		if ( fichero.exists() && fichero.isDirectory())
			System.out.println("Error. Ya existe un directorio con ese nombre");
		else
		{
			creado=fichero.mkdir();
			if ( creado)
				System.out.println("Directorio creado correctamete");
			else
				System.out.println("No se pudo crear el directorio " + nombre);
		}
	}

	private static int mostrarMenu() {
		int opc;
		System.out.println("1.Crear directorio\n2.Crear fichero\n3.Borrar fichero\n4.Salir");
		opc=Integer.parseInt(teclado.nextLine());
		return opc;
	}

}

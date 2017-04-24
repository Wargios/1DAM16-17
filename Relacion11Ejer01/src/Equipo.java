import java.util.HashSet;
import java.util.Iterator;

public class Equipo {
	private String nombre;
	HashSet<Alumno> conjuntoAlumnos;

	public Equipo(String nombre) {
		setNombre(nombre);
		conjuntoAlumnos = new HashSet<Alumno>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void annadirAlumno(Alumno alumno) throws EquipoException {
		if (!conjuntoAlumnos.add(alumno))
			throw new EquipoException("El alumno ya se encuentra en el equipo.");
	}

	public void borrarAlumno(Alumno alumno) throws EquipoException {
		if (!conjuntoAlumnos.remove(alumno))
			throw new EquipoException("No existe el alumno para borrarlo.");
	}

	public Alumno buscarAlumno(Alumno alumnoBuscado) {
		Alumno alumnoEncontrado = null;
		Alumno alumnoActual;
		boolean encontrado = false;

		Iterator<Alumno> iterador = conjuntoAlumnos.iterator();
		while (iterador.hasNext() && !encontrado) {
			alumnoActual = iterador.next();

			if (alumnoActual.equals(alumnoBuscado)) {
				alumnoEncontrado = alumnoActual;
				encontrado = true;
			}
		}

		return alumnoEncontrado;
	}

	public Equipo unir(Equipo otro) {
		return null;
	}

	public Equipo interseccion() {
		return null;
	}

	public String listadoAlumnos() {
		StringBuilder sb = new StringBuilder();

		for (Alumno a : conjuntoAlumnos) {
			sb.append(a + "\n");
		}

		return sb.toString();
	}

	@Override
	public String toString() { // mostrar nombre y todos los alumnos

		return ("Equipo: " + nombre + "\n" + listadoAlumnos());
	}

}

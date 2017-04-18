import java.util.HashSet;
import java.util.Iterator;

public class Equipo {
	private String nombre;
	HashSet<Alumno> alumnos;

	public Equipo(String nombre) {
		setNombre(nombre);
		alumnos = new HashSet<Alumno>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void annadirAlumno(Alumno alumno) throws EquipoException {
		if (!alumnos.add(alumno))
			throw new EquipoException("El alumno ya se encuentra en el equipo.");
	}

	public void borrarAlumno(Alumno alumno) throws EquipoException {
		if (!alumnos.remove(alumno))
			throw new EquipoException("No existe el alumno para borrarlo.");
	}

	public Alumno buscarAlumno(Alumno alumnoBuscado) {
		Alumno alumnoActual;
		boolean encontrado = false;
		Iterator<Alumno> iterador = alumnos.iterator();

		while (iterador.hasNext() && !encontrado) {
			alumnoActual = iterador.next();
			if (encontrado) {
				
			}

		}

		return enc;
	}

	public Equipo unir(Equipo otro) {
		return null;
	}

	public Equipo interseccion() {
		return null;
	}

	@Override
	public String toString() { // mostrar nombre y todos los alumnos
		// TODO Auto-generated method stub
		return super.toString();
	}

}

package com.monroy.vehiculo;

public class AlmacenVehiculos {
	private Vehiculo[] vehiculos;
	private static int contadorVehiculos = 0;

	public AlmacenVehiculos(int cantidad) {
		vehiculos = new Vehiculo[cantidad];
	}

	public Vehiculo buscarVehiculo(String matricula) throws VehiculoException {
		boolean encontrado = false;
		Vehiculo vehiculo = null;

		for (int i = 0; i < contadorVehiculos && !encontrado; i++) {
			if (vehiculos[i].getMatricula().equals(matricula)) {
				encontrado = true;
				vehiculo = vehiculos[i];
			}
		}

		if (!encontrado)
			throw new VehiculoException("Vehiculo no encontrado.");

		return vehiculo;
	}
	
	public void altaVehiculo(Vehiculo vehiculo) throws VehiculoException {
		vehiculos[contadorVehiculos] = vehiculo;
		contadorVehiculos++;
	}

}

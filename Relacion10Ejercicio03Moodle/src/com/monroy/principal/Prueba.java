package com.monroy.principal;

import com.monroy.juegoRol.Clerigo;
import com.monroy.juegoRol.Mago;
import com.monroy.juegoRol.PersonajeException;
import com.monroy.juegoRol.TRaza;

public class Prueba {

	public static void main(String[] args) {
		Mago magoA, magoB;
		Clerigo clerigo;
		
		try {
			magoA = new Mago("Emiru", TRaza.ELFO, 13, 18, 100);
			magoB = new Mago("Kayros", TRaza.ELFO, 13, 20, 100);
			clerigo = new Clerigo("Kain", TRaza.HUMANO, 20, 16, 100, "Batman");

			System.out.println("Mago A aprende dos hechizos");
			magoA.aprenderHechizo("Hecatombe");
			magoA.aprenderHechizo("LuxArcana");
			System.out.println("Mago B aprende un hechizos");
			magoB.aprenderHechizo("fusrodah");

			System.out.println(magoA);
			System.out.println(magoB);

			System.out.println("Mago A: LUXARCANAAAA");
			magoA.lanzarHechizo("LuxArcana", magoB);
			System.out.println("Mago B: Fus....RODAH");
			magoB.lanzarHechizo("fusrodah", magoA);

			System.out.println("Clerigo C: Cura para mago B");
			clerigo.curar(magoB);

			System.out.println("HECATOMBE");
			magoA.lanzarHechizo("Hecatombe", magoB);

			System.out.println(magoA );
			System.out.println(magoB );
			System.out.println(clerigo );

		} catch (PersonajeException e) {
			System.out.println(e.getMessage());
		}

	}
}

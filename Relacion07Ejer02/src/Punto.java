
public class Punto {
	private double coorX;
	private double coorY;

	public Punto(double x, double y) {
		coorX = x;
		coorY = y;
	}

	public double getCoorX() {
		return coorX;
	}

	public void setCoorX(double coorX) {
		this.coorX = coorX;
	}

	public double getCoorY() {
		return coorY;
	}

	public void setCoorY(double coorY) {
		this.coorY = coorY;
	}
	
	
	public boolean equals(Punto otro) {
		boolean resul = false;
		
		if (coorX == otro.coorX && coorY == otro.coorY) 
			resul = true;
		
		return resul;
	}

	@Override
	public String toString() {
		return "Punto [coorX=" + coorX + ", coorY=" + coorY + "]";
	}
	
	

}

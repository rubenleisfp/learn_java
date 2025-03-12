package org.learn.clases.actividad304;

public class NaveEspacial {


	private int x=0;
    private int y=0;

    private int xMax;
    private int xMin;
    private int yMin;
    private int yMax;

    public NaveEspacial(int xMax, int xMin, int yMin, int yMax) {
        super();
        throw new UnsupportedOperationException("A implementar por el alumno");
    }

    public boolean moverDerecha() {
        throw new UnsupportedOperationException("A implementar por el alumno");
    }

    public boolean moverIzquierda() {
        throw new UnsupportedOperationException("A implementar por el alumno");
    }

    public boolean moverArriba() {
        throw new UnsupportedOperationException("A implementar por el alumno");
    }

    public boolean moverAbajo() {
        throw new UnsupportedOperationException("A implementar por el alumno");
    }
    

    public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "NaveEspacial [x=" + x + ", y=" + y + ", xMax=" + xMax + ", xMin=" + xMin + ", yMin=" + yMin + ", yMax="
				+ yMax + "]";
	}
	
	
}

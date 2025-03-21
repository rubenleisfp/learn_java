package org.learn.clases.actividad314;

public class NaveEspacial {


	private int x=0;
    private int y=0;

    private int xMax;
    private int xMin;
    private int yMin;
    private int yMax;

    public NaveEspacial(int xMax, int xMin, int yMin, int yMax) {
        //TODO a completar por el alumno
    }

    public boolean moverDerecha() {
        //TODO a completar por el alumno
        return true;
    }

    public boolean moverIzquierda() {
        //TODO a completar por el alumno
        return true;
    }

    public boolean moverArriba() {
        //TODO a completar por el alumno
        return true;
    }

    public boolean moverAbajo() {
        //TODO a completar por el alumno
        return true;
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

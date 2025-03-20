package org.learn.clases.actividad314;

public class NaveEspacial {


	private int x=0;
    private int y=0;

    private int xMax;
    private int xMin;
    private int yMin;
    private int yMax;

    public NaveEspacial(int xMax, int xMin, int yMin, int yMax) {
        super();
        this.xMax = xMax;
        this.xMin = xMin;
        this.yMin = yMin;
        this.yMax = yMax;
    }

    public boolean moverDerecha() {
        if (x < xMax) {
            x++;
            return true;
        } else {
            return false;
        }
    }

    public boolean moverIzquierda() {
        if (x > xMin) {
            x--;
            return true;
        } else {
            return false;
        }
    }

    public boolean moverArriba() {
        if (y < yMax) {
            y++;
            return true;
        } else {
            return false;
        }
    }

    public boolean moverAbajo() {
        if (y > yMin) {
            y--;
            return true;
        } else {
            return false;
        }
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

package punto;
public class Punto {
    private double x;
    private double y;

    /**
     * Constructor
     *
     */

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * Devuelve la coordenada X.
     *
     */
    public double getX() {
        return x;
    }

    /**
     * Devuelve la coordenada Y.
     *
     */
    public double getY() {
        return y;
    }




    /**
     * Devuelve la distancia a otro punto (Tª Pitágoras)
     *
     */
    public double distancia(Punto p2) {
        return Math.sqrt(Math.pow(x - p2.getX(), 2) +
                Math.pow(y - p2.getY(), 2));
    }

    /**
     * Compara si dos puntos son iguales
     *
     */
    public boolean compara(Punto p) {
        if (p.x==x && p.y==y)
            return true;
        else
            return false;
    }

}
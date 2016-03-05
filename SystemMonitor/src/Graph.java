import java.awt.*;

public abstract class Graph
{
    private double x;
    private double y;
    private double w;
    private double h;
    
    public Graph(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public double getWidth() {
        return w;
    }
    
    public double getHeight() {
        return h;
    }
    
    abstract void update();
}

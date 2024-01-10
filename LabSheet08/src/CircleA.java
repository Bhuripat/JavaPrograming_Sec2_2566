
public class CircleA {
	private double radius; //radius =2.0
    private String color;
    
    public void setRadius(double ra) {
        radius = ra;
    }
    
    public void setColor(String co) {
        color = co;
    }
    
    public String getColor() {
        return color;
    }
    
    public double getArea() {
        return Math.PI * radius*radius ;
    }
}

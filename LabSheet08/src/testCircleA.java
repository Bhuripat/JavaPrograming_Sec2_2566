
public class testCircleA {

	public static void main(String[] args) {
		CircleA c1 =new CircleA();
        CircleA c2 =new CircleA();
        CircleA c3 =new CircleA();
        
        c1.setRadius(2.0);
        c1.setColor("blue");
        
        System.out.print("Circle of odject c1 area is "+ c1.getArea());
        System.out.println(",and color is  "+c1.getColor());
        
        c2.setRadius(3.0);
        c2.setColor("red");
        
        System.out.print("Circle of odject c2 area is "+ c2.getArea());
        System.out.println(",and color is  "+c2.getColor());
        
        c3.setRadius(2.5);
        c3.setColor("green");
        
        System.out.print("Circle of odject c3 area is "+ c3.getArea());
        System.out.println(",and color is  "+c3.getColor());
    }

	}



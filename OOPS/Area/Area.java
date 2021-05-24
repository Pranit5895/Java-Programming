package Area;

public class Area {
	void calculateArea(float x)
    {
        System.out.println("Area of the square: "+x*x+" sq units");
    }
    void calculateArea(float x, float y)
    {
    	double area = 0.5*x*y;
        System.out.println("Area of the triangle: "+area+" sq units");
    }
    void calculateArea(double r)
    {
        double area = 3.14*r*r;
        System.out.println("Area of the circle: "+area+" sq units");
    }
	public static void main(String[] args) {
		Area obj = new Area();
	    obj.calculateArea(6.1f);
	    obj.calculateArea(10,22);
	    obj.calculateArea(6.1);
	}
}

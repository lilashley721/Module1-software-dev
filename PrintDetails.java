
public class PrintDetails {

	public static void main(String[] args) {
		Rectangle f = new Rectangle(4, 5);
		 
		//double[] sides = computeArea();
		// Number[] sides = computeArea(r.getLength(), r.getWidth(), r.getL2(),
			///	 r.getW2());
		 
		System.out.println("Rectangle with sides " + f.getLength() + " and " + 
		 f.getWidth() + " has area " + f.computeArea());
		
		Rectangle f2 = new Rectangle(5.7,8.1);
		
		System.out.println("Rectangle with sides " + f2.getLength() + " and " + 
				 f2.getWidth() + " has area " + f2.computeArea());
		
		Circle c = new Circle(3.2);
		
		System.out.println("Rectangle with radius " + c.getRadius() + 
			 " has area " +c.computeArea());
		
		Circle c2 = new Circle(4.0);
		
		System.out.println("Rectangle with radius " + c2.getRadius() + 
			 " has area " +c2.computeArea());
		
		

	}

}

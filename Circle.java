
public class Circle {
	//Creating variables
		 double radius; 
		 double pi = 3.14;
		
		//getters getRadius()
		public double getRadius() {
			return radius;
		}
		
		//setter
		public void setLength(int newRadius) {
			this.radius = newRadius;
		}
		
		//constructor
		public Circle(double newRadius) {
			this.radius = newRadius;
		
		}
		
		//Overloaded constructer with no arguments 
		public Circle(){
			radius = 0;
			 
		}
		
		
		double computeArea() {
			return pi *radius * radius ;
			
		}

}

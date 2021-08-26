
public class Rectangle {
	//Creating variables
	  double length; 
	  double width;
	  
	  //O - argument constructor that sets fields to 0 
	  Rectangle(){
			length = 0;
			width = 0;
		
				}
		//Setters
	 public void setLength(double newLength) {
			this.length = newLength;
		}
		
	public void setWidth(double newWidth) {
			this.width = newWidth;
		}
	
		//getters
	 public double getLength() {
			return this.length;
		}
	 public double getWidth() {
			return this.width;
		}
	 //Constructor that accepts length and width as parameters 
	 Rectangle(double newLength, double newWidth) {
		 this.length = newLength;
		 this.width = newWidth;
	 }
	 
	 double computeArea(){
		 return length * width;
		 
	 }
		
	
	
}

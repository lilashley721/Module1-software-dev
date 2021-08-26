
public class Rectangle1 {
	//Creating variables
	 int length; 
	 int width;
	 double l2;
	 double w2;
	 
	//Overloaded constructer with no arguments 
	Rectangle1(){
		length = 0;
		width = 0;
		l2 = 0;
		w2 = 0;
			}

	//constructor
	 Rectangle1(int length, int width, double l2, double w2) {
		 Rectangle1 r = new Rectangle1();
		 r.setLength(4);
		 r.setWidth(5);
		 r.setL2(5.7);
		 r.setW2(8.1);
		}
	
		//Setters
	 public void setLength(int newLength) {
			this.length = newLength;
		}
		
	public void setWidth(int newWidth) {
			this.width = newWidth;
		}
	 
	 public void setL2(double newLength2) {
			this.l2 = newLength2;
		}
	 public void setW2(double newWidth2) {
			this.w2 = newWidth2;
		}
	 
	
		//getters
	 public int getLength() {
			return this.length;
		}
	 public int getWidth() {
			return this.width;
		}
	 public double getL2() {
			return this.l2;
		}
	 public double getW2() {
			return this.w2;
		}
	
	/*Number[]getRectangleSides(int length, int width, double l2, double w2) {
		Number[] sides = new Number[4];
		sides[0] = length * width;
		sides[1] = l2 * w2;
		sides[2] = 5.7;
		sides[3] = 8.1;
		return sides;
				
	}
	*/
		/* public static void main(String[] args) {
	 Rectangle r = new Rectangle();
	 r.setLength(4);
	 r.setWidth(5);
	 r.setL2(4);
	 r.setW2(5);
	 //System.out.println(r.getL2());
	 //Setters
 }
 */
	
	
	 public double computeArea() {
		return length * width;
		
		//return l2 * w2;
	}
	
	

}


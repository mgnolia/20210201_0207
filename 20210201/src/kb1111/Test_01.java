package kb1111;

public abstract class Test_01 {

	public static void main(String[] args) {
		double rad = 0;
		final double PI = 3.14;
		
		public Circle(double r) {
			setRad(r);
		}
		Public double getArea() {
			return (rad * rad) * PI;
		}
		public void setRad(double r) {
			if(r<0) {
				rad = 0;
				return;
			}
			rad = r;
		}
	}
	

}

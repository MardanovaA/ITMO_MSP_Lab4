public class Square implements SquareMBean {

	double square;
	public Square(){
		square = 0;
	}
	public double getAreaSquare(double r){
		square = (r*r/2)+(r*r/4)+(r*r*3.14/4);
		System.out.println(square);
		
		return square;		
	}
}
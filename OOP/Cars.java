package OOP;

public class Cars {// implements Comparable<Cars> {
	
	int price;
	int speed;
	String colour;
	
//	constructor1
	public Cars() {
		
	}
	
//	constructor2
	public Cars(int price, int speed, String colour) {
		this.price= price;
		this.speed=speed;
		this.colour=colour;
	}
	
	public String toString() {
		return "Price:"+ this.price+" ,Speed:"+this.speed+" ,Colour:"+this.colour;
	}

//	@Override
//	public int compareTo(Cars o) { //o will have the address of the arr[i+1]
//		// TODO Auto-generated method stub
////		return o.speed- this.speed;
////		return this.price- o.price;
//		return this.colour.compareTo(o.colour);
//	}

}

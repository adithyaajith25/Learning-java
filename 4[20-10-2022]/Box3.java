
class Box{
	double length,breadth,height;
	Box(){
		length=10; breadth=3; height=4;
	}
	double vol(){
		return length*breadth*height;
	}
}
class Box3{
	public static void main(String args[]){
		Box b=new Box();
		System.out.println("Volume of box is "+b.vol());
	}
}
		

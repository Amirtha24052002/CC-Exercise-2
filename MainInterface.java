interface Area{
	final int a=12;
	final int b=2;
	final float pi=3.14f;
	
	public int AreaSquare();
	public int AreaRect();
	public void AreaCircle();
}

interface Perimeter{
	public int PeriSquare();
	public int PeriRect();
	public void PeriCircle();
}

class Shapes implements Area,Perimeter{
	public int AreaSquare(){
		return a*a;
	}
	public int PeriSquare(){
		return 4*a;
	}
	public int AreaRect(){
		return a*b;
	}
	public int PeriRect(){
		return 2*(a+b);
	}
	public void AreaCircle(){
		System.out.println("Area of Circle:"+(float)pi*(a*a));
	}
	public void PeriCircle(){
		System.out.println("Area of Circle:"+(float)2*pi*a);
	}
}

class MainInterface{
	public static void main(String args[]){
		Area ar=new Shapes();
		Perimeter p=new Shapes();

		System.out.println("SQUARE");
		System.out.println("***********");
		System.out.println("Area of Square:"+ar.AreaSquare());
		System.out.println("Perimeter of Square:"+p.PeriSquare());
		System.out.println("\n");

		System.out.println("RECTANGLE");
		System.out.println("***********");
		System.out.println("Area of Rectangle:"+ar.AreaRect());
		System.out.println("Perimeter of Rectangle:"+p.PeriRect());
		System.out.println("\n");

		System.out.println("Circle");
		System.out.println("***********");
		ar.AreaCircle();
		p.PeriCircle();		
	}
}
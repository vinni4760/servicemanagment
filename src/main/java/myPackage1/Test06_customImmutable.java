package myPackage1;
class Example{
	private int x;
	public Example(int x) {
		this.x = x;	// TODO Auto-generated constructor stub
	}
	void modify(int x) {
		this.x = this.x+x;
	}
	int getX() {
		return this.x;
	}
	public String toString() {
		return ""+ x;
	}
}
class Sample{
	private int x;
	public Sample(int x) {
		this.x =x;
	}
	public Sample modify(int x) {
		 return new Sample( this.x+x);
 }
	public String toString() {
		return ""+this.x;
	}
	
}
public class Test06_customImmutable {
	public static void main(String[] args) {
		Example e = new Example(5);
		System.out.println(e);
		e.modify(6);
		System.out.println(e);
		
		Sample  s1 = new Sample(5);
		System.out.println(s1);
		s1.modify(7);
		System.out.println(s1);
		
	}

}

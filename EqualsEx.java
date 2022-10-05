class Point6 {
	int x, y;
	public Point6(int x, int y) {
		this.x = x; this.y = y;
}
public boolean equals(Object obj) {
	Point6 p = (Point6)obj;
	if(x == p.x && y == p.y) return true;
	else return false;
	}
}

public class EqualsEx {
	public static void main(String[] args) {
		Point6 a = new Point6(2,3);
		Point6 b = new Point6(2,3);
		Point6 c = new Point6(3,4);
		
if(a == b) // false
	System.out.println("a==b");
if(a.equals(b)) // true
	System.out.println("a is equal to b");
if(a.equals(c)) // false
	System.out.println("a is equal to c");
	}
}
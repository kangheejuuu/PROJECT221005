
public class Q05 {
    
    public static void main(String[] args) {
        ColorPoint3 cp = new ColorPoint3(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str + "입니다.");
    }
 
}
 
 
class ColorPoint3 extends Point3{
    private String Color;
    
    public ColorPoint3(int x, int y, String Color) {
        super();
        this.Color = Color;
    }
    
    public void setXY(int x, int y) {
        move(x,y);
    }
    public void setColor(String Col) {
        Color = Col;
    }
    public String getColor() {
        return Color;
    }
    public String toString() {
        String str = getColor()+"색의 ("+getX()+","+getY()+")의 점";
        return str;
    }
}
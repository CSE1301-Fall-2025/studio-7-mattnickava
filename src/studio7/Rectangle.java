public class Rectangle {
private double length; 
private double width; 

public Rectangle(double tempLength, double tempWidth){
    this.length = tempLength;
    this.width = tempWidth;
}

/** 
@param length represents length of rectangle
@param width represents width of rectangle
**/

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width); 
    }

    public boolean getisSqaure() {
        return length == width;
    }

public static void main(String[]args) {
    Rectangle R = new Rectangle(10, 10.5);
    System.out.println("The area is" + R.getArea());
    System.out.println("The perimeter is" + R.getPerimeter());
    System.out.println("Is it a square?" + R.getisSqaure());

    

}




}

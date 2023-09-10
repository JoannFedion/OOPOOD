abstract class Figure {
    public abstract double getArea();

}

class Rectangle extends Figure {
    public double weight;
    public double height;
    Rectangle(double weight, double height){
        this.weight = CheckingNonNegativity.check(weight);
        this.height = CheckingNonNegativity.check(height);
    }
    public double getArea(){
        return this.weight * this.height;
    }


}

class Square extends Figure{
    public double side;
    Square(double side){
        this.side = CheckingNonNegativity.check(side);
    }
    public double getArea(){
        return this.side * this.side;
    }
}
class Circle extends Figure{
    private double radius;
    Circle(double radius){
        this.radius = CheckingNonNegativity.check(radius);
    }
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
}
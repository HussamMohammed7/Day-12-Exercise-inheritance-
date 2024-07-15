public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    @Override
    public String toString() {
          return "Square{" + "\n" +
                  "color = '" + super.getColor() + "\n" +
                  ", filled = " + super.isFilled() +"\n" +
                "Side = " + getSide() +"\n" +
                "Area = " + getArea()+"\n" +
                "Perimeter = " + getPerimeter()+"\n" +
                "} ";
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }


}

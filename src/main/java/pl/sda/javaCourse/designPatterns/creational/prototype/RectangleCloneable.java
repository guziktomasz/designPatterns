package pl.sda.javaCourse.designPatterns.creational.prototype;
/*
* wzorzec prototype typu shallow: pola obiektu, które są referencjami do innych obiektów nie będą
* w klonie osobnymi obiektami
* */
public class RectangleCloneable implements Cloneable {

    private Point point;

    private int width;
    private int height;

    public RectangleCloneable(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    protected RectangleCloneable clone() {
        try {
            return (RectangleCloneable) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(this.getClass().getName() + " nie implementuje Cloaneable!!");
            return null;
        }
    }

    @Override
    public String toString() {
        return "RectangleCloneable{" +
                "point=" + point +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}

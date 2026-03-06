
interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class Point implements Movable {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveUp()    { y++; }
    public void moveDown()  { y--; }
    public void moveLeft()  { x--; }
    public void moveRight() { x++; }

    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}

class Circle implements Movable {
    Point center;
    int radius;

    public Circle(int x, int y, int radius) {
        this.center = new Point(x, y);
        this.radius = radius;
    }

    public void moveUp()    { center.moveUp(); }
    public void moveDown()  { center.moveDown(); }
    public void moveLeft()  { center.moveLeft(); }
    public void moveRight() { center.moveRight(); }

    public String toString() {
        return "Circle(center=" + center + ", radius=" + radius + ")";
    }
}

class MovableDemo {
    public static void main(String[] args) {
        Point p = new Point(0, 0);
        System.out.println("Initial Point:   " + p);
        p.moveUp();
        System.out.println("After moveUp:    " + p);
        p.moveRight();
        System.out.println("After moveRight: " + p);
        p.moveDown();
        System.out.println("After moveDown:  " + p);
        p.moveLeft();
        System.out.println("After moveLeft:  " + p);

        System.out.println();

        Circle c = new Circle(5, 5, 10);
        System.out.println("Initial Circle:  " + c);
        c.moveUp();
        System.out.println("After moveUp:    " + c);
        c.moveLeft();
        System.out.println("After moveLeft:  " + c);
    }
}
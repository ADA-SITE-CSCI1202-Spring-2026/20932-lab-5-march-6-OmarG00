class Rectangle2 {
    int width, height;

    public Rectangle2(int w, int h) {
        width = w;
        height = h;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Rectangle2) {
            Rectangle2 rect = (Rectangle2) obj;
            return this.width == rect.width && this.height == rect.height;
        }
        return false;
    }
}

class Square extends Rectangle2 {
    public Square(int side) {
        super(side, side); 
    }
}

class Main {
    public static void main(String[] args) {
        Object o1 = new Rectangle2(5, 10);
        Object o2 = new Rectangle2(15, 15);
        Object o3 = new Square(15);
        System.out.println("Objects are identical: " + o1.equals(o2)); // false
        System.out.println("Objects are identical: " + o1.equals(o3)); // false
        System.out.println("Objects are identical: " + o2.equals(o3)); // true
    }
}
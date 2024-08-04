package shapes;

import telran.util.Arrays;
public class Canvas implements Shape {
    Shape[] shapes;

    public Canvas() {
        shapes = new Shape[0];
    }

    public void addShape(Shape shape) {
        shapes = Arrays.insert(shapes, shapes.length, shape);
    }

    @Override
    public int perimiter() {
        int res = 0;
        for (Shape shape : shapes) {
            res += shape.perimiter();
        }
        return res;
    }

    @Override
    public int square() {
        int res = 0;
        for (Shape shape : shapes) {
            res += shape.square();
        }
        return res;
    }
    
}
package shapes;

import telran.util.Arrays;
public class Canvas implements Shape {   // В данном случае, класс Canvas  предоставляет реализацию для метода Shape обязуясь предоставить реализацию для всех методов, объявленных в интерфейсе..Canvas реализует Shape shapes.canvas
    Shape[] shapes; // массив фигур

    public Canvas() {
        shapes = new Shape[0];
    }

    public void addShape(Shape shape) {
        shapes = Arrays.insert(shapes, shapes.length, shape); // масиив,длину,фигуру
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
    
    public int count() {
        int res = 0;
        for (Shape shape : shapes) {
            res++;
            if (shape instanceof Canvas) {
                res += ((Canvas)shape).count();
            }
        }
        return res;
    }
}
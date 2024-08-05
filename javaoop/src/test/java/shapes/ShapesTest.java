package shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ShapesTest {

  @Test
  public void rectangleTest() {
    Rectangle rectangle = new Rectangle(7, 2);
    assertEquals(18, rectangle.perimiter());
    assertEquals(14, rectangle.square());
  }

  @Test
  public void squareTest() {
    Square square = new Square(8);
    assertEquals(32, square.perimiter());
    assertEquals(64, square.square());
  }

  @Test
  void canvasTest() {
    Canvas canvas = new Canvas();

    Shape rectangle = new Rectangle(7, 4);
    Shape square = new Square(50);

    Canvas canvas1= new Canvas();
    canvas1.addShape(rectangle);
    canvas1.addShape(square);

    canvas.addShape(rectangle);
    canvas.addShape(square);
    canvas.addShape(canvas1);

    int expectedLength = 3;
    int expectedPerimeter = (rectangle.perimiter() + square.perimiter()) * 2;
    int expectedSquare = (rectangle.square() + square.square()) * 2;

    assertEquals(expectedLength, canvas.shapes.length);
    assertEquals(expectedPerimeter, canvas.perimiter());
    assertEquals(expectedSquare, canvas.square());

  }
  @Test()
  void countTest() {
      Canvas inCanvas = new Canvas();
      inCanvas.addShape(new Square(7));
      inCanvas.addShape(new Rectangle(3, 8));

      Canvas canvas = new Canvas();
      canvas.addShape(inCanvas);
      canvas.addShape(new Square(10));
      canvas.addShape(new Rectangle(8, 9));
      assertEquals(5, canvas.count());
  }
}
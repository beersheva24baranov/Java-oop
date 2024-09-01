package shapes;

public class Rectangle implements Shape{ // квадрат реализует фигуру у которой есть высота и ширина 
   private int width;
   private int height;
   public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
   }
    @Override //* Указывает, что объявление метода предназначено для переопределения объявления метода в супертипе. 
   // Если метод аннотирован этим типом аннотации, компиляторы должны генерировать сообщение об ошибке, если не выполняется хотя бы одно из следующих условий:
   // Этот метод переопределяет или реализует метод, объявленный в супертипе.
    //У метода есть сигнатура, эквивалентная сигнатуре любого открытого метода, объявленного в Object.  
    
    public int perimiter() {
       return 2 * (width + height);
    }

    @Override
    public int square() {
        return width * height;
    }

}
//* */

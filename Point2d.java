// Двумерный класс точки
public class Point2d {
    // Координата X
    protected double xCoord;
    // Координата Y
    protected double yCoord;
    // Конструктор инициализации
    public Point2d ( double x, double y) {
        this.xCoord = x;
        this.yCoord = y;
    }
    // Конструктор по умолчанию
    public Point2d () {
        // Вызов конструктора с двумя параметрами и определение источника
        this(0, 0);
    }
    // Возвращение координаты Х
    public double getX () {
        return xCoord;
    }
    // Возвращение коордиаты Y
    public double getY (){
        return yCoord;
    }
    // Установка значения координаты Х
    public void setX (double val) {
        xCoord = val;
    }
    // Установка значения координаты Y
    public void setY (double val) {
        yCoord = val;
    }
}



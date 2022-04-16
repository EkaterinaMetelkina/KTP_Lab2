import java.math.BigDecimal;
import java.math.RoundingMode;

// Трехмерный класс точки
public class Point3d extends Point2d {
    // Координата Z
    private double zCoord;
    // Конструктор инициализации
    public Point3d (double x, double y, double z) {
        super(x, y);
        this.zCoord = z;
    }
    // Конструктор по умолчанию
    public Point3d () {
        // Вызов конструктора с двумя параметрами и определение источника
        this(0, 0, 0);
    }
    // Возвращение коордиаты Z
    public double getZ () {
        return zCoord;
    }
    // Установка значения координаты Z
    public void setZ (double val) {
        zCoord = val;
    }
    // Сравнение двух объектов
    public boolean equals (Point3d point) {
        if (point.xCoord == xCoord && point.yCoord == yCoord && point.zCoord == zCoord) {
            return true;
        }
        return false;
    }
    // Вычисление расстояния между двумя точками
    public double distanceTo (Point3d point) {
        return round(Math.sqrt(Math.pow(point.xCoord - xCoord, 2) + Math.pow(point.yCoord - yCoord, 2) + Math.pow(point.zCoord - zCoord, 2)), 2);
    }

    public static double round(double val, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(val));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}

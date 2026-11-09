package ua.opnu.movable;

public class MainMovable {
    public static void main(String[] args) {
        // Створюємо об'єкт Point, який реалізує інтерфейс Movable
        Movable point = new Point(0.0, 0.0);

        System.out.println("Початкові координати: X = " + point.getX() + ", Y = " + point.getY());

        // Змінюємо координати за допомогою сеттерів
        point.setX(5.5);
        point.setY(10.2);
        System.out.println("Після встановлення нових координат: X = " + point.getX() + ", Y = " + point.getY());

        // Переміщуємо точку за допомогою методу moveTo
        point.moveTo(15.0, 25.0);
        System.out.println("Після переміщення (moveTo): X = " + point.getX() + ", Y = " + point.getY());
    }
}
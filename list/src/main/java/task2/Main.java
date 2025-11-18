package task2;

public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкт Point
        // (Припускаємо, що у вас є конструктор new Point(x, y),
        // якщо ні - використовуйте new Point() і сетери)
        Movable point = new Point(10, 20);

        System.out.println("Початкові координати:");
        System.out.println("X: " + point.getX());
        System.out.println("Y: " + point.getY());

        // Рухаємо точку
        point.moveTo(50, 100);

        System.out.println("Нові координати після переміщення:");
        System.out.println("X: " + point.getX());
        System.out.println("Y: " + point.getY());
    }
}
package task3;

import java.util.Arrays; // Імпортуємо для гарного виводу координат

public class Main {
    public static void main(String[] args) {
        // 1. Створюємо об'єкт Smartphone
        Smartphone myPhone = new Smartphone();

        System.out.println("=== Тестування функцій телефону ===");

        // 2. Перевіряємо методи інтерфейсу Cellular
        myPhone.makeCall();
        myPhone.receiveCall();

        // 3. Перевіряємо методи інтерфейсу GPS
        double[] coordinates = myPhone.getCoordinates();

        // Виводимо координати. Оскільки це масив, зручно використати Arrays.toString()
        System.out.println("GPS координати: " + Arrays.toString(coordinates));

        // Або можна вивести окремо:
        // System.out.println("Широта: " + coordinates[0]);
        // System.out.println("Довгота: " + coordinates[1]);
    }
}
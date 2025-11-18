package task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone();

        System.out.println("=== Тестування функцій телефону ===");

        myPhone.makeCall();
        myPhone.receiveCall();

        double[] coordinates = myPhone.getCoordinates();

        System.out.println("GPS координати: " + Arrays.toString(coordinates));

    }
}
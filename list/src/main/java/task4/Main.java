package task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[4];

        cars[0] = new Car(10000, 2010, 150); // Середнячок
        cars[1] = new Car(20000, 2020, 300); // Дорогий, але новий і потужний
        cars[2] = new Car(10000, 2015, 150); // Така ж ціна як у [0], але новіший
        cars[3] = new Car(5000,  1990, 100); // Найдешевший

        System.out.println("=== До сортування ===");
        printCars(cars);

        Arrays.sort(cars);

        System.out.println("\n=== Після сортування (Arrays.sort) ===");
        System.out.println("Примітка: Arrays.sort сортує від 'меншого' до 'більшого'.");
        System.out.println("За нашою логікою: дешевші, новіші та потужніші - це 'більші' авто, тому вони будуть в кінці.");
        printCars(cars);

        System.out.println("\n=== Тест ручного порівняння ===");
        Car carA = cars[0]; // 10000$
        Car carB = cars[3]; // 5000$ (Кращий за ціною)

        int result = carB.compareTo(carA);
        if (result > 0) {
            System.out.println("Авто за 5000$ 'більше' (краще), ніж авто за 10000$");
        } else {
            System.out.println("Авто за 5000$ 'менше', ніж авто за 10000$");
        }
    }

    public static void printCars(Car[] cars) {
        for (Car car : cars) {
            System.out.println("Авто -> Ціна: " + car.getPrice() +
                    " | Рік: " + car.getYear() +
                    " | HP: " + car.getHorsePower());
        }
    }
}
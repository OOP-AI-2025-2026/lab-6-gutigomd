package task3;

interface GPS {
    double[] getCoordinates();
}

interface Cellular {
    void makeCall();
    void receiveCall();
}

class Smartphone implements GPS, Cellular {

    // Реалізація методу GPS
    @Override
    public double[] getCoordinates() {
        // Повертаємо приклад координат (широта, довгота)
        return new double[]{50.4501, 30.5234};
    }

    // Реалізація методів Cellular
    @Override
    public void makeCall() {
        System.out.println("Виконується виклик...");
    }

    @Override
    public void receiveCall() {
        System.out.println("Вхідний дзвінок...");
    }
}

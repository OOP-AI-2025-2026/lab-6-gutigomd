package task3;

interface GPS {
    double[] getCoordinates();
}

interface Cellular {
    void makeCall();
    void receiveCall();
}

class Smartphone implements GPS, Cellular {

    @Override
    public double[] getCoordinates() {
        return new double[]{50.4501, 30.5234};
    }

    @Override
    public void makeCall() {
        System.out.println("Виконується виклик...");
    }

    @Override
    public void receiveCall() {
        System.out.println("Вхідний дзвінок...");
    }
}

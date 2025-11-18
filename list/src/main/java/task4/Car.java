package task4;

class Car implements Comparable {
    private int price;
    private int year;
    private int horsePower;

    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    // Гетери та сетери
    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getHorsePower() { return horsePower; }
    public void setHorsePower(int horsePower) { this.horsePower = horsePower; }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Car) {
            Car other = (Car) o;

            // 1. Порівняння ціни ("більше" той, у якого менша ціна)
            int priceDiff = other.price - this.price;
            if (priceDiff != 0) {
                return priceDiff;
            }

            // 2. Порівняння року ("більше" той, який менший за віком -> тобто рік випуску більший)
            int yearDiff = this.year - other.year;
            if (yearDiff != 0) {
                return yearDiff;
            }

            // 3. Порівняння к.с. ("більше" той, де більше сил)
            return this.horsePower - other.horsePower;
        }
        return 0;
    }
}

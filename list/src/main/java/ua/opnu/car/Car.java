package ua.opnu.car;

// Використовуємо сирий (raw) тип Comparable, як вимагає завдання
public class Car implements Comparable {

    private int price;
    private int year;
    private int horsePower;

    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getHorsePower() { return horsePower; }
    public void setHorsePower(int horsePower) { this.horsePower = horsePower; }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Car)) {
            return 0;
        }

        Car other = (Car) o;

        // 1. Порівнюємо ціну (менша ціна = "більший" автомобіль, тобто він кращий/пріоритетніший)
        // Якщо this.price менша за other.price, this має бути "більшим" (повертаємо 1)
        if (this.price != other.price) {
            return other.price - this.price; // Якщо other.price більша, результат позитивний (this > other)
        }

        // 2. Порівнюємо рік (менший рік = "більший" автомобіль)
        if (this.year != other.year) {
            return other.year - this.year;
        }

        // 3. Порівнюємо кінські сили (більше сил = "більший" автомобіль)
        return this.horsePower - other.horsePower;
    }
}
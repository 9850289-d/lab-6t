package ua.opnu.phone;

import java.util.Arrays;

public class MainPhone {
    public static void main(String[] args) {
        // Створюємо об'єкт смартфона (який реалізує і GPS, і Cellular)
        Smartphone myPhone = new Smartphone();

        System.out.println("--- Тестування інтерфейсу Cellular ---");
        myPhone.makeCall();
        myPhone.receiveCall();

        System.out.println("\n--- Тестування інтерфейсу GPS ---");
        double[] coords = myPhone.getCoordinates();
        System.out.println("Отримані координати: " + Arrays.toString(coords));
    }
}
package ua.opnu.phone;

// Клас реалізує одразу ДВА інтерфейси
public class Smartphone implements GPS, Cellular {

    @Override
    public double[] getCoordinates() {
        // Повертаємо якісь фейкові координати для прикладу (широта, довгота)
        return new double[]{46.4825, 30.7233};
    }

    @Override
    public void makeCall() {
        System.out.println("Смартфон телефонує...");
    }

    @Override
    public void receiveCall() {
        System.out.println("Смартфон приймає дзвінок...");
    }
}
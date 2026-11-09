package ua.opnu.car;

public class MainCar {
    public static void main(String[] args) {
        // Створюємо кілька автомобілів з різними цінами, роками та кінськими силами
        Car car1 = new Car(15000, 2018, 150); // Дешевша, новіша
        Car car2 = new Car(20000, 2020, 180); // Дорожча
        Car car3 = new Car(15000, 2018, 200); // Така ж ціна і рік, але більше кінських сил

        // Порівнюємо автомобілі за допомогою методу compareTo
        // Умова: менша ціна -> "більший" об'єкт (повертає позитивне число)
        System.out.println("Порівняння car1 і car2 (очікуємо > 0, бо car1 дешевша): " + car1.compareTo(car2));
        System.out.println("Порівняння car2 і car1 (очікуємо < 0, бо car2 дорожча): " + car2.compareTo(car1));

        // Порівнюємо car1 та car3 (ціна та рік однакові, у car3 більше кінських сил -> "більший")
        System.out.println("Порівняння car1 і car3 (очікуємо < 0, бо у car3 більше к.с.): " + car1.compareTo(car3));
    }
}
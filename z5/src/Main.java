public class Main {
    public static void main(String[] args) {
        PetClinic clinic = new PetClinic();

        try {
            // Создание питомцев
            Dog dog1 = new Dog("Бобик", 3, "Овчарка");
            Cat cat1 = new Cat("Мурка", 2, "Черный");

            // Добавление питомцев в клинику
            clinic.addPet(dog1);
            clinic.addPet(cat1);

            // Попытка добавить питомца с уже существующим именем
            Dog dog2 = new Dog("Бобик", 4, "Лабрадор");
            clinic.addPet(dog2); // Это вызовет исключение

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Вывод информации о питомцах
        clinic.displayPets();
    }
}

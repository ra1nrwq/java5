import java.util.ArrayList;
import java.util.List;

class PetClinic {
    private List<Pet> pets;

    public PetClinic() {
        pets = new ArrayList<>();
    }

    // Метод для добавления питомца в клинику
    public void addPet(Pet pet) throws Exception {
        for (Pet existingPet : pets) {
            if (existingPet.getName().equals(pet.getName())) {
                throw new Exception("Питомец с именем " + pet.getName() + " уже существует в клинике.");
            }
        }
        pets.add(pet);
        System.out.println("Питомец " + pet.getName() + " успешно добавлен в клинику.");
    }

    // Метод для вывода информации о всех питомцах
    public void displayPets() {
        if (pets.isEmpty()) {
            System.out.println("В клинике нет питомцев.");
            return;
        }
        for (Pet pet : pets) {
            pet.displayInfo();
            System.out.println("----------------------------");
        }
    }
}

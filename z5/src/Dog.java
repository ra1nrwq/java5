class Dog extends Pet {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age, PetType.DOG);
        this.breed = breed;
    }

    @Override
    public void displayInfo() {
        System.out.println("Тип: Собака");
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Порода: " + breed);
        System.out.println("Состояние здоровья: " + healthStatus);
    }
}


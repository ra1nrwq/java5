class Cat extends Pet {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age, PetType.CAT);
        this.color = color;
    }

    @Override
    public void displayInfo() {
        System.out.println("Тип: Кошка");
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Цвет: " + color);
        System.out.println("Состояние здоровья: " + healthStatus);
    }
}

enum PetType {
    DOG, CAT
}

enum HealthStatus {
    HEALTHY, SICK
}

abstract class Pet {
    protected String name;
    protected int age;
    protected PetType type;
    protected HealthStatus healthStatus;

    public Pet(String name, int age, PetType type) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.healthStatus = HealthStatus.HEALTHY; // По умолчанию питомец здоров
    }

    public abstract void displayInfo();

    public HealthStatus getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }

    public String getName() {
        return name;
    }
}

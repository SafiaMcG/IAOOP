public abstract class CyberPet {
    private String name;
    private int hunger;      // 0 = not hungry, 100 = very hungry
    private int tiredness;   // 0 = not tired, 100 = very tired
    private int happiness;   // 0 = very sad, 100 = very happy

    public static final int MAX_VALUE = 100;
    public static final int MIN_VALUE = 0;

    public CyberPet(String name) {
        this.name = name;
        this.hunger = 0;      // pet starts not hungry
        this.tiredness = 0;   // pet starts not tired
        this.happiness = 100; // pet starts happy
    }

    public void feed() throws IllegalStateException {
        if (hunger <= MIN_VALUE) {
            throw new IllegalStateException(name + " is too full to eat more!");
        }
        if (tiredness >= MAX_VALUE) {
            throw new IllegalStateException(name + " is too tired to eat!");
        }
        hunger = Math.max(MIN_VALUE, hunger - 10);  // Feeding decreases hunger
        happiness = Math.max(MIN_VALUE, happiness - 5); // Slight happiness decrease
        tiredness = Math.min(MAX_VALUE, tiredness + 5); // Slight tiredness increase
        System.out.println(name + " has been fed. Hunger: " + hunger + ", Tiredness: " + tiredness + ", Happiness: " + happiness);
    }

    public void play() throws IllegalStateException {
        if (hunger >= MAX_VALUE) {
            throw new IllegalStateException(name + " is too hungry to play!");
        }
        if (tiredness >= MAX_VALUE) {
            throw new IllegalStateException(name + " is too tired to play!");
        }
        hunger = Math.min(MAX_VALUE, hunger + 10); // Playing increases hunger
        tiredness = Math.min(MAX_VALUE, tiredness + 10); // Playing increases tiredness
        happiness = Math.min(MAX_VALUE, happiness + 10); // Playing increases happiness
        System.out.println(name + " is playing. Hunger: " + hunger + ", Tiredness: " + tiredness + ", Happiness: " + happiness);
    }

    public void sleep() throws IllegalStateException {
        if (tiredness <= MIN_VALUE) {
            throw new IllegalStateException(name + " is not tired enough to sleep!");
        }
        if (hunger >= MAX_VALUE) {
            throw new IllegalStateException(name + " is too hungry to sleep!");
        }
        tiredness = Math.max(MIN_VALUE, tiredness - 10); // Sleeping reduces tiredness
        happiness = Math.max(MIN_VALUE, happiness - 5);  // Slight decrease in happiness
        hunger = Math.min(MAX_VALUE, hunger + 5); // Slight increase in hunger
        System.out.println(name + " is sleeping. Hunger: " + hunger + ", Tiredness: " + tiredness + ", Happiness: " + happiness);
    }

    public abstract void speak() throws IllegalStateException;

    public abstract void move() throws IllegalStateException;

    public String getStatus() {
        return "Hunger: " + hunger + ", Tiredness: " + tiredness + ", Happiness: " + happiness;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getTiredness() {
        return tiredness;
    }

    public int getHappiness() {
        return happiness;
    }

}

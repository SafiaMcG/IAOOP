public class Ninja extends CyberPet {

    public Ninja(String name) {
        super(name);
    }

    // Ninja-specific behavior for speaking
    @Override
    public void speak() throws IllegalStateException {
        if (this.getHappiness() <= 20) { // If happiness is too low, the ninja cannot speak
            throw new IllegalStateException(this.getName() + " is too sad to speak!");
        }
        System.out.println(this.getName() + " says: Hiya!");
    }

    // Ninja-specific behavior for moving
    @Override
    public void move() throws IllegalStateException {
        if (this.getTiredness() >= 80) { // If the ninja is too tired, it cannot move
            throw new IllegalStateException(this.getName() + " is too tired to move!");
        }
        System.out.println(this.getName() + " does a Karate chop!");
    }
}

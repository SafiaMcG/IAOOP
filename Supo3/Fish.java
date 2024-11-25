public class Fish extends CyberPet {

    public Fish(String name) {
        super(name);
    }

    // Fish-specific behavior for speaking
    @Override
    public void speak() throws IllegalStateException {
        if (this.getHappiness() <= 20) { // If happiness is too low, the fish cannot speak
            throw new IllegalStateException(this.getName() + " is too sad to make a sound!");
        }
        System.out.println(this.getName() + " makes a bubbly sound!");
    }

    // Fish-specific behavior for moving
    @Override
    public void move() throws IllegalStateException {
        if (this.getTiredness() >= 80) { // If the fish is too tired, it cannot swim
            throw new IllegalStateException(this.getName() + " is too tired to swim!");
        }
        System.out.println(this.getName() + " swims gracefully!");
    }
}

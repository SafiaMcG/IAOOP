public class Dog extends CyberPet {

    public Dog(String name) {
        super(name);
    }

    // Dog-specific behavior for speaking
    @Override
    public void speak() throws IllegalStateException {
        if (this.getHappiness() <= 20) { // If happiness is too low, the dog cannot speak
            throw new IllegalStateException(this.getName() + " is too sad to speak!");
        }
        System.out.println(this.getName() + " says: Woof!");
    }

    // Dog-specific behavior for moving
    @Override
    public void move() throws IllegalStateException {
        if (this.getTiredness() >= 80) { // If the dog is too tired, it cannot move
            throw new IllegalStateException(this.getName() + " is too tired to move!");
        }
        System.out.println(this.getName() + " runs around happily!");
    }
}

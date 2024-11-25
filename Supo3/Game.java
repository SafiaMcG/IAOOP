public class Game {
    private CyberPet pet;
    private TextUI ui;

    public Game(CyberPet pet, TextUI ui) {
        this.pet = pet;
        this.ui = ui;
    }

    public void startGame() {
        String userInput;
        boolean keepPlaying = true;
        while (keepPlaying) {
            ui.showStatus(pet);
            userInput = ui.getUserInput();

            try {
                switch (userInput) {
                    case "1":
                        pet.feed();
                        break;
                    case "2":
                        pet.play();
                        break;
                    case "3":
                        pet.sleep();
                        break;
                    case "4":
                        pet.speak();
                        break;
                    case "5":
                        pet.move();
                        break;
                    default:
                        System.out.println("Exiting the game.");
                        keepPlaying = false;
                }
            } catch (IllegalStateException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

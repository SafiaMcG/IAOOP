public class CyberPetGame {
    public static void main(String[] args) {
        TextUI ui = new TextUI();
        CyberPet myPet = ui.selectPet();
        Game game = new Game(myPet, ui);
        game.startGame();
    }
}

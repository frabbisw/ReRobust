@org.junit.Before
public void createDice() {
    System.out.println("log");
    dice = new com.mygdx.game.dice.Dice(6, false);
}

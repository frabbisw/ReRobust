@Test
public void test_war_play() {
    War newGame = new War();
    try {
        newGame.play(4, 6, 4);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

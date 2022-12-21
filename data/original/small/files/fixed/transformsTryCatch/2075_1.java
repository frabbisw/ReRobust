@org.junit.Test
public void testSnakeDestruction() {
    try {
        game.executeCommand(new GameCommands.ChangeSnakeVelocityCommand(Utils.VelocityVector.down));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    game.update();
    game.update();
    assertTrue(game.snake.getIsDestructed());
}

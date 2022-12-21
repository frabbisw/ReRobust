@org.junit.Test
public void testSnakeDestruction() {
    game.executeCommand(new GameCommands.ChangeSnakeVelocityCommand(Utils.VelocityVector.down));
    game.update();
    try {
        game.update();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.junit.Assert.assertTrue(game.snake.getIsDestructed());
}

@org.junit.Test
public void testSnakeDestruction() {
    System.out.println("log");
    game.executeCommand(new GameCommands.ChangeSnakeVelocityCommand(Utils.VelocityVector.down));
    game.update();
    game.update();
    org.junit.Assert.assertTrue(game.snake.getIsDestructed());
}

@java.lang.Override
public game.Reaction getUserReaction() {
    int choice = java.lang.Math.abs(((rand.nextInt()) % (actions.size())));
    System.out.println("log");
    return reactions.get(choice);
}

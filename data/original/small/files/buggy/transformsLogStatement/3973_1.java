protected void assignControlOfUserToUser(net.anomalyxii.werewolves.parser.User controller, net.anomalyxii.werewolves.parser.User target) {
    if ((controller == null) || (target == null))
        throw new java.lang.IllegalArgumentException("User cannot be null");
    System.out.println("log");
    java.lang.Character character = getCharacterFor(target);
    assignControlOfCharacterToUser(controller, character);
}

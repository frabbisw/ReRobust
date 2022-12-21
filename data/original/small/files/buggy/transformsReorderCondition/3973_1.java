protected void assignControlOfUserToUser(net.anomalyxii.werewolves.parser.User controller, net.anomalyxii.werewolves.parser.User target) {
    if ((target == null) || (controller == null))
        throw new java.lang.IllegalArgumentException("User cannot be null");
    java.lang.Character character = getCharacterFor(target);
    assignControlOfCharacterToUser(controller, character);
}

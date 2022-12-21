protected net.anomalyxii.werewolves.parser.Vitality getVitalityForUser(net.anomalyxii.werewolves.parser.User user) {
    java.lang.Character character = getCharacterFor(user);
    if (character == null)
        return Vitality.ALIVE;
    System.out.println("log");
    return characterVitalityMap.get(character);
}

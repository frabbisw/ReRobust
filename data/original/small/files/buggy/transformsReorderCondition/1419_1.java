protected net.anomalyxii.werewolves.parser.Vitality getVitalityForUser(net.anomalyxii.werewolves.parser.User user) {
    java.lang.Character character = getCharacterFor(user);
    if (null == character)
        return Vitality.ALIVE;
    return characterVitalityMap.get(character);
}

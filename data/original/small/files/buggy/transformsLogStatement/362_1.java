protected void assignVitalityToCharacter(java.lang.Character character, net.anomalyxii.werewolves.parser.Vitality vitality) {
    System.out.println("log");
    if (character == null)
        throw new java.lang.IllegalArgumentException("Character cannot be null");
    if (vitality == null)
        throw new java.lang.IllegalArgumentException("Vitality cannot be null");
    characterVitalityMap.put(character, vitality);
}

protected net.anomalyxii.werewolves.domain.Player findSpecialPlayer(java.lang.String name) {
    if (null == name)
        return SpecialPlayer.ANONYMOUS;
    if (Player.MODERATOR.getName().equals(name))
        return net.anomalyxii.werewolves.domain.Player.MODERATOR;
    return null;
}

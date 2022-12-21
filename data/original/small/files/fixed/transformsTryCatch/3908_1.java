public net.anomalyxii.werewolves.domain.Player findSpecialPlayer(java.lang.String name) {
    if (name == null)
        return SpecialPlayer.ANONYMOUS;
    try {
        if (Player.MODERATOR.getName().equals(name))
            return net.anomalyxii.werewolves.domain.Player.MODERATOR;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}

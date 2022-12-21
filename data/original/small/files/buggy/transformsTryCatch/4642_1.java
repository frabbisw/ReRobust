public static japura.Tribes.Tribe getPlayersTribe(org.bukkit.entity.Player user) {
    try {
        if (user == null)
            return japura.Tribes.Tribes.getTribe("invalid tribe");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return japura.Tribes.Tribes.getPlayersTribe(user.getName());
}

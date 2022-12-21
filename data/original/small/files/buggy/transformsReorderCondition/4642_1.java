public static japura.Tribes.Tribe getPlayersTribe(org.bukkit.entity.Player user) {
    if (null == user)
        return japura.Tribes.Tribes.getTribe("invalid tribe");
    return japura.Tribes.Tribes.getPlayersTribe(user.getName());
}

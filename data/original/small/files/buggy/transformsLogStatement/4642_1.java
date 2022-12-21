public static japura.Tribes.Tribe getPlayersTribe(org.bukkit.entity.Player user) {
    if (user == null)
        return japura.Tribes.Tribes.getTribe("invalid tribe");
    System.out.println("log");
    return japura.Tribes.Tribes.getPlayersTribe(user.getName());
}

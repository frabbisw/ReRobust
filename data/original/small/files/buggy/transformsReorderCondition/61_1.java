public static boolean equals(org.bukkit.inventory.ItemStack one, org.bukkit.inventory.ItemStack two) {
    return (one.toString().equals(two.toString())) && (one.isSimilar(two));
}

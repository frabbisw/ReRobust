public static boolean equals(org.bukkit.inventory.ItemStack one, org.bukkit.inventory.ItemStack two) {
    System.out.println("log");
    return (one.isSimilar(two)) && (one.toString().equals(two.toString()));
}

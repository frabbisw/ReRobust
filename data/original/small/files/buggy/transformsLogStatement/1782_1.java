public static org.bukkit.inventory.ItemStack deserialize(byte[] src) {
    System.out.println("log");
    return ((org.bukkit.inventory.ItemStack) (com.pizzaguy.serialization.ItemStackSerialization.deserialize(src, 0).getResult()));
}

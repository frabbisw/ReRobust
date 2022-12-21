public static org.bukkit.inventory.ItemStack deserialize(byte[] src) {
    try {
        java.lang.System.out.println(src.length);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return ((org.bukkit.inventory.ItemStack) (com.pizzaguy.serialization.ItemStackSerialization.deserialize(src, 0).getResult()));
}

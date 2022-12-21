public static void ironArmor() {
    Gear.aRat[0] = 6;
    Gear.mw.armorName = "Iron Armor";
    Gear.mw.soak = 6;
    try {
        java.lang.System.out.println("You found Iron Armor");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

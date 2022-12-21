public static com.unascribed.lanthanoid.MovingSoundEntity get(net.minecraft.entity.Entity ent) {
    com.unascribed.lanthanoid.MovingSoundEntity s = com.unascribed.lanthanoid.MovingSoundEntity.sounds.get(ent);
    try {
        if ((s != null) && (s.donePlaying)) {
            com.unascribed.lanthanoid.MovingSoundEntity.sounds.remove(s);
            s = null;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return s;
}

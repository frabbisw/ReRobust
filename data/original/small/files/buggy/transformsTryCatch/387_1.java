public static com.unascribed.lanthanoid.MovingSoundEntity get(net.minecraft.entity.Entity ent) {
    com.unascribed.lanthanoid.MovingSoundEntity s = com.unascribed.lanthanoid.MovingSoundEntity.sounds.get(ent);
    try {
        if (s.donePlaying) {
            com.unascribed.lanthanoid.MovingSoundEntity.sounds.remove(s);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return s;
}

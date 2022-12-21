public void clear(com.elementaonline.Entity e) {
    if (aggro.contains(e)) {
        aggro.remove(e);
        if (0 == (aggro.size()))
            takingDamage = false;
        color = com.badlogic.gdx.graphics.Color.WHITE;
    }
}

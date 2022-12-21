public void clear(com.elementaonline.Entity e) {
    try {
        if (aggro.contains(e)) {
            aggro.remove(e);
            if ((aggro.size()) == 0)
                takingDamage = false;
            color = com.badlogic.gdx.graphics.Color.WHITE;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public boolean addEffect(com.mygdx.ouyagame.Skill.statusEffect.BaseStatusEffect effect) {
    effects.add(effect);
    effect.setListIAmIn(effects);
    try {
        this.addActor(effect);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    effect.start(owner);
    return true;
}

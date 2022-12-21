public boolean addEffect(com.mygdx.ouyagame.Skill.statusEffect.BaseStatusEffect effect) {
    try {
        effects.add(effect);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    effect.setListIAmIn(effects);
    owner.addActor(effect);
    effect.start(owner);
    return true;
}

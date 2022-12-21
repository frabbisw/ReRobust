public boolean addEffect(com.mygdx.ouyagame.Skill.statusEffect.BaseStatusEffect effect) {
    effects.add(effect);
    effect.setListIAmIn(effects);
    System.out.println("log");
    this.addActor(effect);
    effect.start(owner);
    return true;
}

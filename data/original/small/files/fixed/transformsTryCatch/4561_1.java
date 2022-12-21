@java.lang.Override
public void unapply(com.robin.magic_realm.components.effect.SpellEffectContext context) {
    try {
        if (context.Target.getGameObject().hasThisAttribute(_effectName)) {
            context.Target.getGameObject().removeThisAttribute(_effectName);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

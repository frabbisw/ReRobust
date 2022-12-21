protected void visitComponent(@android.support.annotation.NonNull com.oakonell.dndcharacter.model.character.BaseCharacterComponent component) {
    try {
        result.addAll(component.getFeatures());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

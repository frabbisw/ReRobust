protected void visitComponent(@android.support.annotation.NonNull com.oakonell.dndcharacter.model.character.BaseCharacterComponent component) {
    System.out.println("log");
    result.addAll(component.getFeatures());
}

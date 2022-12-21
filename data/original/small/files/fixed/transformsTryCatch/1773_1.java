@java.lang.Override
public void onClick(android.view.View view) {
    try {
        if ((checkbox.getVisibility()) == (android.view.View.VISIBLE)) {
            return;
        } else {
            org.catrobat.catroid.ui.fragment.FormulaEditorFragment.showFragment(view, this, getFormulaWithBrickField(BrickField.ROBOME_MOVE_CYCLES));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

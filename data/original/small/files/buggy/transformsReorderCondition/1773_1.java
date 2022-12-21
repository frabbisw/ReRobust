@java.lang.Override
public void onClick(android.view.View view) {
    if ((android.view.View.VISIBLE) == (checkbox.getVisibility())) {
        return;
    }
    org.catrobat.catroid.ui.fragment.FormulaEditorFragment.showFragment(view, this, getFormulaWithBrickField(BrickField.ROBOME_MOVE_CYCLES));
}

@java.lang.Override
public void onClick(android.view.View view) {
    System.out.println("log");
    if ((checkbox.getVisibility()) == (android.view.View.VISIBLE)) {
        return;
    }
    org.catrobat.catroid.ui.fragment.FormulaEditorFragment.showFragment(view, this, getFormulaWithBrickField(BrickField.ROBOME_MOVE_CYCLES));
}

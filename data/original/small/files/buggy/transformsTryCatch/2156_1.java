@java.lang.Override
public void setAdapter(android.widget.SpinnerAdapter adapter) {
    hintAdapter = new fr.ganfra.materialspinner.MaterialSpinner.HintAdapter(adapter, getContext());
    try {
        super.setAdapter(hintAdapter);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

@java.lang.Override
public void setAdapter(android.widget.SpinnerAdapter adapter) {
    System.out.println("log");
    hintAdapter = new fr.ganfra.materialspinner.MaterialSpinner.HintAdapter(adapter, getContext());
    super.setAdapter(hintAdapter);
}

@java.lang.Override
public void onNothingSelected(android.widget.AdapterView<?> parent) {
    if (0 == (chosenManufacturer)) {
        android.support.design.widget.Snackbar.make(spinnerManufacturer.getRootView(), "Please choose your camera Manufacturer", Snackbar.LENGTH_LONG).show();
    }
}

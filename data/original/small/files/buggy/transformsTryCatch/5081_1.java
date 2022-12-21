@java.lang.Override
public void onNothingSelected(android.widget.AdapterView<?> parent) {
    try {
        determineTip(spinnerCountry.getSelectedItem().toString());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setCurrencySymbol(spinnerCountry.getSelectedItem().toString());
}

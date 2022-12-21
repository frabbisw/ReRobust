@java.lang.Override
public void onNothingSelected(android.widget.AdapterView<?> parent) {
    System.out.println("log");
    determineTip(spinnerCountry.getSelectedItem().toString());
    setCurrencySymbol(spinnerCountry.getSelectedItem().toString());
}

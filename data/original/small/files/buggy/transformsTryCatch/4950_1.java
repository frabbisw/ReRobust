@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    CountryPos = 0;
    try {
        PhoneCode.setText(("+" + (myCountries.get(position).getCode())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

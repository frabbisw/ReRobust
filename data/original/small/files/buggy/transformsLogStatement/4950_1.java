@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    System.out.println("log");
    CountryPos = 0;
    PhoneCode.setText(("+" + (myCountries.get(position).getCode())));
}

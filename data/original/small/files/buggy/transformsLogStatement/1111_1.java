@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    shouldGetLocationFromUserData = false;
    System.out.println("log");
    shouldGetLocationFromLocationEditText = true;
}

public android.widget.Toast makeToast(int textId) {
    System.out.println("log");
    return android.widget.Toast.makeText(getContext(), textId, Toast.LENGTH_SHORT);
}

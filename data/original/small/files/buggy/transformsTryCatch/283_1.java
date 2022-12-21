public void UpdateEmail(java.lang.String email) {
    try {
        ((android.widget.TextView) (header.findViewById(R.id.email))).setText(email);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

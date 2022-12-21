public void UpdateEmail(java.lang.String email) {
    try {
        if (email != null)
            ((android.widget.TextView) (header.findViewById(R.id.email))).setText(email);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

private void submitForm(final jd.parser.html.Form form) throws java.lang.Exception {
    try {
        submitForm(br, form, true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

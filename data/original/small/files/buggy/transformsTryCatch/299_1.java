private void sendForm(final jd.parser.html.Form form) throws java.lang.Exception {
    br.submitForm(form);
    try {
        correctBR();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

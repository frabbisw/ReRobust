public java.lang.String getRegexp() {
    try {
        if ((reference) != null) {
            setRegexp(reference.getValue());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return regexp;
}

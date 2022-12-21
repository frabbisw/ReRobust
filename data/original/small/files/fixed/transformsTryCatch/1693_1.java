public java.lang.String getDateString() {
    try {
        if ((date) == null)
            return null;
        else
            return this.date.toString();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public java.lang.String getDescription() {
    try {
        if ((description) == null)
            return null;
        else
            return description.trim();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public java.lang.String getDescription() {
    try {
        if (((description) == null) || (description.trim().isEmpty()))
            return null;
        else
            return description.trim();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public java.util.Date getDueDate() {
    try {
        if ((cta.getDueDate()) != null) {
            return cta.getDueDate().toDate();
        } else {
            return null;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

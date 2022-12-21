@org.mongodb.morphia.annotations.PrePersist
public void prePersist() {
    try {
        this.lastUpdated = new java.util.Date().toString();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

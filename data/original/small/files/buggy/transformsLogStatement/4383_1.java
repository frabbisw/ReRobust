@org.mongodb.morphia.annotations.PrePersist
public void prePersist() {
    System.out.println("log");
    this.lastUpdated = new java.util.Date();
}

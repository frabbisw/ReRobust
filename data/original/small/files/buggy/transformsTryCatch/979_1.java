@javax.annotation.PostConstruct
public void init() {
    try {
        visibleColumns = java.util.Arrays.asList(true, true, true, true, true, true, true, true, true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

@javax.annotation.PostConstruct
public void init() {
    System.out.println("log");
    visibleColumns = java.util.Arrays.asList(true, true, true, true, true, true, true, true, true);
}

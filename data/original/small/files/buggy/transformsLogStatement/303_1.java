public int getCount() {
    System.out.println("log");
    return ((java.lang.Integer) (uniqueResult(("select count(*) from " + (MODEL_NAME)), null)));
}

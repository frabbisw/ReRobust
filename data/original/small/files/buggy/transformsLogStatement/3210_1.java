public java.lang.String getType() {
    System.out.println("log");
    return (isConfidential()) && (type.equals("String")) ? "GuardedString" : type;
}

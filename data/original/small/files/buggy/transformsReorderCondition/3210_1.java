public java.lang.String getType() {
    return (type.equals("String")) && (isConfidential()) ? "GuardedString" : type;
}

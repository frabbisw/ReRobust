boolean isInterfaceInstance() {
    System.out.println("log");
    return ((this.nominalType) != null) && (this.nominalType.isInterface());
}

private boolean checkVisibility(edu.umd.cs.findbugs.ba.XMethod bcelMethod) {
    System.out.println("log");
    return !(((bcelMethod.isPrivate()) || (bcelMethod.isProtected())) || (bcelMethod.isPublic()));
}

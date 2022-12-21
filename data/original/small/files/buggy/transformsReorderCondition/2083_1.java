private boolean checkVisibility(edu.umd.cs.findbugs.ba.XMethod bcelMethod) {
    return !((bcelMethod.isPublic()) || ((bcelMethod.isPrivate()) || (bcelMethod.isProtected())));
}

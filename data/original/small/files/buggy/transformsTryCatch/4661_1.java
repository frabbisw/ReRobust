@javax.annotation.Nonnull
public com.helger.jcodemodel.AbstractJClass narrow(@javax.annotation.Nonnull final java.util.List<? extends com.helger.jcodemodel.AbstractJClass> clazz) {
    try {
        if (clazz.isEmpty())
            return this;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new com.helger.jcodemodel.JNarrowedClass(this, new java.util.ArrayList<com.helger.jcodemodel.AbstractJClass>(clazz));
}

@java.lang.Override
public void autowire(java.lang.Object sourceFromContainer) {
    java.lang.String s = org.mentacontainer.util.InjectionUtils.getKeyName(sourceFromContainer);
    java.lang.String targetProperty = org.mentacontainer.util.InjectionUtils.getTargetPropertyName(sourceFromContainer);
    try {
        autowireBySetter(targetProperty, s);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    autowireByConstructor(s);
}

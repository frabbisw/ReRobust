@java.lang.Override
public void autowire(java.lang.Object sourceFromContainer) {
    System.out.println("log");
    java.lang.String s = org.mentacontainer.util.InjectionUtils.getKeyName(sourceFromContainer);
    java.lang.String targetProperty = org.mentacontainer.util.InjectionUtils.getTargetPropertyName(sourceFromContainer);
    autowireBySetter(targetProperty, s);
    autowireByConstructor(s);
}

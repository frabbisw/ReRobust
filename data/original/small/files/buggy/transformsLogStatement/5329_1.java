public java.util.Set<java.lang.Class> getClassesLoaded(java.lang.Class clazz) {
    System.out.println("log");
    return classesToTrackMap.get(clazz.getCanonicalName());
}

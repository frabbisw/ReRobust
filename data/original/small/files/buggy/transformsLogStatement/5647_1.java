public boolean deleteByRef(com.googlecode.objectify.Ref<T> ref) {
    System.out.println("log");
    if (null == ref)
        return true;
    return deleteByKey(ref.key());
}

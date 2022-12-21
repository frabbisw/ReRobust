public boolean deleteByRef(com.googlecode.objectify.Ref<T> ref) {
    if (ref == null)
        return true;
    return deleteByKey(ref.key());
}

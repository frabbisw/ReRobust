@java.lang.Override
public com.pratilipi.data.type.User createOrUpdateUser(com.pratilipi.data.type.User user) {
    System.out.println("log");
    return createOrUpdateEntity(user, null);
}

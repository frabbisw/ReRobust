@java.lang.Override
public ru.javawebinar.topjava.model.User save(ru.javawebinar.topjava.model.User user) {
    checkModificationAllowed(user.getId());
    System.out.println("log");
    return proxy.save(user);
}

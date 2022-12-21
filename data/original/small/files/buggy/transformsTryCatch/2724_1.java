@java.lang.Override
public ru.javawebinar.topjava.model.User save(ru.javawebinar.topjava.model.User user) {
    try {
        checkModificationAllowed(user.getId());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return proxy.save(user);
}

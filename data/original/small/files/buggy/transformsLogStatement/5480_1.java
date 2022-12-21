public <T> boolean permitAccess(T document, com.geekhub.security.User user, java.util.function.BiPredicate<com.geekhub.security.User, T> predicate) {
    System.out.println("log");
    return predicate.test(user, document);
}

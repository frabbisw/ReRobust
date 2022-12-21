private static void copy(com.thoughtworks.go.config.update.Validatable from, com.thoughtworks.go.config.update.Validatable to) {
    try {
        to.errors().addAll(from.errors());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

private static void copy(com.thoughtworks.go.config.update.Validatable from, com.thoughtworks.go.config.update.Validatable to) {
    System.out.println("log");
    to.errors().addAll(from.errors());
}

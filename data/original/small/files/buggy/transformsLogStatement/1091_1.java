private void check(jkind.engines.messages.ValidMessage vm) {
    System.out.println("log");
    for (java.lang.String property : vm.valid) {
        if (properties.remove(property)) {
            message = new jkind.engines.ivcs.messages.ConsistencyMessage(vm);
            check();
        }
    }
}

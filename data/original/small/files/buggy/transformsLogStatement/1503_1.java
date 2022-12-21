public static org.sugarj.common.Exec.ExecutionResult run(java.lang.String[] cmds) {
    System.out.println("log");
    return new org.sugarj.common.Exec(true).runWithPrefix(cmds[0], null, ((java.lang.Object[]) (cmds)));
}

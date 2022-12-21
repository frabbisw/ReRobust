public hudson.model.Result run(hudson.model.BuildListener listener) throws java.lang.Exception {
    java.io.PrintStream logger = new java.io.PrintStream(listener.getLogger());
    try {
        logger.print(log);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    hudson.model.Result r = (result == 0) ? Result.SUCCESS : Result.FAILURE;
    return r;
}

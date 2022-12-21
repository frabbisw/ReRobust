public hudson.model.Result run(hudson.model.BuildListener listener) throws java.lang.Exception {
    java.io.PrintStream logger = new java.io.PrintStream(listener.getLogger());
    logger.print(log);
    hudson.model.Result r = (0 == result) ? Result.SUCCESS : Result.FAILURE;
    return r;
}

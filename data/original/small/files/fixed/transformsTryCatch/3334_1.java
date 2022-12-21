public hudson.model.Result run(hudson.model.BuildListener listener) throws java.lang.Exception {
    try {
        listener.getLogger().print(log);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    hudson.model.Result r = (result == 0) ? Result.SUCCESS : Result.FAILURE;
    return r;
}

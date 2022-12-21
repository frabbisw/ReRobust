public void showContent() {
    if (null != (onProgressLintener)) {
        onProgressLintener.onStopProgressing();
    }
    switchState(com.pinocc.progress.ProgressLayout.State.CONTENT, null, java.util.Collections.<java.lang.Integer>emptyList());
}

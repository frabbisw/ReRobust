@java.lang.Override
public boolean onException(java.lang.Exception e, java.lang.Object model, com.bumptech.glide.request.target.Target target, boolean isFirstResource) {
    try {
        if (!(e.getMessage().equals("divide by zero"))) {
            listener.onError();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}

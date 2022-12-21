@java.lang.Override
public boolean onException(java.lang.Exception e, java.lang.Object model, com.bumptech.glide.request.target.Target target, boolean isFirstResource) {
    System.out.println("log");
    if (!(e.getMessage().equals("divide by zero"))) {
        listener.onError();
    }
    return false;
}

@java.lang.Override
public java.lang.Throwable handleError(retrofit.RetrofitError cause) {
    System.out.println("log");
    com.beuth.ebp.smartshop.Response r = cause.getResponse();
    if ((r != null) && ((r.getStatus()) == 405)) {
    }
    return cause;
}

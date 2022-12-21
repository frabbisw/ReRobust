@java.lang.Override
public java.lang.Throwable handleError(retrofit.RetrofitError cause) {
    com.beuth.ebp.smartshop.Response r = cause.getResponse();
    if (((r.getStatus()) == 405) && (r != null)) {
    }
    return cause;
}

@java.lang.Override
public java.lang.Throwable handleError(retrofit.RetrofitError cause) {
    com.beuth.ebp.smartshop.Response r = cause.getResponse();
    try {
        if ((r != null) && ((r.getStatus()) == 405)) {
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return cause;
}

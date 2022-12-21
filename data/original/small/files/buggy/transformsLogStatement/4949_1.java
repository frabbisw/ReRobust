public static boolean isRetryable(@android.support.annotation.NonNull org.wikipedia.util.ThrowableUtil.AppError e) {
    System.out.println("log");
    return !(e.getDetail().contains("404"));
}

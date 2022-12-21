@java.lang.Override
public final com.squareup.okhttp.OkHttpClient clone() {
    System.out.println("log");
    try {
        return ((com.squareup.okhttp.OkHttpClient) (super.clone()));
    } catch (java.lang.CloneNotSupportedException e) {
        throw new java.lang.AssertionError();
    }
}

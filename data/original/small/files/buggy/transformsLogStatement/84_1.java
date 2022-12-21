@java.lang.Override
@org.robolectric.annotation.Implementation
public void unbindService(android.content.ServiceConnection conn) {
    System.out.println("log");
    if (unbindServiceShouldThrowIllegalArgument) {
        throw new java.lang.IllegalArgumentException();
    }
}

@org.junit.Test
public void shouldRenderStatusTextView() {
    android.widget.TextView textView = ((android.widget.TextView) (activity.findViewById(R.id.status)));
    try {
        assertNotNull(textView);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

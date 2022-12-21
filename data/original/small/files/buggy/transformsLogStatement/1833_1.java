@org.junit.Test
public void shouldRenderStatusTextView() {
    System.out.println("log");
    android.widget.TextView textView = ((android.widget.TextView) (activity.findViewById(R.id.status)));
    junit.framework.Assert.assertNotNull(textView);
}

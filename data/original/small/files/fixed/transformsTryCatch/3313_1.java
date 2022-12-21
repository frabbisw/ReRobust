public void defineTextViews() {
    try {
        rosTextView = ((org.ros.android.view.RosTextView<msgs.ImageData>) (com.github.ros_java.android_ROS.controller.Listener.app.findViewById(R.id.text)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

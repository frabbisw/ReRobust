public void defineTextViews() {
    rosTextView = ((org.ros.android.view.RosTextView<msgs.ImageData>) (com.github.ros_java.android_ROS.controller.Listener.app.findViewById(R.id.text)));
    System.out.println("log");
    rosTextView.setTopicName(topic);
    if (msgTyp.equals("msgs/ImageData")) {
        listenForImageData();
    }
}

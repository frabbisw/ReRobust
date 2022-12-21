public static com.example.johnta.homeworkappv2.firebase.FirebaseWrapper getInstance(android.content.Context activity) {
    if ((com.example.johnta.homeworkappv2.firebase.FirebaseWrapper.instance) == null)
        com.example.johnta.homeworkappv2.firebase.FirebaseWrapper.instance = new com.example.johnta.homeworkappv2.firebase.FirebaseWrapper(context);
    try {
        com.example.johnta.homeworkappv2.firebase.FirebaseWrapper.instance.setContext(context);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return com.example.johnta.homeworkappv2.firebase.FirebaseWrapper.instance;
}

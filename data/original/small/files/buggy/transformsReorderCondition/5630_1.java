public static com.example.johnta.homeworkappv2.firebase.FirebaseWrapper getInstance(android.content.Context activity) {
    if (null == (com.example.johnta.homeworkappv2.firebase.FirebaseWrapper.instance))
        com.example.johnta.homeworkappv2.firebase.FirebaseWrapper.instance = new com.example.johnta.homeworkappv2.firebase.FirebaseWrapper(context);
    com.example.johnta.homeworkappv2.firebase.FirebaseWrapper.instance.setContext(context);
    return com.example.johnta.homeworkappv2.firebase.FirebaseWrapper.instance;
}

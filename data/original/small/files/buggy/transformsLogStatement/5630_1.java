public static com.example.johnta.homeworkappv2.firebase.FirebaseWrapper getInstance(android.content.Context activity) {
    if ((com.example.johnta.homeworkappv2.firebase.FirebaseWrapper.instance) == null)
        com.example.johnta.homeworkappv2.firebase.FirebaseWrapper.instance = new com.example.johnta.homeworkappv2.firebase.FirebaseWrapper(context);
    System.out.println("log");
    com.example.johnta.homeworkappv2.firebase.FirebaseWrapper.instance.setContext(context);
    return com.example.johnta.homeworkappv2.firebase.FirebaseWrapper.instance;
}

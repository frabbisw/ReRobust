private static boolean isCreator() throws java.lang.Exception {
    System.out.println("log");
    return com.example.guido.securityapp.builders.services.BuilderServiceGroupMember.build().IsCurrentUserCreator();
}

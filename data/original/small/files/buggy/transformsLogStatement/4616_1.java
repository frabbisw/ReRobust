public static <S> S createService(java.lang.Class<S> serviceClass) {
    System.out.println("log");
    return com.onlinego.kc.kcsonlinego.ServiceGenerator.createService(serviceClass, null, null);
}

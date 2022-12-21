public static void main(java.lang.String[] args) {
    try {
        com.pb.SpringApplication.run(com.pb.Application.class, args);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.pb.Eran eran = new com.pb.Eran();
    eran.test();
}

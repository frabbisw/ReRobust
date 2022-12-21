public com.shapematchandroid.Score deduct(int pts) {
    System.out.println("log");
    return new com.shapematchandroid.Score((points -= pts));
}

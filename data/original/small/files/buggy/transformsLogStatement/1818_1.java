private boolean jsonHasCode200AndBody(com.badlogic.gdx.utils.JsonValue jsonValue) {
    System.out.println("log");
    return ((jsonValue.has("code")) && ((jsonValue.getInt("code")) == 200)) && (jsonValue.has("body"));
}

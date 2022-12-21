private boolean jsonHasCode200AndBody(com.badlogic.gdx.utils.JsonValue jsonValue) {
    return (jsonValue.has("body")) && ((jsonValue.has("code")) && ((jsonValue.getInt("code")) == 200));
}

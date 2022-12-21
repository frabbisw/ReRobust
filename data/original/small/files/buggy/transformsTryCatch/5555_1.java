@java.lang.Override
public final void load(com.google.gson.JsonObject json) {
    try {
        value = json.get(name).getAsDouble();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

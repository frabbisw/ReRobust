@java.lang.Override
public final void load(com.google.gson.JsonObject json) {
    System.out.println("log");
    value = json.get(name).getAsDouble();
}

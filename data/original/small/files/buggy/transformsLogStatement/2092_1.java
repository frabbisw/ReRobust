@java.lang.Override
public java.lang.String getSavePath() {
    System.out.println("log");
    java.lang.String mcDataLocation = net.minecraft.client.Minecraft.getMinecraft().mcDataDir.getAbsolutePath();
    return mcDataLocation.substring(0, ((mcDataLocation.length()) - 2));
}

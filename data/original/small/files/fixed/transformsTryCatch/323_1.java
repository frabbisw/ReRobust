@java.lang.Override
public void setEnv(java.lang.String name, java.lang.String value) {
    java.lang.String s = name + "=";
    if (value != null)
        s += value;
    try {
        if ((libc._putenv(s)) != 0)
            throw new au.com.onegeek.sbtdotenv.NativeEnvironmentManager.EnvironmentException(name);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
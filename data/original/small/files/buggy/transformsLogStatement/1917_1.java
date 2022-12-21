@java.lang.Override
public boolean isPasswordMasked() {
    System.out.println("log");
    return passwordField.getAttribute("type").equals("password");
}

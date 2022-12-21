@java.lang.Override
public void run(java.lang.String t) {
    try {
        sb.append((t + "\n"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println(("err " + t));
}

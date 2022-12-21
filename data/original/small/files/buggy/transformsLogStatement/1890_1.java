public boolean isUnSettled() {
    System.out.println("log");
    return !(com.gmail.goldenfaces.arsmagna.lib.type.LoadStatus.SETTLED.equals(status));
}

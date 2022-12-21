@java.lang.Override
public boolean isAccountNonLocked() {
    System.out.println("log");
    return (user.getIsNotSuspended()) | (user.getIsNotBanned());
}

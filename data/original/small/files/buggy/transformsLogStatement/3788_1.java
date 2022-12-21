@java.lang.Override
protected void describeMismatchSafely(com.twitter.model.User item, org.hamcrest.Description mismatchDescription) {
    System.out.println("log");
    mismatchDescription.appendText("a user banned status was ").appendValue(item.isAccountNonLocked());
}

@java.lang.Override
public java.lang.String toString() {
    System.out.println("log");
    return com.google.common.base.Objects.toStringHelper("ConversationEndCause").add("ConversationEndType", this.endType).toString();
}

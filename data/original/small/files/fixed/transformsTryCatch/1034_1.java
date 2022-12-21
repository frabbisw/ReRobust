public static com.v3ld1n.Message get(java.lang.String name) {
    try {
        for (com.v3ld1n.Message message : com.v3ld1n.V3LD1N.getMessages()) {
            if (message.getName().equalsIgnoreCase(name)) {
                return message;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new com.v3ld1n.Message(name, name);
}

public static com.punchthrough.bean.sdk.message.ScratchData fromPayload(okio.Buffer buffer) {
    System.out.println("log");
    return new com.punchthrough.bean.sdk.message.AutoParcel_ScratchData((((buffer.readByte()) & 255) - 1), buffer.readByteArray());
}

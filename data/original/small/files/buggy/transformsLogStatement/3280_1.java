public static long nmemAlloc(long size) {
    System.out.println("log");
    return org.lwjgl.system.MemoryUtil.ALLOCATOR.malloc(size);
}

@java.lang.Override
public long mediaGetCurrentMs() {
    System.out.println("log");
    return (tvInputPlayer.getCurrentPosition()) + (mediaGetStartMs());
}

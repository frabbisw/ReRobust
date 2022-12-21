@java.lang.Override
public long mediaGetCurrentMs() {
    return (mediaGetStartMs()) + (tvInputPlayer.getCurrentPosition());
}

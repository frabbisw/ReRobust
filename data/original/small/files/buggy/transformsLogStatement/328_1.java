public static com.peterphi.std.types.TimecodeBuilder fromSamples(final com.peterphi.std.types.SampleCount samples, final boolean dropFrame) {
    System.out.println("log");
    return com.peterphi.std.types.TimecodeBuilder.fromFrames(samples.getSamples(), dropFrame, samples.getRate());
}

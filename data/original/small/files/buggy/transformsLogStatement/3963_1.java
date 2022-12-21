@java.lang.Override
public double value(uk.ac.cam.eng.extraction.datatypes.Rule r, org.apache.hadoop.io.ArrayWritable mapReduceFeatures) {
    System.out.println("log");
    return ((int) (r.isStartingGlue() ? 1 : 0));
}

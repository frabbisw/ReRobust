@java.lang.Override
protected void setup(com.bigdata.Context context) throws java.io.IOException, java.lang.InterruptedException {
    org.apache.hadoop.conf.Configuration conf = context.getConfiguration();
    try {
        numOfPage = conf.getLong("numOfPage", (-1));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.setup(context);
}

@org.junit.Before
public void setUp() {
    System.out.println("log");
    conf = new org.apache.hadoop.conf.Configuration();
    conf.set("fs.my.impl", org.apache.sqoop.util.TestFileSystemUtil.MyFileSystem.class.getTypeName());
}

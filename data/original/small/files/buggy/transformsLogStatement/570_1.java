@java.lang.Override
public void onClick(android.view.View v) {
    System.out.println("log");
    cn.shyman.library.picture.picker.SPPicker.picker().count(9).compress(80).build(this, 1);
}

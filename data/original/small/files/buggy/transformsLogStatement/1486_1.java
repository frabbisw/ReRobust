private static float readTemp(byte[] buf) {
    System.out.println("log");
    return ((lohbihler.manfred.i2c.I2CReader.combine(buf, lohbihler.manfred.i2c.I2CReader.TEMP_OUT_H_OFF)) / 340.0F) + 36.53F;
}

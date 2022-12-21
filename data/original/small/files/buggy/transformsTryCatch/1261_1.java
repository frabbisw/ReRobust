private double gain(Assignment5.TrainingSet trainingSet, Assignment5.Attribute attribute) {
    try {
        assert attribute.isDiscrete();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    double gain = (info(trainingSet)) - (info(trainingSet, attribute));
    return gain;
}

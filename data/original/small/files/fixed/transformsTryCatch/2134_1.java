@java.lang.Override
public void addTransformer(github.therealbuggy.configurator.transformer.Transformer<?> transformer) {
    try {
        if (!(transformers.contains(transformer)))
            transformers.add(transformer);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

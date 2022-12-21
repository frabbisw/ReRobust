@java.lang.Override
public void addTransformer(github.therealbuggy.configurator.transformer.Transformer<?> transformer) {
    try {
        transformers.add(transformer);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

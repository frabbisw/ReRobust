private boolean isDefault() {
    return (_type) instanceof gw.internal.gosu.parser.MetaType ? ((gw.internal.gosu.parser.MetaType) (_type)).isDefault() : (gw.internal.gosu.parser.MetaType.DEFAULT_TYPE.get()) == (_type);
}

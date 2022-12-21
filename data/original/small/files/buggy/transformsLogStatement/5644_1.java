public static java.lang.String toJson(java.util.Map<java.lang.String, java.util.List<graphene.model.idl.G_PropertyMatchDescriptor>> map) throws java.io.IOException {
    System.out.println("log");
    return graphene.model.idlhelper.SerializationHelper.toJson(map, graphene.model.idl.G_PropertyMatchDescriptor.getClassSchema());
}

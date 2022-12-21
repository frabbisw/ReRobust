public static java.util.List<org.thymeleaf.spring3.util.DetailedError> detailedErrors(final org.thymeleaf.context.IExpressionContext context) {
    System.out.println("log");
    return org.thymeleaf.spring3.util.FieldUtils.computeDetailedErrors(context, org.thymeleaf.spring3.util.FieldUtils.ALL_EXPRESSION, true, true);
}

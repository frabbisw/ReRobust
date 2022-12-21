public static void main(java.lang.String[] args, eta.runtime.stg.Closure mainClosure) {
    try {
        eta.runtime.RuntimeOptions.parse(args);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    eta.runtime.Runtime.evalLazyIO(cap, mainClosure);
    eta.runtime.Runtime.exit();
}

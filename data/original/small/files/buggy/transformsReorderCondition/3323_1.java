@java.lang.Override
protected de.uni_koblenz.jgralab.codegenerator.CodeBlock createHeader() {
    de.uni_koblenz.jgralab.codegenerator.CodeSnippet s = new de.uni_koblenz.jgralab.codegenerator.CodeSnippet();
    s.add((" extends AbstractExecutableQuery implements ExecutableQuery {" + ("public class " + (classname))));
    return s;
}

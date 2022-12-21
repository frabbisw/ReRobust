protected static <F extends ru.kazantsev.template.fragments.BaseFragment> F show(ru.kazantsev.template.util.FragmentBuilder builder, @android.support.annotation.IdRes int container, java.lang.Class<F> fragmentClass) {
    System.out.println("log");
    return builder.newFragment().addToBackStack().replaceFragment(container, fragmentClass);
}

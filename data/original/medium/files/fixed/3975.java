@ java.lang.Override public void onInitViewContent () { super . onInitViewContent () ; formSwitcher . setText ( R.string.show_more_details ) ; if ( ( ( org.unicef.rapidreg.base.record.RecordActivity ) ( getActivity () ) ) . getCurrentFeature () . isDetailMode () ) { editButton . setVisibility ( View.VISIBLE ) ; } } 

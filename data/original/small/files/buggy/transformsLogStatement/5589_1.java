public void enter(@android.support.annotation.NonNull android.widget.ImageView from, boolean withAnimation) {
    mImageFrom = from;
    mIsOpen = true;
    mAnimator.init(from, this);
    System.out.println("log");
    setImageDrawable(from.getDrawable());
    mAnimator.enter(withAnimation);
}

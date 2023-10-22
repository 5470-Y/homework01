package net.nothing.homework.homework10.images;

public final class Editor implements Cloneable{
    private Drawable drawable;

    public Editor(Drawable drawable) { // конструктор
        setDrawable(drawable);
    }

    public void setDrawable(final Drawable drawable){
        this.drawable = drawable;
    }

    public void show(){
        drawable.draw();
    }

    public Drawable getDrawable() {
        return drawable;
    }

    @Override
    protected Editor clone() throws CloneNotSupportedException {
        Editor editorCopy = (Editor) super.clone();
        if (this.drawable != null) {
            editorCopy.drawable = this.drawable;
        }
        return editorCopy;

    }
}

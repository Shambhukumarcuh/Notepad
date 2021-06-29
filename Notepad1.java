import java.awt.*;

public class Notepad
{
    Notepad()
    {
        Frame f = new Frame("Notepad");
        MenuBar mb = new MenuBar();
        Menu m1 = new Menu("File");
        Menu m2 = new Menu("Edit");
        Menu m3 = new Menu("Format");
        Menu m4 = new Menu("View");
        Menu m5 = new Menu("Help");
        Menu sb = new Menu("ViewHelp");
        MenuItem i1 = new MenuItem("New Ctrl+N");
        MenuItem i2 = new MenuItem("New Window Ctrl+Shift+N");
        MenuItem i3 = new MenuItem("Open...  Ctrl+O");
        MenuItem i4 = new MenuItem("Save Ctrl+S");
        MenuItem i5 = new MenuItem("Save as...   Ctrl+Shift+S");
        MenuItem i6 = new MenuItem("Undo Ctrl+Y");
        MenuItem i7 = new MenuItem("Cut Ctrl+Shift+N");
        MenuItem i8 = new MenuItem("Copy  Ctrl+C");
        MenuItem i9 = new MenuItem("Paste Ctrl+Shift+N");
        MenuItem i10 = new MenuItem("Delete Ctrl+D");
        MenuItem i11 = new MenuItem("Word Wrap");
        MenuItem i12 = new MenuItem("Font...");
        MenuItem i13 = new MenuItem("Zoom");
        MenuItem i14 = new MenuItem("Status Bar");
        MenuItem i15 = new MenuItem("About Notepad");

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        mb.add(m5);
        m1.add(i1);
        m1.add(i2);
        m1.add(i3);
        m1.add(i4);
        m1.add(i5);
        m2.add(i6);
        m2.add(i7);
        m2.add(i8);
        m2.add(i9);
        m2.add(i10);
        m3.add(i11);
        m3.add(i12);
        m4.add(i13);
        m4.add(i14);
        m5.add(sb);
        sb.add(i15);
        f.setMenuBar(mb);
        f.setSize(600,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new Notepad();
    }
}

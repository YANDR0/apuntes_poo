package BasicWindows;

public class ExtendedWindow {

    protected String title = "Untitulado";

    public ExtendedWindow(String title){
        super();    //Llamar al primer costructor de BasicWindows
        this.title = title;
    }

    public ExtendedWindow(String title, int x, int y, int w, int h){
        super(x, y, w, h);    //Llamar al primer costructor de BasicWindows
        this.title = title;
    }


}

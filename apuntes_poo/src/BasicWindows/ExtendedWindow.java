package BasicWindows;

public class ExtendedWindow extends BasicWindows{

    protected String title = "Untitulado";

    public ExtendedWindow(String title){
        super();    //Llamar al primer costructor de BasicWindows
        this.title = title;
    }

    public ExtendedWindow(String title, int x, int y, int w, int h){
        super(x, y, w, h);    //Llamar al primer costructor de BasicWindows
        this.title = title;
    }

    public void Move(int dx, int dy){
        super.x += dx;
        if(super.x < 0) super.x = 0;

        super.y += dy;
        if(super.y < 0) super.y = 0;
    }

    @Override
    public void display(){
        System.out.println("Title: " + title);
        super.display();
    }


}

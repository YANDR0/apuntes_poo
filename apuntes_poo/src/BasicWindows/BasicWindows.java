package BasicWindows;

public class BasicWindows {

    public static final int MIN_WIDTH = 10, MIN_HEIGHT = 15;

    protected int x = 0, y = 0, widht = 0, height = 0;

    public BasicWindows(){
        this.widht = MIN_WIDTH;
        this.height = MIN_HEIGHT;
    }

    public BasicWindows(int x, int y, int w, int h){
        this.x = x > 0? x: 0;
        this.y = y > 0? y: 0;
        resize(w, h);

    }

    public void display(){
        System.out.printf("[x = %d, y = %d, widht = %d, height = %d]", this.x, this.y, this.widht, this.height);
    }

    public void resize(int dw, int dh){
        this.widht = this.widht + dw >= MIN_HEIGHT? this.widht + dw : this.widht;
        this.height = this.height + dh >= MIN_HEIGHT? this.height + dh : this.height;
    }



}

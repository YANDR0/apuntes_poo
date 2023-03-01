package rgb;

public class RGBCOLOR {
    private int red = 0, green = 0, blue = 0;
    private final String name;

    public RGBCOLOR(){
        this(127,127,127);
    }

    public RGBCOLOR( int r, int g, int b){
        this(r,g,b,"Colorn't");
    }

    public RGBCOLOR( int r, int g, int b, String name){
        setRed(r);
        setGreen(g);
        setBlue(b);
        this.name = name;
    }

    //SETS
    public void setRed(int value){
        if(value >= 0 && value <= 255)
            this.red = value;
    }

    public void setGreen(int value){
        if(value >= 0 && value <= 255)
            this.green = value;
    }

    public void setBlue(int value){
        if(value >= 0 && value <= 255)
            this.blue = value;
    }

    /* YA NO SIRVE
    public void  setName(String str){
        this.name = str;
    }
    */


    // GETS
    public int getRed(){
        return red;
    }

    public int getGreen(){
        return green;
    }

    public int getBlue(){
        return blue;
    }

    public String getName(){
        return name;
    }


    // GETS EXTRAS
    public int getCyan(){
        return 255 - this.red;
    }

    public int getMagenta(){
        return 255 - this.green;
    }

    public  int getYellow(){
        return 255 - this.blue;
    }

    public int getRGB(){
        int rgb = 0;
        rgb = rgb | (this.red << 16) | (this.green << 8) | this.blue;

        return rgb;
    }


    @Override
    public String toString() {
        return String.format("{red: %d, green: %d, blue: %d, name: %s", this.red, this.green, this.blue, this.name);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof RGBCOLOR))
            return false;
        RGBCOLOR color = (RGBCOLOR)obj;
        return this.getRGB() == color.getRGB();
    }

    public RGBCOLOR clone(){
        return new RGBCOLOR(this.red, this.green, this.blue, this.name);
    }


}

package Autoboxing;

public class Buffer <Type> {

    private Type objetInBuffer = null;



    public boolean store(Type obj){
        if(this.objetInBuffer != null)
            return false;

        this.objetInBuffer = obj;
        return true;
    }

    public Type peek(){
        return this.objetInBuffer;
    }

    public Type pop(){
        Type tmp = this.objetInBuffer;
        this.objetInBuffer = null;
        return tmp;
    }


}


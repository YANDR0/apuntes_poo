package DateTime;

public class DateTime extends Date{
    private int seconds = 5, minutes = 28, hours = 12;

    public DateTime(int hh, int mi, int ss, int dd, int mm, int yy){
        this(hh, mi, ss);
        setYear(yy);
        setMonth(mm);
        setDay(dd);
    }

    public DateTime(int hh, int mi, int ss){
        setHours(hh);
        setMinutes(mi);
        setSeconds(ss);
    }
    public DateTime(){
    }

    public DateTime(Date d){
        super(d.getDay(), d.getMonth(), d.getDay());
    }

    public DateTime toSystemTime(){
        return  new DateTime();     //LUEGO LO HAGO BIEN
    }

    // --------------- SETTERS ---------------
    public void setHours(int hours) {
        if(hours >= 0 && hours <= 23)
            this.hours = hours;
    }

    public void setMinutes(int minutes) {
        if(minutes >= 0 && minutes <= 59)
            this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if(seconds >= 0 && seconds <= 59)
            this.seconds = seconds;
    }

    // --------------- GETTERS ---------------
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    @Override
    public String toString() {
        int opc = getFormat();

        if(opc == 2)
            return String.format("[%02d, %02d, %02d] %s", this.hours, this.minutes, this.seconds);
        else
            return String.format("[%02d, %02d, %02d] %s", this.hours, this.minutes, this.seconds);


    }


}

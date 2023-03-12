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
        setDay(d.getDay());
        setMonth(d.getMonth());
        setYear(d.getYear());
    }

    public void toSystemTime(){

    }   //LUEGO LO HAGO


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

    // --------------- ToSTRING ---------------
    @Override
    public String toString() {
        int opc = getFormat();
        String time;
        if(opc == 0) {
            time = String.format("[%01d:%02d:%02d] ", this.hours, this.minutes, this.seconds);
            return time + super.toString();
        }

        if(this.hours == 0)
            time = String.format("[%01d:%02d:%02d AM] ", this.hours + 12, this.minutes, this.seconds);
        else if(this.hours > 12)
            time = String.format("[%01d:%02d:%02d PM] ", this.hours - 12, this.minutes, this.seconds);
        else
            time = String.format("[%01d:%02d:%02d AM] ", this.hours, this.minutes, this.seconds);

        return time + super.toString();
    }

    // --------------- EQUALS, CLONE, NEXT Y TODATE---------------

    @Override
    public boolean equals(Object o){
        if(!(o instanceof DateTime)) return false;
        DateTime d = (DateTime) o;
        return super.equals(d) && this.hours == d.hours && this.minutes == d.minutes && this.seconds == d.seconds;
    }

    @Override
    public DateTime clone(){
        return new DateTime(this.hours, this.minutes, this.seconds, this.getDay(), this.getMonth(), this.getYear());
    }

    @Override
    public void next(){
        if(this.seconds < 59)
            this.seconds ++;
        else if (this.minutes < 59) {
            this.minutes++;
            this.seconds = 0;
        }
        else if (this.hours < 23) {
            this.hours++;
            this.minutes = 0;
            this.seconds = 0;
        }
        else {
            super.next();
            this.hours = 0;
            this.minutes = 0;
            this.seconds = 0;
        }
    }

    public Date toDate(){
        return new Date(this.getDay(), this.getMonth(), this.getYear());
    }


}

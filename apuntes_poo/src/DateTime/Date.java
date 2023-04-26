package DateTime;

public class Date implements Comparable<Date> {
    public static final int MIN_YEAR = 1900, MAX_YEAR = 3000;
    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril",
            "Mayo", "Junio", "Julio",
            "Agosto", "Septiembre", "Octubre",
            "Noviembre", "Diciembre"};
    private int    day = 1, month = 1, year = 2017;
    private int    format = 0;
    public Date() {
    }
    public Date(int day, int month, int year) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }
    public Date(int day, int month, int year, int format) {
        this(day, month, year);
        setFormat(format);
    }
    public int getDay() {
        return this.day;
    }
    public void setDay(int day) {
        if(isValidDate(day, this.month, this.year)) this.day = day;
    }
    public int getMonth() {
        return this.month;
    }
    public void setMonth(int month) {
        if(isValidDate(this.day, month, this.year)) this.month = month;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        if(isValidDate(this.day, this.month, year)) this.year = year;
    }
    public int getFormat() {
        return this.format;
    }
    public void setFormat(int format) {
        if(format >= 0 && format <= 2) this.format = format;
    }
    public String getMonthName() {
        return MONTHS[this.month - 1];
    }
    public String toString() {
        switch(this.format) {
            case 0  : return String.format("%02d/%02d/%02d",
                    this.day, this.month, this.year % 100);
            case 1  : return String.format("%d-%s-%d",
                    this.day, getMonthName().substring(0, 3), this.year);
            default : return String.format("%d de %s de %d",
                    this.day, getMonthName().toLowerCase(),   this.year);
        }
    }
    public boolean equals(Object o) {
        if(!(o instanceof Date)) return false;
        Date d = (Date) o;
        return this.day == d.day && this.month == d.month && this.year == d.year;
    }
    public Date clone() {
        return new Date(this.day, this.month, this.year, this.format);
    }
    public void next() {
        int dd = this.day;
        int mm = this.month;
        int yy = this.year;
        dd ++;
        if(!isValidDate(dd, mm, yy)) {
            dd = 1;
            mm ++;
            if(mm > 12) {
                mm = 1;
                yy ++;
            }
        }
        this.day = dd;
        this.month = mm;
        this.year = yy;
    }
    public static boolean isLeap(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
    public boolean isLeap() {
        return isLeap(this.year);
    }
    public static boolean isValidDate(int dd, int mm, int yy) {
        if(dd < 1 || dd > 31 || mm < 1 || mm > 12 || yy < MIN_YEAR || yy >
                MAX_YEAR) return false;
        if(mm == 2 && (dd > 29 || !isLeap(yy) && dd > 28)) return false;
        if(dd > 30 && (mm == 4 || mm == 6 || mm == 9 || mm == 11)) return false;
        return true;
    }
    public static void main(String[] args) {
        Date d = new Date(15, 6, 3002);
        for(int i = 0; i < 100; i ++) {
            for(int f = 0; f <= 2; f ++) {
                d.setFormat(f);
                System.out.print(d + "\t\t");
            }
            System.out.println();
            d.next();
        }
        System.out.println(d);
    }


    @Override
    public int compareTo(Date d) {
        if(this.year < d.year || this.year == d.year && this.month < d.month || this.year == d.year && this.month == d.month && this.day < d.day) return 1;
        if(this.year == d.year && this.month == d.month && this.day == d.day) return 0;
        return -1;
    }
}
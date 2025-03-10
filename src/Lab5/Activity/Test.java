package OOP_CUI_Class_Work.src.Lab5.Activity;

class Date1 {
    private int day;
    private int month;
    private int year;
    public Date1(int theMonth, int theDay, int theYear) {
        month = checkmonth(theMonth);
        day = checkday(theDay);
        year = theYear;
    }
    private int checkmonth(int testMonth) {
        if (testMonth > 0 && testMonth <= 12) {
        return testMonth;
    } else {
        System.out.println("Invalid month" + testMonth + "set to 1");
        return 1;
    }
    }
    private int checkday(int testDay) {
        int daysofmonth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (testDay > 0 && testDay <= daysofmonth[month]) {
            return testDay;
        } else if (month == 2 && testDay == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            return testDay;
        } else {
            System.out.println("Invalid date" + testDay + "set to 1");
            return 1;
        }

    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }public void display() {
        System.out.println(day + " " + month + " " + year);
    }
}
class employee {
    private String name;
    private String fname;
    private Date1 birthdate;
    private Date1 hiredate;
    employee() {
    }
    employee(String x, String y, Date1
            birthofDate1, Date1 dateofHire) {
        name = x;
        fname = y;
        birthdate = birthofDate1;
        hiredate = dateofHire;
    }
    public void setname(String x) {
        name = x;
    }
    public String getname() {
        return name;
    }
    public void setfname(String x) {
        fname = x;
    }public String getfname() {
        return fname;
    }
    public void setbirthdate(Date1 b) {
        birthdate = b;
    }
    public Date1 getbirthdate() {
        return birthdate;
    }
    public void sethiredate(Date1 h) {
        hiredate = h;
    }
    public Date1 gethiredate() {
        return hiredate;
    }
    public void display() {
        System.out.println("Name: " + name + " Father Name: " + fname);
        birthdate.display();
        hiredate.display();
    }
}
public class Test {
    public static void main(String[] args) {
        Date1 b = new Date1(1, 12, 1990);
        Date1 h = new Date1(5, 6, 2016);
        employee e1 = new employee("xxx", "yyyy",b, h);
        e1.display();
    }
}
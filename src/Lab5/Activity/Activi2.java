package OOP_CUI_Class_Work.src.Lab5.Activity;

class Date {
    private final int day;
    private final int month;
    private final int year;

    public Date(int theMonth, int theDay, int theYear) {
        month = checkmonth(theMonth); // First, assign month
        day = checkday(theDay);  // Now call checkday() after month is set
        year = theYear;
    }

    private int checkmonth(int testMonth) {
        if (testMonth > 0 && testMonth <= 12) {
            return testMonth;
        } else {
            System.out.println("Invalid month " + testMonth + " set to 1");
            return 1;
        }
    }

    private int checkday(int testDay) {
        int[] daysofmonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (testDay > 0 && testDay <= daysofmonth[month]) {
            return testDay;
        } else if (month == 2 && testDay == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            return testDay;
        } else {
            System.out.println("Invalid date " + testDay + " set to 1");
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
    }

    public void display() {
        System.out.println(getDay() + " " + getMonth() + " " + getYear());
    }
}

class Employee {
    private final String name;
    private final String fname;
    private final Date1 birthdate;
    private final Date1 hiredate;

    public Employee(String x, String y, Date1 birthofDate, Date1 dateofHire) {
        name = x;
        fname = y;
        birthdate = birthofDate;
        hiredate = dateofHire;
    }

    public void display() {
        System.out.println("Name: " + name + " Father Name: " + fname);
        birthdate.display();
        hiredate.display();
    }
}

public class Activi2 {
    public static void main(String[] args) {
        Date1 b = new Date1(1, 12, 1990);
        Date1 h = new Date1(5, 6, 2016);
        Employee e1 = new Employee("xxx", "yyyy", b, h);
        e1.display();
    }
}
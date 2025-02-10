package OOP_CUI_Class_Work.src.Activity;
class  Date{
    public String studentname;
    public String coursename;
    public String grade;
    public void display(){
        System.out.println( " Student name "+ studentname+" Course name "+coursename+" Grade "+grade);
    }
}

 class Acti3 {
    public static void main(String[] args) {

        Date date1,date2;
        date1 = new Date();
        date1.studentname = "Junaid";
        date1.coursename = "SE";
        date1.grade = "A";
        date1.display();
        date2 = new Date();
        date2.studentname ="Manan";
        date2.coursename = "SE";
        date2.grade ="A";
        date2.display();

    }
}

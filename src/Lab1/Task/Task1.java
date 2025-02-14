package OOP_CUI_Class_Work.src.Lab1.Task;
class Student{
    public int StudentId;
    public String StudentName;
    public String Program;
    public Double GPA ;
    public void display(){
        System.out.println(StudentId + " "+StudentName+" "+Program+" "+Program+" "+GPA);
    }
}
class Task1{
    public static void main(String[] args) {
      Student S1 = new Student();
      S1.StudentId = 12346;
      S1.StudentName = "Junaid";
      S1.Program = "SE";
      S1.GPA = 3.86;
      S1.display();
    }
}
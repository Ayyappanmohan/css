class SchoolDriver{

public static void main(String[]args)
    {


School1 s1=new School1("mgr","maduravoyal","ayyapapan",2000);
    
System.out.println(s1.getSchoolName());
System.out.println(s1.getSchoolAddress());
System.out.println(s1.getPrincipal());
System.out.println(s1.getNoOfStudents());

s1.setPrincipal("rubesh");
System.out.println(s1.getPrincipal());

s1.setNoOfStudents(4000);
System.out.println(s1.getNoOfStudents());




    }
   
}
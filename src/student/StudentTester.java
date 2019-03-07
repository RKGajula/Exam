/*
 * Ramya Krishna Gajula
 * Student ID: 99
 * Syst 
 */
package student;

/**
 *
 * @author 
 */
public class StudentTester {
    public static void main(String[] args)
    {
        Student s1=new Student();
        s1.setName("Hamza");
        Student[] s = new Student[5];
        s[0]=s1;
        Student s2=new Student();
        s2.setName("jatin");
        s[1]=s2;
        System.out.println(s1.getName());
        System.out.println(s2.getName());
        
        
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Menu {
   public  static void main(String[] args)
    {
        System.out.println("Welcome to E-Learning Hub");
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        while(true) {

            System.out.println("Please Choose your option");
            System.out.println("1 : ADD New Course");
            System.out.println("2 : ADD New Students ");
            System.out.println("3 : See All Students ");
            System.out.println("4 : See All Course ");
            System.out.println("5 : Exit ");
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();

            if (option.equals("1")) {
                System.out.println("Please Enter Course Name : ");
                String c = sc.nextLine();
                System.out.println("Now,Enter Course Details : ");
                String cD = sc.nextLine();
                courses.add(new Course(c, cD));
                System.out.println("Course is Added ");
            } else if (option.equals("2")) {
                System.out.println("Please Enter Student Name : ");
                String sN = sc.nextLine();
                System.out.println("Now,Enter EnrollmentNu Details : ");
                String sD = sc.nextLine();
                System.out.println("IF you want to add course for Student please Enter 1 else 2 ");
                String ch = sc.nextLine();
                if (ch.equals("1")) {
                    System.out.println("Please Enter Course Name : ");
                    String c1 = sc.nextLine();
                    System.out.println("Now,Enter Course Details : ");
                    String cD1 = sc.nextLine();
                    Course obj = new Course(c1, cD1);
                    courses.add(obj);
                    students.add(new Student(sN, sD, obj));
                } else if(ch.equals("2")){
                    students.add(new Student(sN, sD, new Course("NA", "No Course Assigned Yet")));
                }else
                {
                    System.out.println("In correct option,Student is not Added,please retry");
                    System.out.println();
                    continue;
                }



            }

            else if (option.equals("3")) {
                if (!students.isEmpty()) {
                    for (Student s : students)
                    {
                        System.out.println(s.getName());
                        System.out.println(s.getEnrollmentId());
                        System.out.println("Course : "+s.getCourse().getName()+
                                            "  Details : "+s.getCourse().getDetail());

                    }
                    System.out.println();

                } else
                    System.out.println("NO Student Found");
            }
            else if (option.equals("4")) {

                if (!courses.isEmpty()) {
                    for (Course c : courses)
                    {
                        System.out.println(c.getName());
                        System.out.println(c.getDetail());
                    }
                    System.out.println();
                } else
                    System.out.println("NO Courses Found");
            }
            else if (option.equals("5")) {
                System.out.println("Thankyou");
                       break;
            }
            else {
                System.out.println("Incorrect  Please Retry");
                System.out.println();
            }

        }
    }
}

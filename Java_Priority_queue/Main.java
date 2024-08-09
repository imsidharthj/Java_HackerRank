import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;
class Student{
    int id;
    String name = new String();
    double cgpa;
    public Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getID(){
        return id;        
    }
    public String getName(){
        return name;
    }
    public double getCGPA(){
        return cgpa;
    }
}
class Priorities{
    PriorityQueue<Student> priorities ;
    Priorities(){
        priorities = new PriorityQueue<>((a, b) ->{
            int compare_ = Double.compare(a.getCGPA(), b.getCGPA());
            if (compare_ == 0){
                compare_ = (a.getName().compareTo(b.getName()));
                if (compare_ == 0){
                    compare_ = Integer.compare(a.getID(), b.getID());
                }
            }
            return compare_;
        });
    }
    // private final PriorityQueue<Student> queue = new PriorityQueue<>(
    //         Comparator.comparing(Student::getCGPA).reversed()
    //                 .thenComparing(Student::getName)
    //                 .thenComparing(Student::getID));
    public List<Student> getStudents(List<String> events) {
        for (String event : events) {
            String[] parts = event.split(" ");
            if (parts[0].equals("ENTER")) {
                int id = Integer.parseInt(parts[3]);
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                priorities.add(new Student(id, name, cgpa));
            } else if (parts[0].equals("SERVED")) {
                priorities.poll();
            }
        }
        // events.forEach((event) -> {
        //     if (event.equals("SERVED")) {
        //         queue.poll();
        //     } else {
        //         String[] details = event.split(" ");
                
        //         queue.add(new Student(Integer.parseInt(details[3]), details[1], Double.parseDouble(details[2])));
        //     }
        // });

        List<Student> students = new ArrayList<>();
        while (!priorities.isEmpty()) {
            students.add(priorities.poll());
        }
        return students;
}
}

public class Main {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
import java.util.Comparator;
import java.lang.Math;
import java.util.PriorityQueue;

class Student
{
    private int id;
    private String name;
    private double cgpa;
    public Student(int id, String name, double cgpa)
    {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getID()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public double getCGPA()
    {
        return cgpa;
    }
}

class Priorities
{
    public List<Student> getStudents(List<String> events)
    {
        int nServed = 0;
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2)
            {
                if (o1.getCGPA() != o2.getCGPA())
                    return Double.compare(o2.getCGPA(), o1.getCGPA());
                else if (!o1.getName().equals(o2.getName()))
                    return o1.getName().compareTo(o2.getName());
                else
                    return Integer.compare(o1.getID(), o2.getID());
            }
        };
        PriorityQueue<Student> students = new PriorityQueue(events.size(),
                                                            comparator);
        for (int i = 0; i < events.size(); i++)
        {
            if (events.get(i).equals("SERVED"))
                students.poll();
            else
            {
                String[] current = events.get(i).split(" ");
                int id = Integer.parseInt(current[3]);
                String name = current[1];
                double cgpa = Double.parseDouble(current[2]);
                Student student = new Student(id,
                                              name,
                                              cgpa);
                students.offer(student);
            }
        }
        List<Student> list = new ArrayList();
        while (!students.isEmpty())
            list.add(students.poll());
        return list;
    }
}

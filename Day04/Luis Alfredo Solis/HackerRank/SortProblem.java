import java.util.*;

class Student implements Comparable<Student>{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student o) {
        if(o.cgpa > this.cgpa){
            return -1;
        }
        else if(o.cgpa < this.getCgpa()){
            return 1;
        }
        else{
            if(o.fname.compareTo(this.fname) == 0){
                if(o.id > this.id){
                    return -1;
                }
                else{
                    return 1;
                }
            }
            else
                return o.fname.compareTo(this.fname);
        }
    }
}

//Complete the code
public class SortProblem
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        Collections.sort(studentList, Collections.reverseOrder());
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}
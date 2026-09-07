

// ---- Abstract class with common data, constructor, concrete + abstract methods ----
abstract class StudentEvaluation {
    // common data for every student, regardless of course type
    protected String name;
    protected int rollNo;

    // constructor initializes the common fields
    public StudentEvaluation(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // concrete method - same for every subclass, so it lives in the abstract class
    public void displayStudentDetails() {
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
    }

    // abstract methods - every course type calculates marks/grades differently
    public abstract double calculateTotalMarks();

    public abstract String displayGrade();
}

// ---- Subclass 1: UG course evaluation ----
class UGCourseEvaluation extends StudentEvaluation {
    private double internal;   // out of 40
    private double external;   // out of 60

    public UGCourseEvaluation(String name, int rollNo, double internal, double external) {
        super(name, rollNo);
        this.internal = internal;
        this.external = external;
    }

    @Override
    public double calculateTotalMarks() {
        return internal + external;
    }

    @Override
    public String displayGrade() {
        double total = calculateTotalMarks();
        if (total >= 90) return "O";
        else if (total >= 80) return "A+";
        else if (total >= 70) return "A";
        else if (total >= 60) return "B";
        else return "RA";
    }
}

// ---- Subclass 2: PG course evaluation ----
class PGCourseEvaluation extends StudentEvaluation {
    private double assignment; // out of 20
    private double project;    // out of 30
    private double exam;       // out of 50

    public PGCourseEvaluation(String name, int rollNo, double assignment, double project, double exam) {
        super(name, rollNo);
        this.assignment = assignment;
        this.project = project;
        this.exam = exam;
    }

    @Override
    public double calculateTotalMarks() {
        return assignment + project + exam;
    }

    @Override
    public String displayGrade() {
        double total = calculateTotalMarks();
        if (total >= 85) return "Distinction";
        else if (total >= 60) return "First Class";
        else if (total >= 50) return "Second Class";
        else return "Fail";
    }
}

// ---- Subclass 3: Certificate course evaluation ----
class CertificateCourseEvaluation extends StudentEvaluation {
    private double attendanceScore; // out of 10
    private double testScore;       // out of 90

    public CertificateCourseEvaluation(String name, int rollNo, double attendanceScore, double testScore) {
        super(name, rollNo);
        this.attendanceScore = attendanceScore;
        this.testScore = testScore;
    }

    @Override
    public double calculateTotalMarks() {
        return attendanceScore + testScore;
    }

    @Override
    public String displayGrade() {
        double total = calculateTotalMarks();
        return (total >= 50) ? "Certified" : "Not Certified";
    }
}

// ---- Extra course type added WITHOUT touching the abstract class ----
// Shows the system is open for extension but closed for modification.
class DiplomaCourseEvaluation extends StudentEvaluation {
    private double practical; // out of 50
    private double theory;    // out of 50

    public DiplomaCourseEvaluation(String name, int rollNo, double practical, double theory) {
        super(name, rollNo);
        this.practical = practical;
        this.theory = theory;
    }

    @Override
    public double calculateTotalMarks() {
        return practical + theory;
    }

    @Override
    public String displayGrade() {
        double total = calculateTotalMarks();
        return (total >= 50) ? "Pass" : "Fail";
    }
}

// ---- Driver class ----
public class Task1_UniversityEvaluationSystem {
    public static void main(String[] args) {

        // array of the abstract parent type holding five different student objects
        StudentEvaluation[] students = new StudentEvaluation[5];

        students[0] = new UGCourseEvaluation("Arun", 101, 35, 50);
        students[1] = new UGCourseEvaluation("Divya", 102, 38, 55);
        students[2] = new PGCourseEvaluation("Karthik", 201, 18, 27, 42);
        students[3] = new CertificateCourseEvaluation("Meena", 301, 9, 70);
        students[4] = new DiplomaCourseEvaluation("Ravi", 401, 40, 38);

        for (StudentEvaluation s : students) {
            System.out.println("--------------------------------------");
            s.displayStudentDetails();                       // concrete method
            System.out.println("Total Marks : " + s.calculateTotalMarks()); // abstract -> overridden
            System.out.println("Grade       : " + s.displayGrade());        // abstract -> overridden
        }
        System.out.println("--------------------------------------");
    }
}

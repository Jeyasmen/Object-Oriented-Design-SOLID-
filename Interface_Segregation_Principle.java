//*************************************************************************
// Title : A java programme to demonstrate Interface Segregation Principle.
// Author : Jeyasmen Akter, Undergrduate student, Khulna University.
//*************************************************************************


/**
 * Interface representing basic student information.
 */
interface StudentInfo {
    /**
     * Retrieves the name of the student.
     *
     * @return the name of the student
     */
    String getName();

    /**
     * Retrieves the ID of the student.
     *
     * @return the ID of the student
     */
    int getId();
}

/**
 * Interface representing printable student information.
 */
interface PrintableStudent {
    /**
     * Prints the information of the student.
     */
    void printStudentInformation();
}

/**
 * Class representing an undergraduate student.
 */
class UndergraduateStudent implements StudentInfo, PrintableStudent {
    private String name;
    private int id;

    /**
     * Constructs an undergraduate student object with the given name and ID.
     *
     * @param name the name of the undergraduate student
     * @param id   the ID of the undergraduate student
     */
    public UndergraduateStudent(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void printStudentInformation() {
        System.out.println("Undergraduate Student: " + name + ", ID: " + id);
    }
}

/**
 * Class representing a graduate student.
 */
class GraduateStudent implements StudentInfo, PrintableStudent {
    private String name;
    private int id;

    /**
     * Constructs a graduate student object with the given name and ID.
     *
     * @param name the name of the graduate student
     * @param id   the ID of the graduate student
     */
    public GraduateStudent(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void printStudentInformation() {
        System.out.println("Graduate Student: " + name + ", ID: " + id);
    }
}

/**
 * Main class demonstrating the usage of student classes.
 */
public class Main {
    /**
     * Entry point of the program.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        StudentInfo undergraduateStudent = new UndergraduateStudent("John Doe", 1001);
        StudentInfo graduateStudent = new GraduateStudent("Alice Smith", 2001);

        PrintableStudent printableUndergraduateStudent = (PrintableStudent) undergraduateStudent;
        PrintableStudent printableGraduateStudent = (PrintableStudent) graduateStudent;

        printableUndergraduateStudent.printStudentInformation();
        printableGraduateStudent.printStudentInformation();
    }
}

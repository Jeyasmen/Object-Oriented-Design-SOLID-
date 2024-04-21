//*************************************************************************
// Title : A java programme to demonstrate Dependency Inversion Principle.
// Author : Jeyasmen Akter, Undergrduate student, Khulna University.
//*************************************************************************


/**
 * Interface representing a student information provider.
 */
interface StudentDataProvider {
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
 * Class representing an undergraduate student.
 */
class UndergraduateStudent implements StudentDataProvider {
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
}

/**
 * Class representing a graduate student.
 */
class GraduateStudent implements StudentDataProvider {
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
}

/**
 * Class responsible for printing student information.
 */
class StudentInfoPrinter {
    /**
     * Prints the information of the student.
     *
     * @param studentDataProvider the student data provider
     */
    public void printStudentInformation(StudentDataProvider studentDataProvider) {
        System.out.println("Name: " + studentDataProvider.getName());
        System.out.println("ID: " + studentDataProvider.getId());
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
        StudentDataProvider undergraduateStudent = new UndergraduateStudent("John Doe", 1001);
        StudentDataProvider graduateStudent = new GraduateStudent("Alice Smith", 2001);

        StudentInfoPrinter studentInfoPrinter = new StudentInfoPrinter();
        studentInfoPrinter.printStudentInformation(undergraduateStudent);
        studentInfoPrinter.printStudentInformation(graduateStudent);
    }
}

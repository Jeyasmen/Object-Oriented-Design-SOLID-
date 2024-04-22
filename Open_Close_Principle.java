//**************************************************************************
// Title : A java programme to demonstrate Open Close Principle.
// Author : Jeyasmen Akter, Undergrduate student, Khulna University.
//*************************************************************************


/**
 * Interface representing a student.
 */
interface Student {
    /**
     * Retrieves the information of the student.
     *
     * @return the information of the student
     */
    String getInformation();
}

/**
 * Class representing an undergraduate student.
 */
class UndergraduateStudent implements Student {
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
    public String getInformation() {
        return "Undergraduate Student: " + name + ", ID: " + id;
    }
}

/**
 * Class representing a graduate student.
 */
class GraduateStudent implements Student {
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
    public String getInformation() {
        return "Graduate Student: " + name + ", ID: " + id;
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
        Student undergraduateStudent = new UndergraduateStudent("John Doe", 1001);
        Student graduateStudent = new GraduateStudent("Alice Smith", 2001);

        System.out.println(undergraduateStudent.getInformation());
        System.out.println(graduateStudent.getInformation());
    }
}

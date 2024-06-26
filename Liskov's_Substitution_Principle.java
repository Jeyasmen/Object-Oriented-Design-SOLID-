//**************************************************************************
// Title : A java programme to demonstrate Liskov's Substitution Principle.
// Author : Jeyasmen Akter, Undergrduate student, Khulna University.
//*************************************************************************

/**
 * Class representing a general student.
 */
class GeneralStudent {
    private String name;
    private int id;

    /**
     * Constructs a general student object with the given name and ID.
     *
     * @param name the name of the student
     * @param id   the ID of the student
     */
    public GeneralStudent(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getInformation() {
        return "Student: " + name + ", ID: " + id;
    }
}

/**
 * Class representing an undergraduate student, inheriting from GeneralStudent.
 */
class UndergraduateStudent extends GeneralStudent {
    private int year;

    /**
     * Constructs an undergraduate student object with the given name, ID, and year.
     *
     * @param name the name of the undergraduate student
     * @param id   the ID of the undergraduate student
     * @param year the year of study of the undergraduate student
     */
    public UndergraduateStudent(String name, int id, int year) {
        super(name, id);
        this.year = year;
    }

    /**
     * Retrieves the information of the undergraduate student.
     *
     * @return the information of the undergraduate student
     */
    @Override
    public String getInformation() {
        return "Undergraduate Student: " + getName() + ", ID: " + getId() + ", Year: " + year;
    }
}

/**
 * Class representing a graduate student, inheriting from GeneralStudent.
 */
class GraduateStudent extends GeneralStudent {
    private String advisor;

    /**
     * Constructs a graduate student object with the given name, ID, and advisor.
     *
     * @param name    the name of the graduate student
     * @param id      the ID of the graduate student
     * @param advisor the advisor of the graduate student
     */
    public GraduateStudent(String name, int id, String advisor) {
        super(name, id);
        this.advisor = advisor;
    }

    /**
     * Retrieves the information of the graduate student.
     *
     * @return the information of the graduate student
     */
    @Override
    public String getInformation() {
        return "Graduate Student: " + getName() + ", ID: " + getId() + ", Advisor: " + advisor;
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
        Student undergraduateStudent = new UndergraduateStudent("John Doe", 1001, 3);
        Student graduateStudent = new GraduateStudent("Alice Smith", 2001, "Dr. Brown");

        System.out.println(undergraduateStudent.getInformation());
        System.out.println(graduateStudent.getInformation());
    }
}

//*************************************************************************
// Title : A java programme to demonstrate Single Responsibility Principle.
// Author : Jeyasmen Akter, Undergrduate student, Khulna University.
//*************************************************************************


/**
 * Class representing a student.
 * Responsible for storing student information,
 * providing methods to retrieve individual attributes,
 * and encapsulating the responsibility of printing student information.
 */
class Student {
    private String name;
    private int id;
    private String email;

    /**
     * Constructs a student object with the given name, ID, and email.
     *
     * @param name  the name of the student
     * @param id    the ID of the student
     * @param email the email of the student
     */
    public Student(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    /**
     * Retrieves the name of the student.
     *
     * @return the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the ID of the student.
     *
     * @return the ID of the student
     */
    public int getId() {
        return id;
    }

    /**
     * Retrieves the email of the student.
     *
     * @return the email of the student
     */
    public String getEmail() {
        return email;
    }

    /**
     * Prints the information of the student.
     * Encapsulates the responsibility of printing student information.
     */
    public void printStudentInformation() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
    }
}

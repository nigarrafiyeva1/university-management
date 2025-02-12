public class Faculty {
    private String facultyID;
    private String name;
    private String department;
    private String email;
    private String phoneNumber;

    public Faculty(String facultyID, String name, String department, String email, String phoneNumber) {
        this.facultyID = facultyID;
        this.name = name;
        this.department = department;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getFacultyID() {
        return facultyID;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setFacultyID(String facultyID) {
        this.facultyID = facultyID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void displayFacultyDetails() {
        System.out.println("Faculty ID: " + facultyID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }

    public static void main(String[] args) {
        Faculty faculty1 = new Faculty("123", "Nigar", "Computer Science", "nigar@university.edu", "123-456-7890");
        faculty1.displayFacultyDetails();
    }
}

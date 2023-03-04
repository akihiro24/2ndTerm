class Student {

    private String degree;
    private String yearlevel;
    private String firstname;
    private String middlename;
    private String lastname;
    private String gender;
    // private int prelim;
    // private int midterm;
    // private int finals;

    public Student(String degree, String yearlevel, String firstname, String middlename, String lastname, String gender) {
        this.degree = (degree.isEmpty() ? "N/A" : degree);
        this.yearlevel = (yearlevel.isEmpty() ? "N/A" : yearlevel);
        this.firstname = (firstname.isEmpty() ? "N/A" : firstname);
        this.middlename = (middlename.isEmpty() ? "N/A" : middlename);
        this.lastname = (lastname.isEmpty() ? "N/A" : lastname);
        this.gender = (gender.isEmpty() ? "N/A" : gender);
    }

    public String getDegree() {
        return degree;
    }

    public String getYearLevel() {
        return yearlevel;
    }

    public String getFirstName() {
        return firstname;
    }
    
    public String getMiddleName() {
        return middlename;
    }

    public String getLastName() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Degree: " + degree + "\n" +
                "YearLevel: " + yearlevel + "\n" +
                "FirstName: " + firstname + "\n" +
                "MiddleName: " + middlename + "\n" +
                "LastName: " + lastname + "\n" +
                "Gender: " + gender + "\n";
    }
}
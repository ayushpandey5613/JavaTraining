public class Candidate {
    String firstName;
    String gender;
    float expectedSalary;

    public Candidate(String firstName,String gender,float expectedSalary) throws InvalidSalaryException {
        this.firstName = firstName;
        this.gender=gender;
        if(expectedSalary<10000)
            throw new InvalidSalaryException("Salary is very less");
        else
            this.expectedSalary=expectedSalary;


    }
}

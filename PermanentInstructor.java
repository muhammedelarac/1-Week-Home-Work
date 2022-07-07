import java.util.List;
import java.util.Objects;

public class PermanentInstructor extends Instructor {

    private double  fixedSalary ;

  
     
    public PermanentInstructor() {
    }

    /**
     * @param fixedSalary
     */
    public PermanentInstructor(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    /**
     * @param name
     * @param phoneNumber
     * @param address
     * @param courseList
     * @param fixedSalary
     */
    public PermanentInstructor(String name, String phoneNumber, String address, List<Course> courseList,
            double fixedSalary) {
        super(name, phoneNumber, address, courseList);
        this.fixedSalary = fixedSalary;
    }





    /**
     * @return
     */
    public double getFixedSalary() {
        return fixedSalary;
    }

    
    /**
     * @param fixedSalary
     */
    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }


  
    
   

  
    
    /* (non-Javadoc)
     * @see Instructor#toString()
     */
    @Override
    public String toString() {
        return "PermanentInstructor [fixedSalary=" + fixedSalary + "]";
    }
}

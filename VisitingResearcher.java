import java.util.List;
import java.util.Objects;

public class VisitingResearcher extends Instructor {

    private double  hourlySalary ;

    
    
    public VisitingResearcher() {
    }

   
     /**
     * @param hourlySalary
     */
    public VisitingResearcher(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    /**
     * @param name
     * @param phoneNumber
     * @param address
     * @param courseList
     * @param hourlySalary
     */
    public VisitingResearcher(String name, String phoneNumber, String address, List<Course> courseList,
            double hourlySalary) {
        super(name, phoneNumber, address, courseList);
        this.hourlySalary = hourlySalary;
    }

   

    /**
     * @return
     */
    public double getHourlySalary() {
        return hourlySalary;
    }

    /**
     * @param hourlySalary
     */
    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    
    
   
    
    /* (non-Javadoc)
     * @see Instructor#toString()
     */
    @Override
    public String toString() {
        return "VisitingResearcher [hourlySalary=" + hourlySalary + "]";
    }
    

}

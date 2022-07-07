import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Instructor {

    private String name;
    private String phoneNumber ;
    private String address ;
    private List<Course> courseList = new ArrayList<>();



    /**
     * 
     */
    public Instructor() {
    }

    /**
     * @param name
     * @param phoneNumber
     * @param address
     * @param courseList
     */
    public Instructor(String name, String phoneNumber, String address, List<Course> courseList) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.courseList = courseList;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }
   
    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * @return
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    /**
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
   
    /**
     * @return
     */
    public String getAddress() {
        return address;
    }
   
    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

   

    
    

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Instructors [address=" + address + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    
    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Instructor))
            return false;
        Instructor other = (Instructor) obj;
        return Objects.equals(phoneNumber, other.phoneNumber);
    }
    


    
}

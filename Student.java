import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
  private String name;
  private LocalDate birthDate ;
  private String address;
  private String gender;

 
private List <Course> courseList = new ArrayList<>();

 
public Student (){

  }

  
  /**
 * @param name
 * @param birthDate
 * @param address
 * @param gender
 */
public Student(String name, LocalDate birthDate, String address, String gender) {
    this.name = name;
    this.birthDate = birthDate;
    this.address = address;
    this.gender = gender;
    
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
public LocalDate getBirthDate() {
    return birthDate;
}


/**
 * @param birthDate
 */
public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
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



/**
 * @return
 */
public String getGender() {
    return gender;
}


/**
 * @param gender
 */
public void setGender(String gender) {
    this.gender = gender;
}


/**
 * @return
 */
public List<Course> getCourseList() {
    return courseList;
}


/**
 * @param courseList
 */
public void setCourseList(List<Course> courseList) {
    this.courseList = courseList;
}









/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
    return "Student [address=" + address + ", birthDate=" + birthDate + ", gender=" + gender + ", name=" + name + "]";
}













    
}
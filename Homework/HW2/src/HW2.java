/**
 * @author Ryan Bankert
 * Class: MIST352-Fall23
 * Homework #2
 * 
 */

//Define the Student class
 class Student {
 private String name;
 private int id;
 private String major;
 private String dob;
 private int hours;

 // Setters for student attributes
 public void setName(String theName) {
     this.name = theName;
 }

 public void setID(int theID) {
     this.id = theID;
 }

 public void setMajor(String theMajor) {
     this.major = theMajor;
 }

 public void setDOB(String theDOB) {
     this.dob = theDOB;
 }

 // Setter for hours with an action
 public void setHours(int hours, String action) {
     if (action.equals("add")) {
         this.hours += hours;
     } else if (action.equals("subtract")) {
         this.hours -= hours;
     }
 }

 // Getters for student attributes
 public String getName() {
     return this.name;
 }

 public int getID() {
     return this.id;
 }

 public String getMajor() {
     return this.major;
 }

 public String getDOB() {
     return this.dob;
 }

 public int getHours() {
     return this.hours;
 }
}

//Define the TestScores class to store test scores/calculate the average
 class TestScores {
 private double score1;
 private double score2;
 private double score3;

 // Constructor to initialize test scores
 public TestScores(double s1, double s2, double s3) {
     this.score1 = s1;
     this.score2 = s2;
     this.score3 = s3;
 }

 // Setters for test scores
 public void setScore1(double n) {
     this.score1 = n;
 }

 public void setScore2(double n) {
     this.score2 = n;
 }

 public void setScore3(double n) {
     this.score3 = n;
 }

 // Getters for test scores
 public double getScore1() {
     return this.score1;
 }

 public double getScore2() {
     return this.score2;
 }

 public double getScore3() {
     return this.score3;
 }

 // Calculate and return the average of test scores
 public double getAverageScore() {
     return (this.score1 + this.score2 + this.score3) / 3;
 }
}

//Define the Course class with attributes/enrollment method
 class Course {
 private String courseCode;
 private String courseTitle;
 private String instructorName;
 private int maximumCapacity;
 private int currentEnrollment;

 // Constructor to initialize maximum capacity/current enrollment
 public Course() {
     this.maximumCapacity = 30;
     this.currentEnrollment = 29;
 }

 // Enrollment method: Increment enrollment
 public boolean enroll1Student() {
     if (currentEnrollment < maximumCapacity) {
         currentEnrollment++;
         return true;
     }
     return false;
 }

 
 public void setCourseCode(String courseCode) {
	this.courseCode = courseCode;
}

public void setCourseTitle(String courseTitle) {
	this.courseTitle = courseTitle;
}

public void setInstructorName(String instructorName) {
	this.instructorName = instructorName;
}

public void setMaximumCapacity(int maximumCapacity) {
	this.maximumCapacity = maximumCapacity;
}

public void setCurrentEnrollment(int currentEnrollment) {
	this.currentEnrollment = currentEnrollment;
}

// Getters for course attributes
 public String getCourseCode() {
     return courseCode;
 }

 public String getCourseTitle() {
     return courseTitle;
 }

 public String getInstructorName() {
     return instructorName;
 }

 public int getMaximumCapacity() {
     return maximumCapacity;
 }

 public int getCurrentEnrollment() {
     return currentEnrollment;
 }
}

// Main class for the code
public class HW2 {
 public static void main(String[] args) {
     // Create instances of Course, Student, and TestScores
     Course MIST352 = new Course();
     Course CS101 = new Course();
     Student Ashley = new Student();
     Student Ali = new Student();

     // Enroll Ashley Jaber for their classes and confirm enrollment
     System.out.println("Enrolling Ashley Jaber in MIST352 successful: " + MIST352.enroll1Student());
     System.out.println("Current enrollment: " + MIST352.getCurrentEnrollment());

     // Set course details for MIST352
     MIST352.setCourseCode("MIST352");
     MIST352.setCourseTitle("MIST352 Title");
     MIST352.setInstructorName("Instructor Name");

     // Set test scores for MIST352 and calculate average GPA
     TestScores MIST352Grades = new TestScores(78, 75, 90);
     MIST352Grades.setScore1(78);
     MIST352Grades.setScore2(90);
     MIST352Grades.setScore3(75);

     System.out.println("The current GPA is: " + MIST352Grades.getAverageScore());

     
     System.out.println("Enrolling Ashley Jaber in CS101 successful: " + CS101.enroll1Student());
     System.out.println("Current enrollment: " + CS101.getCurrentEnrollment());

     // Set course details for CS101
     CS101.setCourseCode("CS101");
     CS101.setCourseTitle("CS101 Title");
     CS101.setInstructorName("Instructor Name");

     // Set test scores for CS101 and calculate average GPA
     TestScores CS101Grades = new TestScores(85, 90, 75);
     CS101Grades.setScore1(85);
     CS101Grades.setScore2(90);
     CS101Grades.setScore3(75);

     System.out.println("The current GPA is: " + CS101Grades.getAverageScore());

     
     System.out.println("Enrolling Ali June in MIST352: " + MIST352.enroll1Student());
     System.out.println("Enrolling Ali June in CS101: " + CS101.enroll1Student());

     //Compare GPA
     double MIST352GPA = MIST352Grades.getAverageScore();
     double CS101GPA = CS101Grades.getAverageScore();

     if (MIST352GPA > CS101GPA) {
         System.out.println("Ashley's GPA in MIST352 is greater than in CS101.");
     } else if (CS101GPA > MIST352GPA) {
         System.out.println("Ashley's GPA in CS101 is greater than in MIST352.");
     } else {
         System.out.println("Ashley's GPA is the same in both courses.");
     }

     // Enroll Ali June in their classes and confirm enrollment
     System.out.println("Enrolling Ali June in MIST352: " + MIST352.enroll1Student());
     System.out.println("Enrolling Ali June in CS101: " + CS101.enroll1Student());

   
     System.out.println("The class is full, therefore Ali cannot be enrolled.");
 }
}

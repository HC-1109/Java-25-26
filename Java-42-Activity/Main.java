
import java.io.IOException;
import java.sql.*;
// To Compile on the Replit shell use: (same as for mac)
// javac -cp sqlite-jdbc-3.23.1.jar: Main.java

// To compile in Windows use:
// javac -cp sqlite-jdbc-3.23.1.jar

// To execute(run) use:
// java -cp sqlite-jdbc-3.23.1.jar: Main
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {
    // Use the students database. To minimize errors, first use a SELECT statement to make sure you are starting out with the correct records.
    String sql = "";
    String queryResult = "";
    // setup appropriate DB object to students.db
    Database db = new Database("jdbc:sqlite:");
    
    // Challenge 1:
    // For student with ID of STUDENT1001, change room to 122 for period 3 class.
    sql = "UPDATE cr101 SET room = 122 WHERE studentid = 'STUDENT1001' AND period=3";
    db.runSQL(sql);

    // Challenge 2:
    // Remove course “ZQCTEDA” for student with id STUDENT1200 
    sql = "DELETE FROM cr101 WHERE studentid='STUDENT1200' AND course='ZQCTEDA'";
    db.runSQL(sql);

    // Challenge 3:
    // Change the room number of teacher1 DOYLE for periods 4 and 5 to room 213.
    sql = "UPDATE cr101 SET room = 213 WHERE teacher1='DOYLE' AND period in (4,5)";
    db.runSQL(sql);
    
    // Challenge 4:
    // Mr. ROFFLER will be replacing Mr. ARCHETTI for course “MQF44QGF” section 1. Update all records to reflect this change.
    sql = "UPDATE cr101 SET teacher1 = 'ROFFLER' WHERE teacher1='ARCHETTI' AND course='MQF44QGF' AND section=1";
    db.runSQL(sql);
    
    // Challenge 5:
    // Change the grade for STUDENT999 to 11 and the students offcclass to a junior status.
    sql = "UPDATE cr101 SET grade = 11, offclass = '3C8' WHERE studentid='STUDENT999'";
    db.runSQL(sql);
    
    // Challenge 6:
    // Add a course MKUFTC6 with a section 1. CASTRO R will be teaching this course period 9 in room 322 for student1231.
    sql =  "INSERT INTO cr101 (course, section, teacher1, period, room, studentid) VALUES ('MKUFTC6', 1, 'CASTRO R', 9, 322, 'STUDENT1231')";
    db.runSQL(sql);
     
  }    
}
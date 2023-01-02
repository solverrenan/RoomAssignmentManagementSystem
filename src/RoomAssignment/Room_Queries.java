/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RoomAssignment;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author yhammy21
 */
//Queries for schedules
public class Room_Queries extends SQLConnection {

    public Room_Queries() {
        super();
    }

    public ResultSet getAllRoomSchedulesInformation() {
        try {
            sqlStatement = sqlConnection.createStatement();
            query = "SELECT ScheduleID,Room,Subject,[Section],Teacher,DayOfTheWeek,FORMAT(CAST(StartTime AS datetime),'hh:mm tt')'StartTime',FORMAT(CAST(EndTime AS datetime),'hh:mm tt') 'EndTime' FROM TeacherSchedules";
            rs = sqlStatement.executeQuery(query);
            return rs;
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, sqlex.toString(), "SQL Query Error!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
      public ResultSet getRoomScheduleInformation(int ScheduleID){
        try {
            sqlStatement = sqlConnection.createStatement();
            query = "SELECT ScheduleID,Room,Subject,[Section],Teacher,DayOfTheWeek,FORMAT(CAST(StartTime AS datetime),'hh:mm tt')'StartTime',FORMAT(CAST(EndTime AS datetime),'hh:mm tt') 'EndTime' FROM TeacherSchedules WHERE ScheduleID ="+ScheduleID+"";
            rs = sqlStatement.executeQuery(query);
            return rs;
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null,sqlex.toString(),"SQL Query Error!",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void insertRoomScheduleInformation(String room, String subject, String section, String teacher, String dayOfTheWeek, String startTime, String endTime) {
        try {
            query = "INSERT INTO TeacherSchedules (Room,Subject,[Section],Teacher,DayOfTheWeek,StartTime,EndTime) "
                    + "VALUES ('" + room + "','" + subject + "','" + section + "','" + teacher + "','" + dayOfTheWeek + "','" + startTime + "','" + endTime + "')";
            sqlPreparedStatement = sqlConnection.prepareStatement(query);
            sqlPreparedStatement.executeUpdate();
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, sqlex.toString(), "SQL Query Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
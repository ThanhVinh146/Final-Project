import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import entity.home;
public class homeService {
	public List<home> getAllCourse() throws SQLException {
	Connection connection=Dbconnection.makeConnection();
    String SQL="SELECT * FROM room";

    Statement stmt= connection.createStatement();

    ResultSet resultSet=stmt.executeQuery(SQL);

    List<home> list=new ArrayList<home>();

    while (resultSet.next()){
        int id=resultSet.getInt("id");
        String name=resultSet.getString("home_type");
        String roomType=resultSet.getString("room_type");
        int occupancy=resultSet.getInt("total_occupancy");
        
        home home=new home(id,name,roomType,occupancy);
        list.add(home);}
    return list;
}}

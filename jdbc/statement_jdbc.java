import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDBJdbc {
    static final String DATABASE_URL = "jdbc:mysql://localhost:3308/";
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    static final String USER = "root";
    static final String PASSWORD = "123";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String PSQL = "String sql = "update developers set name=? , specialty=? where salary =?";
        try (Connection connection =DriverManager.getConnection(DATABASE_URL, USER, PASSWORD), 
            Statement statement = connection.createStatement(),
            PreparedStatement preparedStatement =connection.prepareStatement(PSQL)){
            System.out.println("Registering JDBC driver...");
            Class.forName(JDBC_DRIVER);
             
            //Создание базы данных.
            String SQL = "CREATE DATABASE JDBC_DB";
            statement.executeUpdate(SQL);
            System.out.println("Database successfully created...");
            
            //Создание таблицы.
            SQL = "CREATE TABLE developers " +
                    "(id INTEGER not NULL, " +
                    " name VARCHAR(50), " +
                    " specialty VARCHAR (50), " +
                    " salary INTEGER not NULL, " +
                    " PRIMARY KEY (id))";
            statement.executeUpdate(SQL);
            /*
            ||----------------------------------------------------------------------||
            ||    id        |      name       |      specialty     |    salary      ||
            ||----------------------------------------------------------------------||
            ||              |                 |                    |                ||
            ||----------------------------------------------------------------------||
            ||              |                 |                    |                ||
            ||----------------------------------------------------------------------||
            */

            //Запись данных в таблицу.
            SQL = " INSERT INTO developers (name, specialty, salary) VALUES (shegda, java-developer,2000)";
            statement.executeUpdate(SQL);
                        /*
            ||----------------------------------------------------------------------||
            ||    id        |      name       |      specialty     |    salary      ||
            ||----------------------------------------------------------------------||
            ||      1       |       shegda    |    java-developer  |    2000        ||
            ||----------------------------------------------------------------------||
            ||              |                 |                    |                ||
            ||----------------------------------------------------------------------||
            */
            
            //Получение данных из таблицы.
            String SQL = "SELECT * FROM developers";
            ResultSet resultSet = statement.executeQuery(SQL);
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String  name = resultSet.getString(2);
                String  specialty = resultSet.getString(3);
                int salary = resultSet.getInt(4);
                System.out.println("id: " + id);
                System.out.println("Name: " + name);
                System.out.println("Specialty: " + specialty);
                System.out.println("Salary: " + salary);
                System.out.println("===================\n");
            }
     
            // Обновление\ изменение данных таблицы (строк)
            SQL = "update developers set salary=2500 where name='shegda'";
            nt rowsAffected  = statement.executeUpdate(SQL); 
            
            // удаление данных таблицы (строк)
            SQL= "delete from developers where name='shegda'";
            int rowsAffected    = statement.executeUpdate(sql);
            
            //Batch Updates (акамулирование запросов и их груповое выполнение)
            statement.addBatch("update developers set name='John' where id=123");
            statement.addBatch("update developers set name='Eric' where id=456");
            statement.addBatch("update developers set name='May'  where id=789");
            int[] recordsAffected = statement.executeBatch();
                
            //Batch Updates через PreparedStatement
            preparedStatement.setString(1, "dagar");
            preparedStatement.setString(2, "java-developer");
            preparedStatement.setInt  (3, 1500);
            preparedStatement.addBatch();
            
            preparedStatement.setString(1, "Stan");
            preparedStatement.setString(2, "java-developer");
            preparedStatement.setLong  (3, 4000);
            preparedStatement.addBatch();
            
            int[] affectedRecords = preparedStatement.executeBatch();
            
            //Удаление таблицы.
            SQL = "DROP TABLE developers";
            statement.executeUpdate(SQL);
            
            //Удаление базы данных.
            SQL = "DROP DATABASE PROSELYTE_JDBC_DB";
            statement.executeUpdate(SQL);
            
        }
    }
}

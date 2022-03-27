package ToDoApp.Controllers;

import ToDoApp.Models.Task;
import ToDoApp.Util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Diego Costa
 */
public class TaskController {
    
    public void save(Task task){
        
    }
    
    public void update(Task task){
        
    }
    
    public void removeById(int taskId) throws SQLException{
        
        String sql = "DELETE FORM tasks WHERE id = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, taskId);
            statement.execute();
            
        }catch(SQLException ex){
            throw new SQLException ("Erro ao deletar a tarefa");
        }finally{
            ConnectionFactory.closeConnection(connection);            
        }
    }
    
    public List<Task> getAll(int idProject){
        
        return null;
        
    }
}

package tudor.practice;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface Mapper {
    

    @Select("SELECT * FROM AGENTS")
    public List<Agent> getAgents();
        
    
}

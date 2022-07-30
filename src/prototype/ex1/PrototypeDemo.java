package prototype.ex1;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        String sql = "select * from movies where title = ?";
        List<String> params = new ArrayList<>();
        params.add("star wars");
        Record record = new Record();

        StatementShallowClone statement = new StatementShallowClone(sql, params, record);
        System.out.println(statement);

        StatementShallowClone shallowCone = statement.clone();
        // you will see the addresses of two records are the same, which means it is a shallow copy with referencing the same array list.
        // shallow copy is kinda dangerous copy.
        System.out.println(shallowCone);
    }

}

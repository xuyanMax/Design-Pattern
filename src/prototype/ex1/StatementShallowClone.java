package prototype.ex1;

import java.io.Serializable;
import java.util.List;

public class StatementShallowClone implements Cloneable, Serializable {

    private String sql;
    private List<String> params;
    private Record record;

    public StatementShallowClone (String sql, List<String> params, Record record) {
        this.sql = sql;
        this.params = params;
        this.record = record;
    }

    @Override
    protected StatementShallowClone clone() throws CloneNotSupportedException {
        return (StatementShallowClone) super.clone();
    }

    public String getSql() {
        return sql;
    }

    public List<String> getParams() {
        return params;
    }

    public Record getRecord() {
        return record;
    }

    @Override
    public String toString() {
        return "StatementShallowClone{" +
                "sql='" + sql + '\'' +
                ", params=" + params +
                ", record=" + record +
                '}';
    }
}

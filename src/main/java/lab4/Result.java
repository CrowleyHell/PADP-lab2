package lab4;

import java.util.Map;

public class Result {
    private String id;
    private Map<String, String> result;

    public Result(String id, Map<String, String> result) {
        this.id = id;
        this.result = result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, String> getResult() {
        return result;
    }
}

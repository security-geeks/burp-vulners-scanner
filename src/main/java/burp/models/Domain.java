package burp.models;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Domain {

    private String name;
    private Map<String, Software> software;
    private Map<String, Set<Vulnerability>> paths;

    public Domain() {
        paths = new HashMap<>();
        software = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public Map<String, Software> getSoftware() {
        return software;
    }

    public Map<String, Set<Vulnerability>> getPaths() {
        return paths;
    }

    public void setSoftware(Map<String, Software> software) {
        this.software = software;
    }

    public void setPaths(Map<String, Set<Vulnerability>> paths) {
        this.paths = paths;
    }
}

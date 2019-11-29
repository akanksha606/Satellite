package android.example.satellite;

public class Project {
  private String projectName,ideatorName,time;

    public Project(String projectName, String ideatorName, String time) {
        this.projectName = projectName;
        this.ideatorName = ideatorName;
        this.time = time;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getIdeatorName() {
        return ideatorName;
    }

    public String getTime() {
        return time;
    }
}

package co.com.sofka.models;

public class PostUserModel {
    private String name;
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PostUserModel{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}

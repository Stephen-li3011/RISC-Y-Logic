package entity;

import java.util.List;
import java.util.UUID;

public class User {
    private final UUID id;
    private final String name;
    private final String email;
    private final String academicProgram;
    private final List<String> careerGoals;

    public User(UUID id, String name, String email, String academicProgram, List<String> careerGoals) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.academicProgram = academicProgram;
        this.careerGoals = careerGoals;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAcademicProgram() {
        return academicProgram;
    }

    public List<String> getCareerGoals() {
        return careerGoals;
    }

}

package healthy.healthy.model;

import java.util.UUID;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private UUID id;

    @NonNull
    private String name;

    @NonNull
    private Integer age;

    @NonNull
    private String gender;

    @NonNull
    private String healthCondition;

    private String diagnosis;

    // Field for blood test report
    @Lob
    private byte[] bloodTestReport;

    public User() {
    }

    public User(String name, int age, String gender, String healthCondition, String diagnosis, byte[] bloodTestReport) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.healthCondition = healthCondition;
        this.diagnosis = diagnosis;
        this.bloodTestReport = bloodTestReport;
    }

    // Getters and setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(String healthCondition) {
        this.healthCondition = healthCondition;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public byte[] getBloodTestReport() {
        return bloodTestReport;
    }

    public void setBloodTestReport(byte[] bloodTestReport) {
        this.bloodTestReport = bloodTestReport;
    }
}


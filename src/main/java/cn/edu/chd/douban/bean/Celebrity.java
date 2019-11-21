package cn.edu.chd.douban.bean;

public class Celebrity {

    private Long celebrityId;
    private String name;
    private String gender;
    private String constellation;
    private String birthday;
    private String dateOfDeath;
    private String birthplace;
    private String job;
    private String otherForeignNames;
    private String otherChineseNames;
    private String families;
    private String humanSrc;

    @Override
    public String toString() {
        return "Celebrity{" +
                "celebrityId=" + celebrityId +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", constellation='" + constellation + '\'' +
                ", birthday='" + birthday + '\'' +
                ", dateOfDeath='" + dateOfDeath + '\'' +
                ", birthplace='" + birthplace + '\'' +
                ", job='" + job + '\'' +
                ", otherForeignNames='" + otherForeignNames + '\'' +
                ", otherChineseNames='" + otherChineseNames + '\'' +
                ", families='" + families + '\'' +
                ", humanSrc='" + humanSrc + '\'' +
                '}';
    }

    public Long getCelebrityId() {
        return celebrityId;
    }

    public void setCelebrityId(Long celebrityId) {
        this.celebrityId = celebrityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(String dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getOtherForeignNames() {
        return otherForeignNames;
    }

    public void setOtherForeignNames(String otherForeignNames) {
        this.otherForeignNames = otherForeignNames;
    }

    public String getOtherChineseNames() {
        return otherChineseNames;
    }

    public void setOtherChineseNames(String otherChineseNames) {
        this.otherChineseNames = otherChineseNames;
    }

    public String getFamilies() {
        return families;
    }

    public void setFamilies(String families) {
        this.families = families;
    }

    public String getHumanSrc() {
        return humanSrc;
    }

    public void setHumanSrc(String humanSrc) {
        this.humanSrc = humanSrc;
    }
}

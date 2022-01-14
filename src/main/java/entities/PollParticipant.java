package entities;

public class PollParticipant {
    String name;
    String surname;
    String age;
    String profession;
    String usePublicTransport;
    String perWeek;
    String transportType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getUsePublicTransport() {
        return usePublicTransport;
    }

    public void setUsePublicTransport(String usePublicTransport) {
        this.usePublicTransport = usePublicTransport;
    }

    public String getPerWeek() {
        return perWeek;
    }

    public void setPerWeek(String perWeek) {
        this.perWeek = perWeek;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public PollParticipant(String name, String surname, String age, String profession, String usePublicTransport,
                           String perWeek, String transportType) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.profession = profession;
        this.usePublicTransport = usePublicTransport;
        this.perWeek = perWeek;
        this.transportType = transportType;
    }

    @Override
    public String toString() {
        return "PollParticipant{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                ", profession='" + profession + '\'' +
                ", usePublicTransport='" + usePublicTransport + '\'' +
                ", perWeek='" + perWeek + '\'' +
                ", transportType='" + transportType + '\'' +
                '}';
    }
}

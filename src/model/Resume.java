package model;


import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Resume implements Comparable<Resume> {
    //unique identifier
    private String uuid;
    //see you later!
    //private String fullName;
    private String fullname;

    Map<SectionType, Section> sections = new EnumMap<SectionType, Section>(SectionType.class);

    public void addSection(SectionType type, Section section) {
        sections.put(type , section);
    }

    public void getSection(SectionType type) {
        sections.get(type);
    }


    //must add empty constructor
    public Resume() {
    }

    public Resume(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }

    @Override
    public String toString() {
        return uuid;
    }

    //bad idea!!!
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }


    public int compareTo(Resume o) {
        return this.uuid.compareTo(o.getUuid());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resume resume = (Resume) o;
        return Objects.equals(fullname, resume.fullname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullname);
    }
}

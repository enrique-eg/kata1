package software.ulpgc.kata1;

import java.time.LocalDate;
import java.time.Period;

public class person {
    private final String name;
    private final LocalDate birthday;

    public person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(birthday, now);
        return period.getYears();
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}

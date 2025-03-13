package model;

import java.time.LocalDate;

/**
 * Класс, представляющий человека с информацией о его ID, имени, гендере,
 * департаменте, зарплате и дате рождения.
 */
public class Human {
    private int ID;
    private String name;
    private String gender;
    private Department department;
    private double salary;
    private LocalDate birthDate;

    /**
     * Конструктор, инициализирующий объект Human с заданными параметрами.
     *
     * @param ID уникальный идентификатор человека
     * @param name имя человека
     * @param gender пол человека
     * @param department департамент, к которому относится человек
     * @param salary зарплата человека
     * @param birthDate дата рождения человека
     */
    public Human(int ID, String name, String gender, Department department, double salary, LocalDate birthDate) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    /**
     * Возвращает уникальный идентификатор человека.
     *
     * @return уникальный ID человека
     */
    public int getID() {
        return ID;
    }

    /**
     * Возвращает имя человека.
     *
     * @return имя человека
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает пол человека.
     *
     * @return пол человека
     */
    public String getGender() {
        return gender;
    }

    /**
     * Возвращает департамент, к которому относится человек.
     *
     * @return департамент человека
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * Возвращает зарплату человека.
     *
     * @return зарплата человека
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Возвращает дату рождения человека.
     *
     * @return дата рождения человека
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /**
     * Возвращает строковое представление объекта Human в формате:
     * Humen{ID=..., name='...', gender='...', department=..., salary=..., birthDate=...}.
     *
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return "Humen{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", birthDate=" + birthDate +
                '}';
    }
}

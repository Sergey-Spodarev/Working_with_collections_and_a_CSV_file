package model;

/**
 * Класс, представляющий департамент и хранящий информацию о нём,
 * включая уникальный идентификатор (ID) и название.
 * Уникальный ID автоматически генерируется при создании объекта.
 */
public class Department {
    private final int ID;
    private String name;
    private static int nextID = 1;

    /**
     * Конструктор, инициализирующий департамент с заданным названием и генерирующий уникальный ID.
     *
     * @param name название департамента
     */
    public Department(String name) {
        this.name = name;
        this.ID = nextID;
        nextID++;
    }

    /**
     * Возвращает уникальный идентификатор департамента.
     *
     * @return уникальный ID департамента
     */
    public int getID() {
        return ID;
    }

    /**
     * Возвращает название департамента.
     *
     * @return название департамента
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает строковое представление объекта Department в формате:
     * Department{ID=..., name='...'}.
     *
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return "Department{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}

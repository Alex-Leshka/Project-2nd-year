package Univercity;

/**
 * Класс, представляющий студента.
 */
public class Student {
    // Поля класса (инкапсуляция: доступ только через методы)
    private String name;
    private int age;
    private double averageGrade;
    private String university; // Дополнительное свойство (Bonus)

    // --- Конструктор ---
    public Student(String name, int age, double averageGrade, String university) {
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
        this.university = university;
    }

    // --- Методы Геттеры (Getters) ---
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public String getUniversity() {
        return university;
    }

    // --- Методы Сеттеры (Setters) с валидацией ---
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Ошибка: Имя не может быть пустым.");
        }
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Ошибка: Возраст должен быть положительным числом.");
        }
    }

    public void setAverageGrade(double averageGrade) {
        if (averageGrade >= 0 && averageGrade <= 10) {
            this.averageGrade = averageGrade;
        } else {
            System.out.println("Ошибка: Средний балл должен быть от 0 до 10.");
        }
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    // --- Основные методы по заданию ---

    /**
     * Выводит полную информацию о студенте.
     */
    public void displayInfo() {
        System.out.println("------------------------------------");
        System.out.println("Студент: " + name);
        System.out.println("Возраст: " + age + " лет");
        System.out.println("Университет: " + university);
        System.out.printf("Средний балл: %.2f\n", averageGrade);
        System.out.println("Оценка успеваемости: " + getGradeDescription());
        System.out.println("------------------------------------");
    }

    /**
     * Возвращает текстовое описание оценки на основе балла.
     */
    public String getGradeDescription() {
        if (averageGrade >= 8.5) {
            return "Отлично";
        } else if (averageGrade >= 7.0) {
            return "Хорошо";
        } else if (averageGrade >= 5.0) {
            return "Удовлетворительно";
        } else {
            return "Неудовлетворительно";
        }
    }

    // --- Дополнительные методы (Bonus) ---

    /**
     * Метод для симуляции дня рождения (увеличение возраста).
     */
    public void celebrateBirthday() {
        this.age++;
        System.out.println("С днем рождения, " + name + "! Теперь вам " + age + ".");
    }

    /**
     * Метод для быстрой смены учебного заведения.
     */
    public void transferTo(String newUniversity) {
        System.out.println(name + " переводится из " + university + " в " + newUniversity);
        this.university = newUniversity;
    }
}

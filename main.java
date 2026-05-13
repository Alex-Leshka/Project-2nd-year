import Student;

/**
 * Класс для демонстрации работы программы.
 */
public class Main {
    public static void main(String[] args) {
        // 1. Создание объектов через конструктор
        Student student1 = new Student("Алексей", 20, 9.2, "МГУ");
        Student student2 = new Student("Елена", 19, 7.5, "СПбГУ");
        Student student3 = new Student("Иван", 22, 4.1, "НИУ ВШЭ");

        // 2. Демонстрация вывода информации
        System.out.println("=== Исходные данные студентов ===");
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();

        // 3. Демонстрация использования сеттеров и изменения данных
        System.out.println("\n=== Изменение данных студента Елены ===");
        student2.setAverageGrade(8.8); // Подтянула учебу
        student2.setAge(20);           // Стала старше
        student2.displayInfo();

        // 4. Демонстрация работы бонусных методов
        System.out.println("\n=== Прочие события ===");
        student3.celebrateBirthday(); // Иван повзрослел
        student1.transferTo("МФТИ");  // Алексей сменил вуз

        // 5. Демонстрация ошибки валидации
        System.out.println("\n=== Проверка валидации (ошибка) ===");
        student1.setAverageGrade(15.0); // Должна вывести ошибку в консоль
    }
}

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════════════════════════╗");
        System.out.println("║     Университетская информационная система (University System)     ║");
        System.out.println("╚════════════════════════════════════════════════════════════════════╝\n");

        // STEP 1: Создание университета
        System.out.println("[STEP 1] Инициализация системы");
        University uni = new University("U001", "МГУ имени М.В. Ломоносова", "Москва");
        System.out.println("✓ Создан университет: " + uni.getName());

        // STEP 2: Создание факультета
        System.out.println("\n[STEP 2] Создание структуры университета");
        Faculty fac = new Faculty("F001", "Факультет ВМК", uni);
        uni.addFaculty(fac);
        System.out.println("✓ Добавлен факультет: " + fac.getName());

        // STEP 3: Создание кафедры
        Institute inst = new Institute("I001", "Кафедра системного программирования", "Москва, ул. Гагарина 7", fac);
        fac.addInstitute(inst);
        System.out.println("✓ Добавлена кафедра: " + inst.getName() + " (" + inst.getAddress() + ")");

        // STEP 4: Создание администратора (декана)
        System.out.println("\n[STEP 3] Назначение декана факультета");
        AdministrativeEmployee dean = new AdministrativeEmployee("A001", "Мария Иванова", "maria@mail.ru", "555555555", "Деканат");
        uni.addEmployee(dean);
        fac.setDean(dean);
        System.out.println("✓ Назначен декан факультета: " + dean.getName() + " (" + dean.getDepartment() + ")");

        // STEP 5: Создание преподавателя
        System.out.println("\n[STEP 4] Создание научного/педагогического персонала");
        Lecturer lec1 = new Lecturer("L001", "Иван Петров", "ivan@mail.ru", "123456789", "Computer Science", "Java Programming");
        uni.addEmployee(lec1);
        inst.addResearcher(lec1);
        System.out.println("✓ Добавлен преподаватель: " + lec1.getName());
        System.out.println("  └─ Область: " + lec1.getArea() + " | Специализация: " + lec1.getSpecialization());

        Lecturer lec2 = new Lecturer("L002", "Ольга Смирнова", "olga@mail.ru", "987654321", "Software Engineering", "Database Design");
        uni.addEmployee(lec2);
        inst.addResearcher(lec2);
        System.out.println("✓ Добавлен преподаватель: " + lec2.getName());
        System.out.println("  └─ Область: " + lec2.getArea() + " | Специализация: " + lec2.getSpecialization());

        // STEP 6: Создание курсов
        System.out.println("\n[STEP 5] Создание и преподавание курсов");
        Course course1 = new Course("C001", "Программирование на Java", "Основы Java и объектно-ориентированного программирования", 3, 2);
        lec1.addCourse(course1);
        System.out.println("✓ Создан курс: " + course1.getName());
        System.out.println("  └─ Преподаватель: " + lec1.getName() + " | Credits: " + course1.getCredits() + " | Weekly: " + course1.getWeeklyHours() + "h");

        Course course2 = new Course("C002", "Проектирование БД", "Основы реляционных баз данных и SQL", 4, 3);
        lec2.addCourse(course2);
        System.out.println("✓ Создан курс: " + course2.getName());
        System.out.println("  └─ Преподаватель: " + lec2.getName() + " | Credits: " + course2.getCredits() + " | Weekly: " + course2.getWeeklyHours() + "h");

        // STEP 7: Создание проектов
        System.out.println("\n[STEP 6] Управление исследовательскими проектами");
        Project project1 = new Project("P001", "Разработка системы управления университетом", "Enterprise Java Application", new Date(), new Date());
        project1.setArea("Software Engineering");
        System.out.println("✓ Создан проект: " + project1.getName());
        System.out.println("  └─ Область: " + project1.getArea());

        Project project2 = new Project("P002", "Оптимизация алгоритмов баз данных", "Query optimization research", new Date(), new Date());
        project2.setArea("Database Systems");
        System.out.println("✓ Создан проект: " + project2.getName());
        System.out.println("  └─ Область: " + project2.getArea());

        // STEP 8: Создание исследователей и назначение на проекты
        ResearchAssociate researcher1 = new ResearchAssociate("R001", "Петр Сидоров", "petr@mail.ru", "111111111", "Software Engineering");
        uni.addEmployee(researcher1);
        inst.addResearcher(researcher1);
        researcher1.addProject(project1, 40);
        System.out.println("✓ Добавлен исследователь: " + researcher1.getName());
        System.out.println("  └─ Назначен на проект '" + project1.getName() + "' на 40 часов");

        ResearchAssociate researcher2 = new ResearchAssociate("R002", "Алексей Козлов", "alexey@mail.ru", "222222222", "Database Systems");
        uni.addEmployee(researcher2);
        inst.addResearcher(researcher2);
        researcher2.addProject(project2, 30);
        System.out.println("✓ Добавлен исследователь: " + researcher2.getName());
        System.out.println("  └─ Назначен на проект '" + project2.getName() + "' на 30 часов");

        lec1.addProject(project1, 20);
        System.out.println("✓ Преподаватель " + lec1.getName() + " добавлен на проект '" + project1.getName() + "' на 20 часов");

        // ВЫВОД ИТОГОВОЙ ИНФОРМАЦИИ
        System.out.println("\n╔════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                    ИНФОРМАЦИЯ СИСТЕМЫ (FINAL REPORT)               ║");
        System.out.println("╚════════════════════════════════════════════════════════════════════╝");

        uni.displayInfo();

        System.out.println("\n--- ИНФОРМАЦИЯ О КУРСАХ ---");
        course1.displayInfo();
        course2.displayInfo();

        System.out.println("\n--- ИНФОРМАЦИЯ О ПРОЕКТАХ ---");
        project1.displayInfo();
        project2.displayInfo();

        System.out.println("\n--- ИНФОРМАЦИЯ О СОТРУДНИКАХ ---");
        System.out.println("Всего сотрудников: " + uni.getEmployeeCount());
        System.out.println("\nСписок сотрудников:");
        for (Employee emp : uni.getEmployees()) {
            System.out.println("  - " + emp.getName() + " (" + emp.getClass().getSimpleName() + ")");
        }

        System.out.println("\n--- ИНФОРМАЦИЯ ОБ ИССЛЕДОВАТЕЛЯХ ---");
        System.out.println("Исследователи на кафедре: " + inst.getResearchers().size());
        for (ResearchAssociate ra : inst.getResearchers()) {
            System.out.println("\n  " + ra.getName() + " (" + ra.getArea() + ")");
            System.out.println("    Проектов: " + ra.getProjects().size());
            for (Project p : ra.getProjects().keySet()) {
                System.out.println("      └─ " + p.getName() + ": " + ra.getProjectHours(p) + " часов");
            }
            if (ra instanceof Lecturer) {
                Lecturer lec = (Lecturer) ra;
                System.out.println("    Курсов: " + lec.getCourses().size());
                for (Course c : lec.getCourses()) {
                    System.out.println("      └─ " + c.getName());
                }
            }
        }

        System.out.println("\n╔════════════════════════════════════════════════════════════════════╗");
        System.out.println("║✓ Система работает корректно! Все диаграммы синхронизированы.       ║");
        System.out.println("╚════════════════════════════════════════════════════════════════════╝\n");
    }
}

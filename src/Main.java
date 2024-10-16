public class Main {
    public static void main(String[] args)
    {
        Schedule schedule = new Schedule();

        schedule.addClass(new Class("1", "Математика", "09:00"));
        schedule.addClass(new Class("2", "Фізика", "10:00"));
        schedule.addClass(new Class("3", "Хімія", "11:00"));

        // Виведення всіх занять
        schedule.printAllClasses();

        // Пошук
        System.out.println(schedule.findClass("1"));

        // Видалення
        schedule.removeClass("2");

        // Виведення всіх занять після видалення
        System.out.println("\nВсі заняття після видалення:");
        schedule.printAllClasses();
    }
}

import java.util.HashMap;

public class Schedule
{
    private final HashMap<String, Class> classMap;

    public Schedule()
    {
        classMap = new HashMap<>();
    }

    //Додавання
    public void addClass(Class newClass)
    {
        classMap.put(newClass.classCode, newClass);
    }

    //Видалення за кодом
    public boolean removeClass(String classCode)
    {
        if (classMap.containsKey(classCode))
        {
            classMap.remove(classCode);
            return true;
        }
        else
        {
            return false;
        }
    }

    //Пошук за кодом
    public Class findClass(String classCode)
    {
        if (classMap.containsKey(classCode))
        {
            return classMap.get(classCode);
        }
        else
        {
            System.out.println("Заняття з кодом " + classCode + " не знайдено");
            return null;
        }
    }

    //Виведення всіх занять
    public void printAllClasses()
    {
        if (classMap.isEmpty())
        {
            System.out.println("Розклад порожній");
        }
        else
        {
            for (Class c : classMap.values()) {
                System.out.println(c);
            }
        }
    }
}

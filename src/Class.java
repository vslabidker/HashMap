public class Class {
    public String classCode;
    public String subjectName;
    public String time;

    public Class(final String classCode, final String subjectName, final String time)
    {
        this.classCode = classCode;
        this.subjectName = subjectName;
        this.time = time;
    }

    @Override
    public String toString()
    {
        return "Код заняття: " + classCode + ", Предмет: " + subjectName + ", Час: " + time;
    }
}

public final class Class {
    public String classCode;
    public String subjectName;
    public String time;

    public Class(String classCode, String subjectName, String time)
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

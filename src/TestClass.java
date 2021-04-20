public class TestClass {
    public static void main(String[] args) {

        OnlineCourse onlineCourse = new OnlineCourse("JAVA-ONLINE-123", 5000, "Javastart",
                30, 60 );

        onlineCourse.setDescription("Kurs wieczorowy online przeznaczony jest dla osób pracujących, które chciałyby" +
                " zacząć swoją przygodę z programowaniem");

        onlineCourse.printInfo();
    }
}





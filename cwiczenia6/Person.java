import java.util.Calendar;

public abstract class Person {
    String firstName;
    String lastName;
    int birthdayYear;

public Person(String firstName, String lastName, int birthdayYear){
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthdayYear = birthdayYear;
}
public int getAge(){
    int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    return currentYear-birthdayYear;
}
}

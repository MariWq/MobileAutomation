import org.junit.jupiter.api.Test;

public class MainClassTest extends MainClass{

    @Test
    public void testGetLocalNumber(){

        if (getLocalNumber() == 14) {
            System.out.println("number is 14");
        }else{
            System.out.println("number is not equal to 14");
        }
    }

    @Test
    public void testGetClassNumber(){
        if (getClassNumber() >= 45 ){
            System.out.println("class_number more than 45");
        }else{
            System.out.println("class_number no more than 45");
        }
    }

    @Test
    public void testGetClassString(){
        if (getClassString().contains("hello") || getClassString().contains("Hello")){
            System.out.println("String class_string is right");
        }else{
            System.out.println("String class_string is't right");
        }
    }
}

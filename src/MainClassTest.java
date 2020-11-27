import org.junit.jupiter.api.Test;

public class MainClassTest extends MainClass{

    @Test
    public void testGetLocalNumber(){

        assert getLocalNumber() == 14 : "number isn't equal 14";;
    }

    @Test
    public void testGetClassNumber(){

        assert getClassNumber() >= 45 : "number isn't more 45";
    }

    @Test
    public void testGetClassString(){

        assert (getClassString().contains("hello") || getClassString().contains("Hello")) : "string isn't have word Hello";;
    }
}

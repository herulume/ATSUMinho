package org.sonar.samples.java.checks;
import org.junit.Test;

public class MyCustomCheckTest {

    @Test
    public void test(){
        JavaCheckVerifier.verify("src/test/files/MyFirstCustomCheck.java", new MyFirstCustomCheck());
    }
}

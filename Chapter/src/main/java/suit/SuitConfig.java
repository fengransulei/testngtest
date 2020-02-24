package suit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class SuitConfig {
    @BeforeSuite
    public  void  Beforesuit(){
        System.out.println("beforesuit运行了");
    }
    @AfterSuite
    public  void Aftersuit(){
        System.out.println("aftersuit结束了");
    }
}

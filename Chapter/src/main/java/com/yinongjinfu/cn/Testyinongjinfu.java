package com.yinongjinfu.cn;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testyinongjinfu {
  @Test
  public  void  Test1(){
    System.out.println("测试用例1");

  }
  @Test
  public void  Test2() {
    System.out.println("测试用例2");
  }
    @BeforeClass
   public void BeforeClass(){
      System.out.println("测试用例执行之前");
    }

    @AfterTest
  public  void AfterClass(){
      System.out.println("测试用例执行之后");
    }
    @BeforeSuite
public void BeforeSuit(){
      System.out.println("不知道怎么弄");




    }





}





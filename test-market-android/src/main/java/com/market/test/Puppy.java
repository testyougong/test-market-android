package com.market.test;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by zhouxin on 17/4/19.
 */
public class Puppy {
    int puppyAge;
    double i =127.00;
    String s1 = String.format("%.2f", i);
    int b = (int)i;
    int a = 3;


    public Puppy(String name){
        // 这个构造器仅有一个参数：name
        System.out.println("小狗的名字是 : " + name );
        System.out.println(i);
        System.out.println(s1);
        System.out.println(b);
    }

    public void setAge( int age ){
        puppyAge = age;
    }

    public int getAge( ){
        System.out.println("小狗的年龄为 : " + puppyAge );
        return puppyAge;
    }

    public static void main(String []args){
      /* 创建对象 */
        Puppy myPuppy = new Puppy( "tommy" );
      /* 通过方法来设定age */
        myPuppy.setAge( 2 );
      /* 调用另一个方法获取age */
        myPuppy.getAge( );
      /*你也可以像下面这样访问成员变量 */
        System.out.println("变量值 : " + myPuppy.puppyAge );
        String s[][] = new String[3][];
        s[0] = new String[2];
        s[1] = new String[4];
        s[2] = new String[4];
        s[0][0] = new String("Good");
        s[0][1] = new String("Luck");
        s[1][0] = new String("to");
        s[1][1] = new String("you");
        s[1][2] = new String("!");
        s[1][3] = new String("!");
        s[2][3] = new String("!!");
        System.out.println(s[2][3]);

        Date date = new Date();
        System.out.println(date);
        System.out.println(System.currentTimeMillis( ));

        String[] d = {"1","2","3"};
        String e[] = {"1","2","3"};
        System.out.println(Arrays.toString(d));
        for(int i = 0;i<d.length;i++){
            System.out.print(d[i]);
            System.out.print(",");
        }
        for(int i = 0;i<e.length;i++){
            System.out.print(e[i]);
            System.out.print(",");
        }
    }
}

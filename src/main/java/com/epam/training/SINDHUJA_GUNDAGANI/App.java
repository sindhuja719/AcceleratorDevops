package com.epam.training.SINDHUJA_GUNDAGANI;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String greetings(String name)
    {
        return "Hello, "+name+" welcome this is the sample project";
    }
    public static String user(String name)
    {
        return name+"!";
    }
    public static void main( String[] args )
    {
        System.out.println( greetings("Learner") );
        System.out.println(user("Devops Learner"));
    }
}

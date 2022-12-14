import java.util.Scanner;
import java.lang.Math;
//import java.lang.invoke.ClassSpecializer.Factory;

//import javax.lang.model.util.SimpleAnnotationValueVisitor6;
//import javax.sound.sampled.SourceDataLine;


/**
 * Document this class
 * @version 10.03.2022
 * @author 25pandey
 * MY EXTRA IS METHOD circleArea()
 */
public class SingleIOMath{
    private String name;
    private int age;
    private int favNumber;

    /**
     * Document
     */
    public void promptUser(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter your name: ");
        name=in.nextLine();
        System.out.print("Enter your age: ");
        age=in.nextInt();
    
        System.out.print("Enter your favorite number: ");
        favNumber=in.nextInt();
        in.close();
    }

    /**
     * Print the name and age
     */
    public void printInfo(){
        System.out.println("Your name is: "+ name);
        System.out.println("Your age is: "+ age);
        System.out.println("At your next birthday, you will turn "+(age+1));
        System.out.println("The first prime factor of "+age+" is "+leastFactor(age));
        System.out.println("Favorite number: "+ favNumber);
        System.out.println("Your favorite number squared is  "+favNumber*favNumber);
        System.out.println("Wow your young! You have about "+(73-age)+" years left to live. Thats a lot of time!");
        System.out.println("If you favorite number was the radius of a circle, the circle would have an area of "+circleArea(favNumber));
        System.out.println("*End of Program*");
    }

    private static boolean isPrime(int num){
        for(int i=2; i<=(int)Math.sqrt(num)+1; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    /**
     * Find the least prime factor of a number
     * @param num
     * @return
     */
    public static int leastFactor(int num){
        /*
        if(isPrime(num)==true){
            return -1;
        }
        */

            for(int i=2; i<=Math.sqrt(num); i++){
                if(isPrime(i)==true){
                    if(num%i==0){
                        return i;
                    }
                }
            }
            return num;
    }

    private static double circleArea(int num){
        double area=(Math.pow(num, 2.0));
        area=area*=Math.PI;
        return area;
    }


    /**
     * Main method for class SingleIOMath
     */
    public static void main(String[] args){
        SingleIOMath app=new SingleIOMath();
        System.out.println("* Sit yourself down, take a seat *");
        System.out.println("* All you gotta do is repeat after me *");
        app.promptUser();
        System.out.println("I'm gonna teach you how to sing it out ");
        System.out.println("Come on, come on, come on ");
        System.out.println("Let me tell you what it's all about ");
        System.out.println("Reading, writing, arithmetic ");
        System.out.println("Are the branches of the learning tree");
        app.printInfo();


    }



}

package javaPrograms;

public class WriteWord {

    public static void word(int number){
    if (number<=50){
        System.out.println("COOL");
    }
    else if(number<100){
        System.out.println("AMAZING");
    }
    else if(number<=150){
        System.out.println("SUPER COOL");
    }
    else{
        System.out.println("It is not a correct Option");
    }
    }

    public static void main(String[] args) {
        word(5);
        word(60);
        word(120);
        word(170);
    }
}

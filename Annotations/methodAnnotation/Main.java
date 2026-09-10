package Annotations.methodAnnotation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        Divisions div = new Divisions();
        
        Processor processor = new Processor();

        processor.process(div, num);
        scan.close();

    }
}

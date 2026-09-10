package Annotations.methodAnnotation;

public class Divisions {

    @Evaluate
    public void div2(int num) {
        int lastDec = num % 10;

        if(lastDec % 2 == 0)
            System.out.println(num + " can be divided by 2");
        else
            System.out.println(num + " cannot be divided by 2");
    }

    @Evaluate
    public void div3(int num) {
        int sum = 0;
        int sub = num;
        while (num > 0) {
            int last = num % 10;
            sum+= last;
            num = num / 10;
        }

        if(sum % 3 == 0)
             System.out.println(sub + " can be divided by 3");
        else
             System.out.println(sub + " cannot be divided by 3");
    }
    @Evaluate
    public void div4(int num) {
        
        int lastTwo = num % 100;

        if(lastTwo % 4 == 0)
            System.out.println(num + " can be divided by 4");
        else
            System.out.println(num + " cannot be divided by 4");
    }
    @Evaluate
    public void div5(int num) {

        int last = num % 10;

        if(last == 0 || last == 5) 
            System.out.println(num + " can be divided by 5");
        else
            System.out.println(num + " cannot be divided by 5");
    }

    @Evaluate
    public void div6(int num) {
        int subNum = num;
        int last = num % 10;
        
        int sum = 0;
        while(num > 0) {
            int n = num % 10;
            sum = sum + n;
            num = num / 10;
        }


        if(last % 2 == 0 & sum % 3 == 0) 
             System.out.println(subNum + " can be divided by 6");
        else
             System.out.println(subNum + " cannot be divided by 6");
        
    }
    @Evaluate
    public void div8(int num) {
        
        int lastThree = num % 1000;

        if(lastThree % 8 == 0)
            System.out.println(num + " can be divided by 8");
        else
            System.out.println(num + " cannot be divided by 8");
    }
    @Evaluate
    public void div9(int num) {
        int sum = 0;
        int sub = num;
        while (num > 0) {
            int last = num % 10;
            sum+= last;
            num = num / 10;
        }

        if(sum % 9 == 0)
             System.out.println(sub + " can be divided by 9");
        else
             System.out.println(sub + " cannot be divided by 9");
    }
    @Evaluate
    public void div10(int num) {

        int last = num % 10;

        if(last == 0) 
            System.out.println(num + " can be divided by 10");
        else
            System.out.println(num + " cannot be divided by 10");
    }

    @Evaluate
    public void div11(int num) {
        int sum = 0;
        int subNum = num;

        int count = 1;
        while(num > 0) {
            int last = num % 10;
            if(count % 2 == 0)
                sum = sum - last;
            else
                sum = sum + last;

            count++;
            num = num / 10;
        }

        if(sum % 11 == 0)
            System.out.println(subNum + " can be divided by 11");
        else
            System.out.println(subNum + " cannot be divided by 11");
    }
}

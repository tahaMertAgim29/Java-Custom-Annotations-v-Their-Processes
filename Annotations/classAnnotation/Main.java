package Annotations.classAnnotation;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Processor processor = new Processor();

        User rudolf = new User("Rudolf Wexler", "r.wexler@example.com", 56, 3.71);
        
        User cody = new User("Cody Denver", "cdenver@example.com", 38, 3.34);
        
        User davinson = new User("Davinson Hernandez", "davinson.hernandez@example.com", 52, 3.82);
        
        User luis = new User("Luis Castro", "castro@example.com", 52, 3.8189);

        User zwayer = new User("Klaus Zwayer", "kzwayer@example.com", -2, 3.94);
        
        processor.process(rudolf);
        processor.process(cody);
        processor.process(davinson);
        processor.process(luis);
        processor.process(zwayer);

    }
}

package Annotations.fieldAnnotation;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Processor processor = new Processor();

        Character jason = new Character("Jason Voorhees", 49);

        processor.process(jason);

        Character heston = new Character("Heston Sandy", 59);

        processor.process(heston);

        Character john = new Character("John Sandy", 55);

        processor.process(john);

        Character rudolf = new Character(null, 58);

        processor.process(rudolf);

        
    }
}

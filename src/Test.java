//Test for each type of character
public class Test {
    public static void main(String[] args) {
        System.out.println("\n Test 1 ----------");
        Human human = new Human();
        human.randomize(human);
        System.out.println(human.toString());

        System.out.println("\n Test 2 ----------");
        Elf elf = new Elf();
        elf.randomize(elf);
        System.out.println(elf.toString());

        System.out.println("\n Test 3 ----------");
        Dwarf dwarf = new Dwarf();
        dwarf.randomize(dwarf);
        System.out.println(dwarf.toString());
        
    }
    
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Dwarf extends Character {

    //Creating the Random object
    private Random r = new Random();

    public void setAge(){
        //an age between 20 and 100
        this.age = 20 + r.nextInt(80);
    }

    public void setHeight(){
        //a height between 2 and 5 ft
        this.height = 24 + r.nextInt(37);
    }

    //Default constructor
    Dwarf(){

    }

    private List<String> maleNames = new ArrayList<>();
    private List<String> femaleNames = new ArrayList<>();
    private List<String> lastNames = new ArrayList<>();

    @Override
    public void setName() throws FileNotFoundException{
        String wd = System.getProperty("user.dir");
        if(gender){
            File file = new File(wd + "/src/maleNames.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine())
                maleNames.add(sc.nextLine());

            this.name = maleNames.get(r.nextInt(maleNames.size()));
            sc.close();
        } else{
            File file = new File(wd + "/src/femaleNames.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine())
                femaleNames.add(sc.nextLine());
            this.name = femaleNames.get(r.nextInt(femaleNames.size()));
            sc.close();
        }
        File file = new File(wd + "/src/fantasyNames.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine())
            lastNames.add(sc.nextLine());
        String lastName = lastNames.get(r.nextInt(lastNames.size())) + lastNames.get(r.nextInt(lastNames.size()));
        String c1 = lastName.substring(0,1).toUpperCase();
        lastName = c1 + lastName.substring(1);
        lastName = lastName.replaceAll(" ","");
        sc.close();

        this.name = this.name + " " + lastName;
        
    }

    @Override
    public String toString(){
        String genderString;
        if(gender){
            genderString = "Male";
        }else{
            genderString = "Female";
        }
        return "Dwarf: " +
            "\nName: "+name+
            "\nGender: "+ genderString+ 
            "\nAge: "+age+ " years old" +
            "\nHeight: "+height+ " inches tall" +
            "\nPersonalityType: "+personalityTypes+
            "\nAttackPower: "+attackPower+
            "\nDefensePower: "+defensePower+
            "\nSpeed: "+speed+
            "\nStamina: "+stamina+
            "\nIntelligence: "+intelligence;
    }
    
}

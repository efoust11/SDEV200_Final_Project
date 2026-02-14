import java.util.Random;

public class Elf extends Character {

    //Creating the Random object
    private Random r = new Random();

    public void setAge(){
        //an age between 100 and 1000
        this.age = 100 + r.nextInt(1000);
    }

    public void setHeight(){
        //a height between 4 and 7 ft
        this.height = 48 + r.nextInt(37);
    }

    //Default constructor
    Elf(){

    }

    @Override
    public String toString(){
        String genderString;
        if(gender){
            genderString = "Male";
        }else{
            genderString = "Female";
        }
        return "Elf: " +
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

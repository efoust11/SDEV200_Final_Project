import java.util.Random;

public class Human extends Character {

    //Creating the Random object
    private Random r = new Random();

    public void setAge(){
        //an age between 20 and 100
        this.age = 20 + r.nextInt(80);
    }

    public void setHeight(){
        //a height between 4 and 7 ft
        this.height = 48 + r.nextInt(37);
    }

    //Default constructor
    Human(){

    }

    @Override
    public String toString(){
        String genderString;
        if(gender){
            genderString = "Male";
        }else{
            genderString = "Female";
        }
        return "Human: " +
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

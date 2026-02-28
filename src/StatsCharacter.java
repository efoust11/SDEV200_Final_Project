public class StatsCharacter extends Character {
    //This character has default traits, so that only stats (speed, intelligence, etc) can be updated
    public StatsCharacter(){
        
    }

    @Override
    public void setAge() {
        this.age = 50;
    }

    @Override
    public void setHeight() {
        this.height = 60;
    }
    
}

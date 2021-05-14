public abstract class Parent{
    public String name = "default";
    public String dream;
    // mõelge kolmas välja

    public Parent(String name, String dream){
        this.name = name;
        this.dream = dream;
    }

    public void favouriteHobbyis(String hobby){
        System.out.println(this.name + " favourite hobby is " + hobby);
    }
    public void firstThingIDo(){
        System.out.println("I brush my teeth");
    }
    public abstract void howISpendMyEvenings();
    
    public void petName(String petname){
        System.out.println("My pet name is " + petname);
    }
}

// Looge uus klass, mis extendib parentit
// kasutage super keywordi, kas konstruktoris või meetodis
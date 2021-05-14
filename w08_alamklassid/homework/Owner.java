package homework;

public abstract class Owner {
    public String catName = "cat name";
    public String breed;

    public Owner(String catName, String breed){
        this.catName = catName;
        this.breed = breed;
    }

    public void startsDayWith(String startDay){
        System.out.println(this.catName + " starts her/his day with " + startDay);
    }
    public void ownerName(String ownername){
        System.out.println("Her/his owner's name is " + ownername);
    }
    public abstract void endsDayWith();

    public void dreamsAbout(){
        System.out.println("Dreams about food");
    }
}

package homework;

public class Cat extends Owner{
    public Cat(String catName, String breed) {
        super(catName, breed);
    }
    @Override
    public void endsDayWith() {
        System.out.println("He/she goes to sleep");
    }
    @Override
    public void dreamsAbout() {
        super.dreamsAbout();
        System.out.println("Dreams about playing");
    }

}


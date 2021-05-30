public class GameCharacter {
    public int x;
    public int y;

    public String name;
    private String secret = "My secret";

    private GameCharacterType gameCharacterType;

    public GameCharacter(String name, GameCharacterType gameCharacterType){
        this.x = (int) (Math.random() * 30);
        this.y = (int) (Math.random() * 30);
        this.name = name;
        this.gameCharacterType = gameCharacterType;
    }

    public String getSecret(){
        return secret;
    }

    public int[] getXY(){
        return new int[]{x, y};
    }


    public void setSecret(String secret){
        this.secret = secret;
    }

    @Override
    public String toString(){
        return "My name is " + name + " and x: " + x + " and y: " + y;
    }
}

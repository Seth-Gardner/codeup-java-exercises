import java.util.Random;
public class ServerNameGenerator {

    public static String getServerName(){
        Random random = new Random();
        String[] adjectives = {"purple", "round", "fat", "bland", "soft", "grotesque", "quaint", "zealous", "unsightly", "famous"};
        String[] nouns = {"beaver", "chair", "blanket", "shoe", "rabbit", "chicken", "cowboy", "rose", "handle", "hinge"};

        return adjectives[(int) (random.nextFloat() * 10)] + "-" + nouns[(int) (random.nextFloat() * 10)];
    };

    public static void main(String[] args) {
        System.out.println(getServerName());
    }
}

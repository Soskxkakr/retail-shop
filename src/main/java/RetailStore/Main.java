package RetailStore;
/**
 *
 * @author Reinaldo Taslim
 */
public class Main {
    public static void main(String[] args) {
        try {
            new OrderPage().setVisible(true);
            System.out.println(System.getProperty("java.class.path"));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
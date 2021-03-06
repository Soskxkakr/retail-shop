package controller;

import configs.Config;
import model.CartItem;
import model.User;
import pkg.ReadFile;
import pkg.Serializer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Reinaldo Taslim
 */
public class CustomerService extends OrderService {
    
     private Config config = new Config();
     private Map<String, ArrayList<Map<String, String>>> productData = new HashMap<>();
     private Serializer convert = new Serializer();
     private ReadFile fileReader = new ReadFile();
     private CartItem cart;
     private CartService cartService = new CartService();
     
    public CustomerService(User user) {
        super(user);
        for(;;){
            Object[] customerMenu = { "Search Item", "Order", "Checkout" };
            int customerOption = JOptionPane.showInternalOptionDialog(null, "Admin " + user.getName(), "Menu", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, customerMenu, null);
            if ( customerOption == 0 ) {
                String customerInput = JOptionPane.showInputDialog("Item Name:").toLowerCase();
                SearchProduct(customerInput);
            } 
            else if ( customerOption == 1 ) {
                for(;;){
                    super.viewProduct();
                    String customerInput = JOptionPane.showInputDialog("Enter the item name you want to buy: ").toLowerCase();
                    // customerInput == Camera
                    if ( super.addOrder(customerInput) != null ) {
                        Map<String, String> product = super.addOrder(customerInput);
                        String quantity = JOptionPane.showInputDialog("How many do you want to buy: ");
                        cart = new CartItem(product.get("ID"), product.get("Name"), quantity, product.get("Price"));
                        System.out.println("Adding Item...");
                        cartService.addCart(cart);
                        System.out.println("Item has been added");
                        System.out.println("Viewing Cart...");
                        System.out.println( cartService.viewCart() );
                        System.out.println("Thank you");
                        break;
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Sorry the item doesn't exist");
                    }
                }
            } 
            else if ( customerOption == 2){
                if ( !cartService.getCartItems().isEmpty() ) {
                    int i = JOptionPane.showInternalConfirmDialog(null, "Would you like to checkout?", "Checkout", JOptionPane.YES_NO_OPTION);
                    if ( i == 0 ) {
                        super.addOrder(cartService);
                    }
                } else if ( cartService.getCartItems().isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "Your shopping cart is empty!");
                }
            }
            else{
                break;
            }
        }
    }
    public void SearchProduct(String input){
        try {
            fileReader.clear();
            config.setConfigVar("PRODUCT_JSON_PATH");
            this.productData = convert.toMap( fileReader.getJson( getClass().getResource(config.getConfigVar()).toURI()) );
            for (String productKey : this.productData.keySet()){
                for (Map<String, String> productDetail : this.productData.get(productKey) ){
                    if (input.equals(productDetail.get("Name").toLowerCase())) {
                        System.out.println(productDetail.get("Name")+"\nStock:"+productDetail.get("Stock")+"\nPrice:"+productDetail.get("Price"));
                    }
                }   
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

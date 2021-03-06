package configs;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import lombok.Data;
/**
 *
 * @author Reinaldo Taslim
 */
@Data
public class Config {
    
    private InputStream IS = getClass().getResourceAsStream("/resource/Config.properties");
    private Properties Prop = new Properties();
    private String ConfigVar;
    
    public Config(){
        try {
            Prop.load(this.IS);
        } catch (IOException e){
            System.out.println("ERROR : Can't read Input Stream");
        } catch (IllegalArgumentException e){
            System.out.println("ERROR : Escape character sequence has been detected in the InputStream");
        } catch (NullPointerException e){
            System.out.println("ERROR : No such file in the directory");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void setConfigVar(String Property){
        this.ConfigVar = Prop.getProperty(Property);
    }
}

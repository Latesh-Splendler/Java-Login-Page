import java.util.HashMap;
public class IDandPassword {

    HashMap<String,String> Logininfo = new HashMap<String,String>();

    IDandPassword(){
        Logininfo.put("Admin","1163");
        Logininfo.put("Bob","Latesh");
        Logininfo.put("Joy","Grace");
    }

    protected HashMap getLogininfo(){
        return Logininfo;


    }
}

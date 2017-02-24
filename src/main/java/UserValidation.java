/**
 * Created by Mateusz on 2017-02-24.
 */
public class UserValidation {
    public static boolean isValid(String name,String password){
        boolean valid=(name.equals("Mati")&&password.equals("pass"))?true:false;
        return valid;
    }
}

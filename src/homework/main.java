package homework;
import java.lang.*;
public class main{
    public static void exerciseTwo(){
        String str = "IDKHM1603633111<<<<<<<<<<<<<<<,9501016M2406215KHM<<<<<<<<<<<6,MEN<<CHENDA<<<<<<<<<<<<<<<<<<<";
        String idCart = str.substring(str.indexOf("M"),str.indexOf("<"));
        String firstDate = str.substring(str.indexOf(",")+3,str.indexOf("016M")).concat("/".concat(str.substring(str.indexOf(",")+5,str.indexOf("6M24")))).concat("/19".concat(str.substring(str.indexOf(",")+1,str.indexOf("0101"))));
        String gender = str.substring(str.indexOf(",")+8,str.indexOf("2406"));
        String lastName = str.substring(str.indexOf("E")-1,str.indexOf("<<CH"));
        String firstName = str.substring(str.indexOf("C"),str.indexOf("A")+1);
        String expireDate = str.substring(str.indexOf(",")+13,str.indexOf("5KHM<")).concat("/".concat(str.substring(str.indexOf(",")+11,str.indexOf("215")))).concat("/20".concat(str.substring(str.indexOf(",")+9,str.indexOf("06"))));

        System.out.println(idCart);
        System.out.println(firstDate);
        System.out.println(gender);
        System.out.println(lastName);
        System.out.println(firstName);
        System.out.println(expireDate);
    }

    public static void main(String[] args) {
        exerciseTwo();
    }
}





public class separateLetDigSpl {
	
    public static void main(String[] args) {
        String input="dsafdskalfewjaieuriew&^$%^&13923478";
        
        String letters="";
        String digits="";
        String special="";
        
        for(int i= 0 ;i<input.length();i++){
            char ch= input.charAt(i);
            
            if(Character.isLetter(ch)){
                letters=letters+ch;
            }else if(Character.isDigit(ch)){
                digits=digits+ch;
            }else{
                special=special+ch;
            }
        }
        
        
        System.out.println(letters+" - "+digits+" - "+special);
    }
	
}

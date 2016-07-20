/**
 * 
 */
package encryption;


/**
 * @author HrvojeGrgic
 *
 */
public class EncryptionHandler {
	
	
	
	public static void setEncryptionKey(String key){
		
	    	AES.setKey(key);
	    
	}
	
	public static String encryptMessage(String plainTxt){
		
		
       
        AES.encrypt(plainTxt.trim());
		return AES.getEncryptedString();
	}
	
	public static String decryptMessage(String encyptedText){
		AES.decrypt(encyptedText.trim());
		String decrypted = AES.getDecryptedString();
		return decrypted;
	}
}

package message;

import java.io.Serializable;

public class MessageCommand implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4985653574496592679L;
	
	ChatMessage concreateMsg;
	String username, generalMsg, type;
	

	
	
	public MessageCommand(String username, String type, ChatMessage cocreateMsg){
		this.username = username;
		this.concreateMsg = cocreateMsg;
		this.type = type;
		
//		System.out.printf("Iz klase type: %s sa username %s i poruka %s/n",type,username,concreateMsg.getMessage());
	}
	
	public MessageCommand (String generalMsg, String type){
		this.generalMsg = generalMsg;
		this.type = type;
	}

	/**
	 * @return the timeStamp
	 */
	
	/**
	 * @return the concreateMsg
	 */
	public ChatMessage getConcreateMsg() {
		return concreateMsg;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * @return the generalMsg
	 */
	public String getGeneralMsg() {
		return generalMsg;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
	
}

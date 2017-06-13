/**
 * 
 */
package Constantpkg;

import org.openqa.selenium.By;

/**
 * @author Sinkar_S
 *
 */


public class loginlocators {
      
        /**
        * id for Enter userName
         */
	  public static final String LoginPage_Usernamefld = "userNameInput";
	  
	        /**
	         * id for Enter Password
	         */
      public static final String LoginPage_Passwordfld = "passwordInput";
      
          /**
           * id for click on submit_button
           */
      public static final String LoginPage_Loginbtn = "submitButton";
 
               
      /**
       * x_path for click on end button
       */
       public static final String ENDButton_btn ="//div[@class='popover-navigation']/button[@class='btn btn-sm btn-default']";
       
      /**
       * x_path for mouse hovering
       */public static final String Mouse_hover= "//*[@id='_menuEllipsis']";
         //public static final String Mouse_hover="//*[@id='live-chat']/h5/div/span[3]";   
         
      /**
       * x_path for add user button   
       */
      public static final String   Add_user ="//span[@title='Add User']/i";
      /**
       * x_path for enter text
       */
       public static final String  Enter_TEXT ="//input[1]";
      /**
       * x_path for add user_name text_box
       */
      public static final String  User_add ="//button[2]";
      
      /**
       * X_path for search button  
       */
      public static final String  clickOnSerchUser="//*[@id='_userSearch']";
      /**
       * x_path to click on selected user
       */
      
      public static final String click_user="//*[@id='_tickers']/div[2]/div/span[2]/span[1]";
         
      /**
       *  x_path to click on the chat text box  
       */
      public static final String click_on_textbox="chatText";
      
      //x_path for User1 message validation
      public static final String user1Message = ".//*[@id='chat-history']/div[1]/div[last()]/div[3]/div/span/p";
       
      //Xpath for transfer_chat icon validation
      public static final String TransferChat="//span[@title='Transfer Chat']/i[@class='fa fa-share']";       
     
      //X_path for leave group icon validation
      public static final String LeaveGroup="//span[@title='Leave Group']";
      
      //X_path for favourite icon validation
      public static final String  Favpurite="//span[@title='My favorites']";
      
      ///X_path for downloadchat validation
      public static final String downloadChat="//span[@title='Download chat']";
      
      //X_path for enter user name in add group
      public static final String enterUserName="html/body/init-component/div/div[1]/div/div[2]/online-component/chat-component/div/div[4]/div/div/div[1]/input";
      
    //X_path for to click on cancell button on while transfering chat
      public static final String cancelButton="//button[@data-bind='click : onTModalClose']";
}
	
    



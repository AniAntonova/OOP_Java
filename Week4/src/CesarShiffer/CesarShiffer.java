/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CesarShiffer;



/**
 *
 * @author dzhel
 */

public class CesarShiffer {
    private int cipherCode;
    private static final int ALFA_SIZE =23; 
            

    public CesarShiffer(int cipherCode) {
        setCipherCode(cipherCode);
    }
   
  

    public int getCipherCode() {
        return cipherCode;
    }

    public void setCipherCode(int cipherCode) {
       if(cipherCode !=0 && cipherCode>-ALFA_SIZE && cipherCode<ALFA_SIZE){
           this.cipherCode=cipherCode;
           
       }else this.cipherCode=3;
    }
      
    public String encrypt(String plainText){
        char[] plainTextChars =plainText.toCharArray();
        char[] cipherTextChars=new char[plainTextChars.length];
        for (int i = 0; i < plainTextChars.length; i++) {
            cipherTextChars[i] =(char) ('A'+(plainTextChars[i]-'A'+cipherCode +ALFA_SIZE)%ALFA_SIZE);
            
        }
        return new String(cipherTextChars);
    }
    
    public String decrypt (String cipherText){
        char[] cipherTextChars = cipherText.toCharArray();
        char[] plainTextChars = new char[cipherTextChars.length];
        for (int i = 0; i < cipherTextChars.length; i++) {
            plainTextChars[i] = (char) ('A' +(cipherTextChars[i]- 'A' -cipherCode+26)%26);
          
            
        }
        return new String (plainTextChars);
    }
    @Override
    public String toString(){
        return String.format("CesarChiper" + "cipherCode=%d", cipherCode);
    }
}

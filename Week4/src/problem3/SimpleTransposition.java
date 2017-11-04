/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem3;

/**
 *
 * @author dzhel
 */
public class SimpleTransposition {
    private int cipherCode;

    public SimpleTransposition(String cipherCode) {
        setCipherCode(cipherCode.length());
    }

    public int getCipherCode() {
        return cipherCode;
    }

    public void setCipherCode(int cipherCode) {
        if(cipherCode>1){
            this.cipherCode=cipherCode;
            
        }else {
            this.cipherCode=3;
        }
    }
    
    public String encrypt (String plainText){
        char[] plainTextChars = plainText.toCharArray();
        int cols= cipherCode;
        int rows = (int)Math.ceil((double) plainTextChars.length/cols);
        char[] cipherTextChars = new char[rows*cols];
        char[][]grid=new char[rows][cols];
        int currenrChar =0;
        for (int i = 0; i < grid.length; i++) {
            for(int j=0; j<grid[i].length; j++){
            if(currenrChar<plainTextChars.length){
                grid[i][j] =plainTextChars[currenrChar++];
                
            }else {
                grid[i][j]=' ';
            }
        }
        }
        currenrChar=0;
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                cipherTextChars[currenrChar++]=grid[j][i];
                
            }
            
        }
        return new String(cipherTextChars);
    }

    @Override
    public String toString() {
        return "SimpleTransposition{" + "cipherCode=" + cipherCode + '}';
    }
    
    public String decrypt (String cipherText){
        char[] cipherTextChars = cipherText.toCharArray();
        int cols= cipherCode;
        int rows = (int)Math.ceil((double) cipherTextChars.length/cols);
        char[] plainTextChars = new char[rows*cols];
        char[][]grid=new char[rows][cols];
        int currenrChar =0;
        for (int i = 0; i < cols; i++) {
            for(int j=0; j<rows; j++){
            if(currenrChar<cipherTextChars.length){
                grid[j][i] =cipherTextChars[currenrChar++];
                
            }else {
                grid[j][i]=' ';
            }
        }
        }
        currenrChar=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(currenrChar<plainTextChars.length){
                        plainTextChars[currenrChar++]=grid[i][j];
                }
            }
            
        }
        return new String(plainTextChars);
    }

  
    
}

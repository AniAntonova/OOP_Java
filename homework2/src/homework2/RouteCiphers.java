
package homework2;

import java.util.logging.Logger;


public class RouteCiphers {
    
    private int key;

    public RouteCiphers(int key) {
        this.key = key;
    }

  
    public int getKey() {
        return key;
    }

   
    public void setKey(int key) {
        this.key = key;
    }
    
    public String encrypt(String plainText){
        char[] textChar=plainText. toCharArray();
        int x=textChar.length;
        if(x% key==0)
            x/=key;
        else x= x/key +1;
        char[][] arr=new char [x][key];
        for(int i=0;i<x;i++){
            for (int j = 0; j < key; j++) {
                int k=0;
                if(k<textChar.length){
                    arr[i][j]=textChar[k];
                    k++;
                }
                else arr[i][j]='x';
                
            }
        }
        char[] change=
        
    }
    
    public String decrypt (String cipherText){
        
    }

    @Override
    public String toString() {
        return "RouteCiphers{" + "key=" + key + '}';
    }
   
    
    
}

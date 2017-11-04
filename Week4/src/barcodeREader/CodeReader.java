/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barcodeREader;

/**
 *
 * @author dzhel
 */
public class CodeReader {
    private static String[] barcode=
    {"||::",
            ":::||"
    };
    public String writeBarcode(String postCode){
char[] postCodeChars=postCode.toCharArray();
String result="";
        for (int i = 0; i < postCodeChars.length; i++) {
            //check postCodeChars
            result+=barcode[Integer.parseInt(""+postCodeChars[i])];
            
        }
        return result;
}
}

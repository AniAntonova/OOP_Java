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
public class Test {
    public static void main(String[] args) {
        SimpleTransposition single = new SimpleTransposition("beauty");
        System.out.println(single.encrypt("thisistheplaintext"));
        System.out.println(single.decrypt("ttihhnietspeilxsat"));
                
    }
}

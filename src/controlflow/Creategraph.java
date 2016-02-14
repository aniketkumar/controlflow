/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlflow;

import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author Aniket
 */
public class Creategraph {
    
    StringTokenizer st ;
    int len;
    String tmptok;
    String[] starter = {"if", "else", "while", "for"};
    
    public void begin() throws IOException {
        Mreader ob = new Mreader("flow.txt");
        
        String[] lines = ob.OpenFile();
        len = lines.length;
        
        for (int i = 0; i < len; i++) {
            st = new StringTokenizer(lines[i]);
            
            while(st.hasMoreTokens()) {
                tmptok = st.nextToken();
                
                
            }
        }
        
        
        
        
        
        
    }
    
}

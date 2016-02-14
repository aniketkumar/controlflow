/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlflow;

import java.io.*;
import java.util.StringTokenizer;


public class Mreader {
    private String path;
    
    public Mreader(String file_path) {
        path = file_path;
    }
    
    public String[] OpenFile() throws IOException {
        FileReader fr = new FileReader(path);
        
        BufferedReader br = new BufferedReader(fr);
        
        int nol = readLines();
        
        String[] td = new String[nol];
        
        for (int i = 0;  i < nol; i++) {
            td[i] = br.readLine();
            
        }
       
        br.close();
        return td;   
    }
    
    int readLines() throws IOException {
       FileReader fr = new FileReader(path);
       int nol;
        try (BufferedReader br = new BufferedReader(fr)) {
            String aline;
            nol = 0;
            while (( aline = br.readLine()) != null) {
                nol++;
            }
        }       
       return nol;
    }
    
}

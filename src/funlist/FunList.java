/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funlist;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Khouiled
 */
public class FunList {

    /**
     * @param args the command line arguments
     */
    static flFrame f;
    static Font fn;
    static Color bg;
    static Color fg;
    static boolean sys32;
    static boolean adddll;
    static boolean clean;
    static String sys;
    
    
    static final Font Dfn=new Font("Monospaced", 0, 12);
    static final Color Dbg=Color.BLACK;
    static final Color Dfg=Color.white;
    static final boolean Dsys32=true;
    static final boolean Dadddll=false;
    static final boolean Dclean=false;
    static final String Dsys="C:\\Windows\\System32";
    
    
    public static void main(String[] args) throws IOException {
    
     /*   String sall ="MS Gothic\n" +
"MS Mincho\n" +
"Consolas\n" +
"Courier New\n" +
"DFKai-SB\n" +
"DialogInput\n" +
"DotumChe\n" +
"FangSong\n" +
"GulimChe\n" +
"GungsuhChe\n" +
"KaiTi\n" +
"Letter Gothic Std\n" +
"Monospaced\n" +
"MS Mincho\n" +
"NSimSun\n" +
"OCR A Extended\n" +
"OCR A Std\n" +
"Orator Std\n" +
"Prestige Elite Std\n" +
"SimHei\n";
        String sp="";
        String s="{";
        for(int i=0;i<sall.length();i++){
            if(sall.charAt(i)=='\n'){
                s+="\""+sp+"\",";
                sp="";
            }else{
            sp+=sall.charAt(i);                    
        }
            
        }
        System.out.println(s+"}");*/
     File fl=new File("C:\\ProgramData\\settings.fun");
     if(!fl.exists()){
        createit(Dfn,Dbg,Dfg,sys32,Dadddll,Dclean,Dsys);
         }
     loadit();
    try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(flFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(flFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(flFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(flFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       f=new flFrame();
       f.setup(fn, bg, fg, sys32, adddll, clean, sys);
       f.setLocationRelativeTo(null);
    f.setVisible(true);
            
    }

    public static void createit(Font f,Color bg,Color fg,boolean s32,boolean dll,boolean cln,String sys) throws IOException {
    File fl=new File("C:\\ProgramData\\settings.fun");
    fl.mkdirs();
        try (FileWriter fw = new FileWriter(fl)) {
            fw.write(f.getName()+"?"+f.getSize()+"?"+f.getStyle()+"?"+bg.getRGB()+"?"+fg.getRGB()+"?"+s32+"?"+dll+"?"+cln+"?"+sys+"?");
        }
    }

    public static void loadit() throws IOException {
        File fl=new File("C:\\ProgramData\\settings.fun");
        try {
            FileReader fr=new FileReader(fl);
            String read="";
            for(;;){
                if(fr.ready()){
                    read+=(char)fr.read();
                }else{
                    break;
                }
            }
            
            String tm="";
            String fnm="";
            int fsz=0;
            int fst=0;
            
            int level=0;
            for(int i=0;i<read.length();i++){
                if(read.charAt(i)=='?'){
                    if(level==0){
                   level++;
                   fnm=tm;
                   tm="";
                   continue;
                    }
                    if(level==1){
                   level++;
                   fsz=Integer.valueOf(tm);
                   tm="";
                   continue;
                    }if(level==2){
                   level++;
                   fst=Integer.valueOf(tm);
                   tm="";
                   continue;
                    }
                    if(level==3){
                   level++;
                   fn=new Font(fnm, fst, fsz);
                   bg=new Color(Integer.valueOf(tm));
                   tm="";
                   continue;
                    }
                    if(level==4){
                   level++;
                   fg=new Color(Integer.valueOf(tm));
                   tm="";
                   continue;
                    }
                    if(level==5){
                   level++;
                   sys32=Boolean.valueOf(tm);
                   tm="";
                   continue;
                    }
                    if(level==6){
                   level++;
                   adddll=Boolean.valueOf(tm);
                   tm="";
                   continue;
                    }
                    if(level==7){
                   level++;
                   clean=Boolean.valueOf(tm);
                   tm="";
                   continue;
                    }
                    if(level==8){
                   level++;
                   sys=tm;
                   tm="";
                   continue;
                    }
                    
                    
                }
                
                tm+=read.charAt(i);
            }
        } catch (FileNotFoundException ex) {
            createit(Dfn,Dbg,Dfg,sys32,Dadddll,Dclean,Dsys);
          if(infinite==54){
            loadit();      
          }
        }
    }
    public static int infinite=54;
}

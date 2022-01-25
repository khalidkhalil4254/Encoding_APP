package encoding_project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class Encoding {

	
	
	public static String encode_ar(String en_word,char en[],char ar[]) {
		String res="";
		for(int x=0;x<en_word.length();x++) {
			for(int i=0;i<en.length;i++) {
				if(en_word.charAt(x)==en[i]) {
					
					res+=ar[i]; 
					
				}
			}
		}
		return res;
	}
	
	
	
	public static String encode_en(String ar_word,char en[],char ar[]) {
		String res="";
		for(int x=0;x<ar_word.length();x++) {
			for(int i=0;i<en.length;i++) {
				if(ar_word.charAt(x)==ar[i]) {
					
					res+=en[i];
					
				}
			}
		}
		return res;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char en[]= {'`','q','w','e','r','t','y','u','i','o','p','[',']','a','s','d','f','g','h','j','k','l',';','\'','z','x','c','v','b','n','m',',','.','/',' '};
		char ar[]= {'ذ','ض','ص','ث','ق','ف','غ','ع','ه','خ','ح','ج','د','ش','س','ي','ب','ل','ا','ت','ن','م','ك','ط','ئ','ء','ؤ','ر','u','ى','ة','و','ز','ظ',' '};
		
		
		
		JFrame frame=new JFrame("Encoding_system");
		frame.setSize(500,500);
		
		
		
		JLabel arabic_word=new JLabel("ARABIC :");
		arabic_word.setBounds(50,120,50,20);
		frame.add(arabic_word);
		
		JLabel english_word=new JLabel("ENGLISH :");
		english_word.setBounds(50,220,70,20);
		frame.add(english_word);
		
		JLabel res_word=new JLabel("ENCODED WORD :");
		
		
		JButton toArabic_btn=new JButton("To-Arabic");
		toArabic_btn.setBounds(50,380,100,30);
		frame.add(toArabic_btn);
		
		
		JButton toEnglish_btn=new JButton("To-English");
		toEnglish_btn.setBounds(350,380,100,30);
		frame.add(toEnglish_btn);
		
		
		
		JTextField arabic_txt=new JTextField();
		arabic_txt.setBounds(180,120,200,35);
		frame.add(arabic_txt);
		
		
		JTextField english_txt=new JTextField();
		english_txt.setBounds(180,220,200,35);
		frame.add(english_txt);
		
		
		JTextField res_txt=new JTextField("");
		res_txt.setBounds(200,300,120,50);
		frame.add(res_txt);
		
		JLabel result=new JLabel("Encoded Result :");
		result.setBounds(50,300,120,50);
		frame.add(result);
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		
		
		
		
		
		toArabic_btn.addActionListener(new ActionListener(){  
			 public void actionPerformed(ActionEvent e){ 	 
				 String word= english_txt.getText();
				 String res=encode_ar(word,en,ar);
				 res_txt.setText(res);
				 System.out.println("ar-btn");
			         }  
			     });
		
		
	
		toEnglish_btn.addActionListener(new ActionListener(){  
			 public void actionPerformed(ActionEvent e){  
				 String word= arabic_txt.getText();
				 String res=encode_en(word,en,ar).toString();
				 res_txt.setText(res);
				 System.out.println("en-btn");
			         }  
			     });
		
		
		
	}

}

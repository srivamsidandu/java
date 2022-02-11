package com.SriVamsi;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;
import  java.util.*;
public class evenoddinarraylist{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        ArrayList<Integer> l = new ArrayList();
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            l.add(sc.nextInt());
        }
        Iterator<Integer> itr = l.iterator();
        while(itr.hasNext()){
            int k =  itr.next();
            if(k%2==0){
                System.out.println(k);
            }
            else{
                itr.remove();
            }
        }
    }
}

/** 
 * Bradley Phan
 * Sep 25 2024
 * Problem set 2B
 */


public class stringTools{
    

  
public String lastLetter(String sll){
return sll.substring(sll.length()-1);
}

public String formatNumber(String stfm){
return "("+stfm.substring(0,3)+")"+""+stfm.substring(3,6)+"-"+stfm.substring(6);
}

public String middleThree(String mt){
return mt.substring(mt.length()/2 -1,mt.length()/2+2);
}

public String lastTwo(String lt){
return lt.substring(0,lt.length()-2)+lt.substring(lt.length()-1)+lt.substring(lt.length()-2,lt.length()-1);
}

public boolean fontAgain(String fa, int n){
return fa.substring(0,n).equals(fa.substring(fa.length()-n));
}



    
}

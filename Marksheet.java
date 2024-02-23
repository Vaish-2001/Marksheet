class Marksheet
 {
  public static void main(String[]args)
  {
 
   int P=87;
   int M=98;
   int B=86;
   int total=P+M+B;

   System.out.println("___________________________________________________________________");
   System.out.println("                        RURAL INSTITUR                             ");
   System.out.println("___________________________________________________________________");
   System.out.println(" Name: ku. vaishnavi thakare                  Date: 21-02-2024     ");
   System.out.println(" Roll NO: 32         Class:11th 'A'          Exam: Semister exam   ");
   System.out.println("________________________________________________________");
   System.out.println("SUBJECT            |    FULL MARKS          |      OBTAINED MARKS  ");
   System.out.println("-------------------|------------------------|----------------------");
   System.out.println("Physics            |       100              |       "+ P );
   System.out.println("Mathematics        |       100              |       "+ M );
   System.out.println("biology            |       100              |       "+ B );  
   System.out.println("___________________|________________________|_______________________");
   System.out.println("TOTAL MARKS:       |       300              |       "+total);
   System.out.println("___________________|________________________|_______________________");
  
   float perc=(total*100)/300;
   System.out.println("      PERCENTAGE=  "+perc+"%");
  
   String grade=(perc>=95&&perc<100)?"     A grade       REMARK- Outstanding"
                :(perc>=75&&perc<95)?"     B grade       REMARK- Good"
                :(perc>=600&&perc<75)?"    C Good        REMARK- needs improvement"
                :"                         F FAIL        REMARK- Very bad ";    
   System.out.println(grade);

   System.out.println("SIGN :________________");
  }
}
    
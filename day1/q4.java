import java.util.*;
public class q4{
    public static void main (String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the cost of pen:");
     float pen = sc.nextFloat();
     System.out.print("Enter the cost of pencil:");
     float pencil = sc.nextFloat();
     System.out.print("Enter the cost of shopner:");
     float shopner = sc.nextFloat();
     float cost = (pen+pencil+shopner);
     float bill = (float)(cost + cost*0.18);
     System.out.printf("Actual bill is :%f\nAddding gst your bill:%f",cost,bill);}}
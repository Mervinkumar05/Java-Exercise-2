import java.util.*;
public class Holiday{
private String name;
private int day;
private String month;

public Holiday(String name, int day, String month){
this.name = name;
this.day = day;
this.month = month;
}

public void setname(String name){
this.name = name;
}
public String getname(){
return name;
}

public void setday(int day){
this.day = day;
}
public int getday(){
return day;
}

public void setmonth(String month){
this.month = month;
}
public String getmonth(){
return month;
}

public boolean inSameMonth(Holiday sec){
return this.month.equals(sec.month);
}

public static double avgDate(Holiday[] arr){
int sum=0;
for(int i=0;i<arr.length;i++){
sum+=arr[i].day;
}
return (double) sum/arr.length;
}

public static void main(String[] args){
Holiday obj1 = new Holiday("Independance day", 4, "July");
Holiday obj2 = new Holiday("Christmas" , 25, "Christmas");
Holiday arr[] = {obj1,obj2};
System.out.println(obj1.inSameMonth(obj2));
System.out.println(Holiday.avgDate(arr));
}
}
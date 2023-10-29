import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {Plant p1=new Plant("rose1","red");
       Plant p2=new Plant("rose2","blue");
       Plant p3=new Plant("rose3","green");
       Plant p4=new Plant("rose4","yellow");
       Plant p5=new Plant("rose5","pink");

        Plant[] Plants=new Plant[50];
        Plants= new Plant[]{p2, p3};
       Plant.add(Plants,p4);





    }
}
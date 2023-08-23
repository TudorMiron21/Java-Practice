package tudor.practice.exercise6;

import java.util.Scanner;

import tudor.practice.Exercise;

public class Exercise6 implements Exercise {

    @Override
    public void test() {
        Scanner s = new Scanner(System.in);
        int t = Integer.valueOf(s.nextLine());
        s.close();

        try{

            if(t>40){
                throw new TemperatureException("Esti foarte bolnav!");
            }
        }
        catch(TemperatureException te){

            System.out.println(te.getErrMessage());
        }
        catch(NumberFormatException nfe)
        {
            nfe.printStackTrace();
        }
        finally{
            System.out.println("this executes no matter what");
        }

    }
}

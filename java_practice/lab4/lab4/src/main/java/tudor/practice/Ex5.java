package tudor.practice;

import java.util.*;

import javax.sound.midi.SysexMessage;
public class Ex5 implements Ex {
    
    @Override
    public void test(){
        List<String> colors = Arrays.asList("blue","green","black","white","orange");
        System.out.println(colors.indexOf("black"));
    }
}

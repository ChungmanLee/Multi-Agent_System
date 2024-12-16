import astra.core.Module;

import java.util.*;

public class RandomBox extends Module {
    @SENSOR
    public List<String> shuffle(List<String> list) {
        Collections.shuffle(list);
        return list;
    }
    
    @SENSOR 
    public List<String> subList(List<String> list, int fromIndex, int toIndex) {
        List<String> newList = list.subList(fromIndex, toIndex);
        return newList;
    }
    
    @SENSOR
    public int getRandomNumber(int min, int max) {
        Random random = new Random();
        int boxrandom = random.nextInt((max - min) + 1) + min;
        return boxrandom;
    }
}
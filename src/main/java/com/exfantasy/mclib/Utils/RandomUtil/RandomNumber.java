package com.exfantasy.mclib.Utils.RandomUtil;

import java.util.Random;

public class RandomNumber {
    static Random random =new Random();
    public static int randomcolor(int a){

        return random.nextInt(a);
    }
}
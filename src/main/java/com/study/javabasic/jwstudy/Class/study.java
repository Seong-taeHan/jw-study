package com.study.javabasic.jwstudy.Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class study {
    private static int pp = 0;
    public static void main(String[] args) {
        System.out.println("Class-study");
        System.out.println("돈을 넣어주세요.");
        while (true) {
            boolean pizzaBoolean = true;
            boolean cakeBoolean = true;
            boolean cokeBoolean = true;

            List<String> menuList = new ArrayList<>();
            menuList.add("pizza");
            menuList.add("coke");
            menuList.add("cake");

            Scanner money = new Scanner(System.in);
            int guest = money.nextInt();
            pp = guest + pp;
            System.out.println("현재금액 : " + pp + "$");
            System.out.println(pp + "$");
            System.out.println("menu\n pizza, coke, cake");
            Scanner in = new Scanner(System.in);
            String i = in.nextLine();
            for (int j = 0; menuList.size() > j; j++) {

                if (i.equals("pizza")&& menuList.get(j).equals("pizza")) {
                    if (pp < 500) {
                        System.out.println("금액부족 pizza");
                        System.out.println(500 - guest + "$ 더내세요");
                    }
                    if (pp >= 500) {
                        System.out.println("thank pizza");
                        System.out.println("남는금액\n" + (pp - 500) + "$");
                        pp = pp - 500;
                    }
                }
                if (i.equals("cake") && menuList.get(j).equals("cake")) {
                    if (pp < 400) {
                        System.out.println("금액부족 cake");
                        System.out.println(400 - pp + "$ 더내세요");
                    }
                    if (pp >= 400) {
                        System.out.println("thank cake");
                        System.out.println("남는금액\n" + (pp - 400) + "$");
                        pp = pp - 400;

                    }
                }
                if (i.equals("coke") && menuList.get(j).equals("cake")) {
                    if (pp < 300) {
                        System.out.println("금액부족 coke");
                        System.out.println(300 - pp + "$ 더내세요");
                    }
                    if (pp >= 300) {
                        System.out.println("thank coke");
                        System.out.println("남는금액\n" + (pp - 300) + "$");
                        pp = pp - 300;
                    }
                }
            }
            if(pp >= 0){
                System.out.println("잔액"+ pp +"$");
                System.out.println("더 이용하실려면 ok 를 입력해주세요. 아니면 no 를 입력해주세요.\n");
                Scanner text = new Scanner(System.in);
                String text2 = text.nextLine();
                if(!text2.equals("ok")){
                    System.out.println("잔액" + pp + "$ 돌려드렸습니다.");
                    break;
                }
                System.out.println("현재금액 : " + pp + "$");
                System.out.println("menu\n pizza, coke, cake");
                System.out.println("돈을 더넣으실려면 입력해주세요. 아니면 0을 입력해주세요.");
            }
        }
    }
}

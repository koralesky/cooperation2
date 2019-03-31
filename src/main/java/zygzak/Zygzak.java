package zygzak;

import java.util.ArrayList;

public class Zygzak {
    private final String zyg = "ZYG";
    private final String zak = "ZAK";
    private final String zygzak = "ZYG ZAK";


    public ArrayList<String> start(int number) {
        ArrayList<String> list = new ArrayList<>();


        if(number <= 0){
            list.add("Invalid input");
            System.out.println(list.get(0));
            return list;
        }
        else{
            for (int i = 1; i <= number; i++) {
                list.add(String.valueOf(i));
            }

        }

        for (int i = 0; i < list.size(); i++) {

           if(Integer.parseInt(list.get(i)) % 3 == 0 && Integer.parseInt(list.get(i)) % 5 == 0){
               list.set(i, zygzak);
           }
           else if(Integer.parseInt(list.get(i)) % 3 == 0){
               list.set(i, zyg);
           }
           else if(Integer.parseInt(list.get(i)) % 5 == 0){
               list.set(i, zak);
           }
            System.out.println(list.get(i));
        }





        return list;
    }
}

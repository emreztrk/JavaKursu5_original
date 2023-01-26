package _HomeWorks_;

public class _09_Methods_12Aralik {
    public static void main(String[] args) {

        // 1- Ismi **randomNum** olan bir method oluşturun. Parametre olarak **int max** almalı.
        //Bu method, 0 ile max arasında random bir değer döndürmelidir. Random numarayı döndürünüz.

        System.out.println(randomNum(50));

        }
        public static int randomNum(int max){
            int rnd= (int) (Math.random()*max);
            return rnd;

        }






    }


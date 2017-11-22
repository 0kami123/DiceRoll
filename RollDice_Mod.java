import java.util.Random;
public class RollDice_Mod {
    static Random randomNumbers = new Random();

    static final int SIDES_ON_DICE = 6;

    static final int REPETITIONS = 36000000;


    public static void main(String[] args) {

        int[] frequency = countRollFrequencies(REPETITIONS);

        displayFrequencies(frequency);

    }



    static int[] countRollFrequencies(int repetitions) {

        int maxRoll = SIDES_ON_DICE + SIDES_ON_DICE;

        int[] result = new int[maxRoll + 1];

        for(int i = 0; i < repetitions; i++){

                    ++result[rollTwoDice()];

        }

        return result;

    }


    static int rollTwoDice() {

        return rollDice() + rollDice();

    }



    static int rollDice(){

        return 1 + randomNumbers.nextInt(SIDES_ON_DICE);

    }



    static void displayFrequencies(int[] frequency) {

        int minRoll = 2;

        for(int i = minRoll; i < frequency.length; i++){

            System.out.printf("%4d%10d\n", i, frequency[i]);

        }

    }



}
/* 2   1000759
   3   1999641
   4   2997726
   5   3999764
   6   4999269
   7   6002128
   8   5000843
   9   4000272
  10   3000794
  11   1999276
  12    999528
  */

import java.util.*;

public class Main {
    static int[][] battle = new int[10][10];
    static Random rand = new Random();
    public static void main(String[] args) {

        randNums();
        string_list();

        // displaying the 2d array
        for (int[] ints : battle) {
            System.out.println(Arrays.toString(ints));
        }
    }//
    public static void randNums(){
        // align decides if the numbers will be placed horizontally or vertically.
        int align = rand.nextInt(2);
        int rand_int1 = rand.nextInt(5);
        int rand_int2 = rand.nextInt(5);

        battle[rand_int1][rand_int2] = 5;
        if (align == 1){
            battle[rand_int1][rand_int2 + 1] = 5;
            battle[rand_int1][rand_int2 + 2] = 5;
            battle[rand_int1][rand_int2 + 3] = 5;
            battle[rand_int1][rand_int2 + 4] = 5;
        }else {
            battle[rand_int1 + 1][rand_int2] = 5;
            battle[rand_int1 + 2][rand_int2] = 5;
            battle[rand_int1 + 3][rand_int2] = 5;
            battle[rand_int1 + 4][rand_int2] = 5;
        }

        int rand_four = rand.nextInt(2);

        if (rand_four == 1){
            // I am using a while loop instead of a for loop so that it doesn't stop till it places the numbers without generating same numbers
            while (true) {
                int rand_int3 = rand.nextInt(6);
                int rand_int4 = rand.nextInt(6);
                if (battle[rand_int3][rand_int4] == 0 && battle[rand_int3][rand_int4 + 1] == 0 && battle[rand_int3][rand_int4 + 2] == 0 && battle[rand_int3][rand_int4 + 3] == 0) {
                    battle[rand_int3][rand_int4] = 4;
                    battle[rand_int3][rand_int4 + 1] = 4;
                    battle[rand_int3][rand_int4 + 2] = 4;
                    battle[rand_int3][rand_int4 + 3] = 4;
                    break;
                }
            }

        }else {
            while (true) {
                int rand_int3 = rand.nextInt(6);
                int rand_int4 = rand.nextInt(6);
                // This is checking for empty index values so that it can place the numbers
                if (battle[rand_int3][rand_int4] == 0 && battle[rand_int3 + 1][rand_int4] == 0 && battle[rand_int3 + 2][rand_int4] == 0 && battle[rand_int3 + 3][rand_int4] == 0) {
                    battle[rand_int3][rand_int4] = 4;
                    battle[rand_int3 + 1][rand_int4] = 4;
                    battle[rand_int3 + 2][rand_int4] = 4;
                    battle[rand_int3 + 3][rand_int4] = 4;
                    break;
                }
            }
        }

        // 3

        int rand_three = rand.nextInt(2);


        if (rand_three == 1){
            while (true) {
                int rand_int5 = rand.nextInt(7);
                int rand_int6 = rand.nextInt(7);

                if (battle[rand_int5][rand_int6] == 0 && battle[rand_int5][rand_int6 + 1] == 0 && battle[rand_int5][rand_int6 + 2] == 0) {
                    battle[rand_int5][rand_int6] = 3;
                    battle[rand_int5][rand_int6 + 1] = 3;
                    battle[rand_int5][rand_int6 + 2] = 3;
                    break;
                }
            }
        }else {
            while (true) {
                int rand_int5 = rand.nextInt(7);
                int rand_int6 = rand.nextInt(7);

                if (battle[rand_int5][rand_int6] == 0 && battle[rand_int5 + 1][rand_int6] == 0 && battle[rand_int5 + 2][rand_int6] == 0){
                    battle[rand_int5][rand_int6] = 3;
                    battle[rand_int5 + 1][rand_int6] = 3;
                    battle[rand_int5 + 2][rand_int6] = 3;
                    break;
                }
            }
        }

        // 2

        int rand_two = rand.nextInt(2);


        if (rand_two == 1){
            while (true) {

                int rand_int7 = rand.nextInt(7);
                int rand_int8 = rand.nextInt(7);

                if (battle[rand_int7][rand_int8] == 0 && battle[rand_int7][rand_int8 + 1] == 0 && battle[rand_int7][rand_int8 + 2] == 0) {
                    battle[rand_int7][rand_int8] = 2;
                    battle[rand_int7][rand_int8 + 1] = 2;
                    battle[rand_int7][rand_int8 + 2] = 2;
                    break;
                }
            }
        }else {
            while (true) {

                int rand_int7 = rand.nextInt(7);
                int rand_int8 = rand.nextInt(7);

                if (battle[rand_int7][rand_int8] == 0 && battle[rand_int7 + 1][rand_int8] == 0 && battle[rand_int7 + 2][rand_int8] == 0) {
                    battle[rand_int7][rand_int8] = 2;
                    battle[rand_int7 + 1][rand_int8] = 2;
                    battle[rand_int7 + 2][rand_int8] = 2;
                    break;
                }
            }
        }

        // 1

        int rand_one = rand.nextInt(2);



        if (rand_one == 1){
            while (true) {

                int rand_int7 = rand.nextInt(8);
                int rand_int8 = rand.nextInt(8);

                if (battle[rand_int7][rand_int8] == 0 && battle[rand_int7][rand_int8 + 1] == 0) {
                    battle[rand_int7][rand_int8] = 1;
                    battle[rand_int7][rand_int8 + 1] = 1;
                    break;
                }
            }
        }else {
            while (true) {

                int rand_int7 = rand.nextInt(8);
                int rand_int8 = rand.nextInt(8);

                if (battle[rand_int7][rand_int8] == 0 && battle[rand_int7 + 1][rand_int8] == 0) {
                    battle[rand_int7][rand_int8] = 1;
                    battle[rand_int7 + 1][rand_int8] = 1;
                    break;
                }
            }
        }

    }


    public static void string_list(){
        // user Display
        String[][] battle2 = {
                //1 //2 //3 //4 //5 //6 //7 //8 //9 //10
                {" "," "," "," "," "," "," "," "," "," "},//1
                {" "," "," "," "," "," "," "," "," "," "},//2
                {" "," "," "," "," "," "," "," "," "," "},//3
                {" "," "," "," "," "," "," "," "," "," "},//4
                {" "," "," "," "," "," "," "," "," "," "},//5
                {" "," "," "," "," "," "," "," "," "," "},//6
                {" "," "," "," "," "," "," "," "," "," "},//7
                {" "," "," "," "," "," "," "," "," "," "},//8
                {" "," "," "," "," "," "," "," "," "," "},//9
                {" "," "," "," "," "," "," "," "," "," "}//10
        };

        // for checking

        for (int i = 0; i < battle.length; i++) {
            System.out.println(Arrays.toString(battle[i]));
        }

        for (int i = 0; i < battle2.length; i++) {
            System.out.println("-----------------------------");
            System.out.println(Arrays.toString(battle2[i]));
        }
        System.out.println("-----------------------------");

        // taking in user input

        System.out.println("Welcome To BattleShip! ");

        Scanner scan = new Scanner(System.in);
        System.out.println("To play Enter 'y' and to stop enter 'n': ");
        String x = scan.nextLine();
        int total = 17;
        int att = 0;


        if (x.equals("y")){
            boolean logic = true;
            while (logic){
                int a = 0;
                int b = 0;
                while (true){
                    try {
                        System.out.println("Enter the y position: ");
                        a = Integer.parseInt(scan.nextLine()) - 1;
                        break;

                    }catch (Exception e){
                        System.out.println("Please Enter a Integer value from 1 to 10: ");
                    }
                }

                while (true){
                    try{
                        System.out.println("Enter the x position: ");
                        b = Integer.parseInt(scan.nextLine()) - 1;
                        break;
                    }catch (Exception e){
                        System.out.println("Please Enter a Integer value from 1 to 10: ");
                    }
                }






                try {
                    if (battle[a][b] == 0){
                        battle2[a][b] = "M";
                        att++;
                    } else if (battle[a][b] != 0) {
                        battle2[a][b] = "H";
                        att++;
                        total--;
                    }
                    if (total == 0){
                        // printing the board
                        for (int i = 0; i < battle2.length; i++) {
                            System.out.println("-----------------------------");
                            System.out.println(Arrays.toString(battle2[i]));
                        }
                        System.out.println("-----------------------------");

                        System.out.println("Great Job! You Win.");
                        System.out.println("Attempts " + att);
                        break;
                    }
                }catch (Exception e){
                    System.out.println("Please Enter a Integer Value from 1 to 10: ");
                }


                for (int i = 0; i < battle2.length; i++) {
                    System.out.println("-----------------------------");
                    System.out.println(Arrays.toString(battle2[i]));
                }
                System.out.println("-----------------------------");
            }
        }else {
            System.out.println("Thank You For Playing!");
            System.out.println("the Total Attempts " + att);
        }

        System.out.println("Do you want to play again 'y' or 'n': ");
        String choice = scan.nextLine();

        if (choice.equals("y")){
            randNums();
            string_list();
        }

    }
} //
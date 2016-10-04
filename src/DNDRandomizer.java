/**
 * Created by anthonylagrotta on 9/2/16.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class DNDRandomizer {
    private static Scanner scan;

    public static void main (String[]args){


        Scanner input = new Scanner(System.in);
        int hold;
        int holdTwo;
        int randhold;
        String holder="e";
        String terrainHolder="";
        int challengeHolder=0;
        boolean levelOne=false;
        boolean levelTwo=false;
        boolean levelThree=false;
        int holdThree=0;
        boolean shouldBreak=false;


        ExcelCounter monsterCounter = new ExcelCounter();

        //Spell list being parsed


        SpellList list = new SpellList();
        Spell[] listOSpells = new Spell[405];

        File read = new File ("spells.csv");
        try {
            scan = new Scanner(read);
            int counter=0;

            String[] split;
            Spell b ;
            while (scan.hasNextLine()){

                split = scan.nextLine().split(",");

                b = new Spell(split[0], split[1],Integer.parseInt(split[2]));
                listOSpells[counter]=b;
                counter++;
                list.posInc();
            }



        }
        catch  (FileNotFoundException e) {
            e.printStackTrace();
        }




        //Forest list being parsed
        MonsterList forestCon = new MonsterList();
        Monster [] forest = new Monster[monsterCounter.howMany("FOREST")];

        File read2 = new File ("CoolMonsters.csv");
        try {
            scan = new Scanner(read2);
            int counter=0;

            String[] split;
            Monster b ;
            while (scan.hasNextLine()){

                split = scan.nextLine().split(",");

                b = new Monster(split[0], split[1],Integer.parseInt(split[2]));
                if(split[1].equals("FOREST")||split[1].equals("ANYWHERE")) {
                    forest[counter] = b;
                    counter++;
                    forestCon.posInc();
                }
            }



        }
        catch  (FileNotFoundException e) {
            e.printStackTrace();
        }



        //Volcano list being parsed
        MonsterList volcanoCon = new MonsterList();
        Monster [] volcano = new Monster[monsterCounter.howMany("VOLCANO")];

        File read3 = new File ("CoolMonsters.csv");
        try {
            scan = new Scanner(read3);
            int counter=0;

            String[] split;
            Monster b ;
            while (scan.hasNextLine()){

                split = scan.nextLine().split(",");

                b = new Monster(split[0], split[1],Integer.parseInt(split[2]));
                if(b.getTerrain().equals("VOLCANO")||b.getTerrain().equals("ANYWHERE")) {
                    volcano[counter] = b;
                    counter++;
                    volcanoCon.posInc();
                }
            }


        }
        catch  (FileNotFoundException e) {
            e.printStackTrace();
        }




        //Jungle list being parsed
        MonsterList jungleCon = new MonsterList();
        Monster [] jungle = new Monster[monsterCounter.howMany("JUNGLE")];

        File read4 = new File ("CoolMonsters.csv");
        try {
            scan = new Scanner(read4);
            int counter=0;

            String[] split;
            Monster b ;
            while (scan.hasNextLine()){

                split = scan.nextLine().split(",");

                b = new Monster(split[0], split[1],Integer.parseInt(split[2]));
                if(b.getTerrain().equals("JUNGLE")||b.getTerrain().equals("ANYWHERE")) {
                    jungle[counter] = b;
                    counter++;
                    jungleCon.posInc();
                }
            }


        }
        catch  (FileNotFoundException e) {
            e.printStackTrace();
        }


        //City list being parsed
        MonsterList cityCon = new MonsterList();
        Monster [] city = new Monster[monsterCounter.howMany("CITY")];

        File read5 = new File ("CoolMonsters.csv");
        try {
            scan = new Scanner(read5);
            int counter=0;

            String[] split;
            Monster b ;
            while (scan.hasNextLine()){

                split = scan.nextLine().split(",");

                b = new Monster(split[0], split[1],Integer.parseInt(split[2]));
                if(b.getTerrain().equals("CITY")||b.getTerrain().equals("ANYWHERE")) {
                    city[counter] = b;
                    counter++;
                    cityCon.posInc();
                }
            }


        }
        catch  (FileNotFoundException e) {
            e.printStackTrace();
        }



        //Mountain list being parsed
        MonsterList mountainCon = new MonsterList();
        Monster [] mountain = new Monster[monsterCounter.howMany("MOUNTAIN")];

        File read6 = new File ("CoolMonsters.csv");
        try {
            scan = new Scanner(read6);
            int counter=0;

            String[] split;
            Monster b ;
            while (scan.hasNextLine()){

                split = scan.nextLine().split(",");

                b = new Monster(split[0], split[1],Integer.parseInt(split[2]));
                if(b.getTerrain().equals("MOUNTAIN")||b.getTerrain().equals("ANYWHERE")) {
                    mountain[counter] = b;
                    counter++;
                    mountainCon.posInc();
                }
            }


        }
        catch  (FileNotFoundException e) {
            e.printStackTrace();
        }



        //Cave list being parsed
        MonsterList caveCon = new MonsterList();
        Monster [] cave = new Monster[monsterCounter.howMany("CAVE")];

        File read7 = new File ("CoolMonsters.csv");
        try {
            scan = new Scanner(read7);
            int counter=0;

            String[] split;
            Monster b ;
            while (scan.hasNextLine()){

                split = scan.nextLine().split(",");

                b = new Monster(split[0], split[1],Integer.parseInt(split[2]));
                if(b.getTerrain().equals("CAVE")||b.getTerrain().equals("ANYWHERE")) {
                    cave[counter] = b;
                    counter++;
                    caveCon.posInc();
                }
            }


        }
        catch  (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Swamp list being parsed
        MonsterList swampCon = new MonsterList();
        Monster [] swamp = new Monster[monsterCounter.howMany("SWAMP")];

        File read8 = new File ("CoolMonsters.csv");
        try {
            scan = new Scanner(read8);
            int counter=0;

            String[] split;
            Monster b ;
            while (scan.hasNextLine()){

                split = scan.nextLine().split(",");

                b = new Monster(split[0], split[1],Integer.parseInt(split[2]));
                if(b.getTerrain().equals("SWAMP")||b.getTerrain().equals("ANYWHERE")) {
                    swamp[counter] = b;
                    counter++;
                    swampCon.posInc();
                }
            }


        }
        catch  (FileNotFoundException e) {
            e.printStackTrace();
        }


        //Sea list being parsed
        MonsterList seaCon = new MonsterList();
        Monster [] sea = new Monster[monsterCounter.howMany("SEA")];

        File read9 = new File ("CoolMonsters.csv");
        try {
            scan = new Scanner(read9);
            int counter=0;

            String[] split;
            Monster b ;
            while (scan.hasNextLine()){

                split = scan.nextLine().split(",");

                b = new Monster(split[0], split[1],Integer.parseInt(split[2]));
                if(b.getTerrain().equals("SEA")||b.getTerrain().equals("ANYWHERE")) {
                    sea[counter] = b;
                    counter++;
                    seaCon.posInc();
                }
            }


        }
        catch  (FileNotFoundException e) {
            e.printStackTrace();
        }



        //Dungeon list being parsed
        MonsterList dungeonCon = new MonsterList();
        Monster [] dungeon = new Monster[monsterCounter.howMany("DUNGEON")];

        File read10 = new File ("CoolMonsters.csv");
        try {
            scan = new Scanner(read10);
            int counter=0;

            String[] split;
            Monster b ;
            while (scan.hasNextLine()){

                split = scan.nextLine().split(",");

                b = new Monster(split[0], split[1],Integer.parseInt(split[2]));
                if(b.getTerrain().equals("DUNGEON")||b.getTerrain().equals("ANYWHERE")) {
                    dungeon[counter] = b;
                    counter++;
                    dungeonCon.posInc();
                }
            }


        }
        catch  (FileNotFoundException e) {
            e.printStackTrace();
        }



        //Desert list being parsed
        MonsterList desertCon = new MonsterList();
        Monster [] desert = new Monster[monsterCounter.howMany("DESERT")];

        File read11 = new File ("CoolMonsters.csv");
        try {
            scan = new Scanner(read11);
            int counter=0;

            String[] split;
            Monster b ;
            while (scan.hasNextLine()){

                split = scan.nextLine().split(",");

                b = new Monster(split[0], split[1],Integer.parseInt(split[2]));
                if(b.getTerrain().equals("DESERT")||b.getTerrain().equals("ANYWHERE")) {
                    desert[counter] = b;
                    counter++;
                    desertCon.posInc();
                }
            }


        }
        catch  (FileNotFoundException e) {
            e.printStackTrace();
        }


        //Hill list being parsed
        MonsterList hillCon = new MonsterList();
        Monster [] hill = new Monster[monsterCounter.howMany("HILL")];

        File read12 = new File ("CoolMonsters.csv");
        try {
            scan = new Scanner(read12);
            int counter=0;

            String[] split;
            Monster b ;
            while (scan.hasNextLine()){

                split = scan.nextLine().split(",");

                b = new Monster(split[0], split[1],Integer.parseInt(split[2]));
                if(b.getTerrain().equals("HILL")||b.getTerrain().equals("ANYWHERE")) {
                    hill[counter] = b;
                    counter++;
                    hillCon.posInc();
                }
            }


        }
        catch  (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Tundra list being parsed
        MonsterList tundraCon = new MonsterList();
        Monster [] tundra = new Monster[monsterCounter.howMany("TUNDRA")];

        File read13 = new File ("CoolMonsters.csv");
        try {
            scan = new Scanner(read13);
            int counter=0;

            String[] split;
            Monster b ;
            while (scan.hasNextLine()){

                split = scan.nextLine().split(",");

                b = new Monster(split[0], split[1],Integer.parseInt(split[2]));
                if(b.getTerrain().equals("TUNDRA")||b.getTerrain().equals("ANYWHERE")) {
                    tundra[counter] = b;
                    counter++;
                    tundraCon.posInc();
                }
            }


        }
        catch  (FileNotFoundException e) {
            e.printStackTrace();
        }



        //Grassland list being parsed
        MonsterList grasslandCon = new MonsterList();
        Monster [] grassland = new Monster[monsterCounter.howMany("GRASSLAND")];

        File read14 = new File ("CoolMonsters.csv");
        try {
            scan = new Scanner(read14);
            int counter=0;

            String[] split;
            Monster b ;
            while (scan.hasNextLine()){

                split = scan.nextLine().split(",");

                b = new Monster(split[0], split[1],Integer.parseInt(split[2]));
                if(b.getTerrain().equals("GRASSLAND")||b.getTerrain().equals("ANYWHERE")) {
                    grassland[counter] = b;
                    counter++;
                    grasslandCon.posInc();
                }
            }


        }
        catch  (FileNotFoundException e) {
            e.printStackTrace();
        }



        while(levelOne==false) {
            System.out.println("\nPress 1 for random spell, press 2 for random monster, press 3 to quit");
            if (input.hasNextInt() == true) {
                holdTwo = input.nextInt();
            } else {
                holder = input.next();
                holdTwo = 99;
            }

            if (holdTwo == 1) {

                boolean finish = false;
                while (finish == false) {
                    System.out.println("Press 0-9 for level of random spell and 10 to quit: ");
                    if (input.hasNextInt() == true)
                        hold = input.nextInt();
                    else {
                        holder = input.next();
                        hold = 99;
                    }

                    if (hold == 0) {
                        randhold = list.randomPick(0, listOSpells);
                        System.out.println("\n\n\n" + listOSpells[randhold].getSpellName() + "        cast time: " + listOSpells[randhold].getCastTime() +
                                "          level " + listOSpells[randhold].getSpellLevel() + "\n\n\n");
                    } else if (hold == 1) {
                        randhold = list.randomPick(1, listOSpells);
                        System.out.println("\n\n\n" + listOSpells[randhold].getSpellName() + "        cast time: " + listOSpells[randhold].getCastTime() +
                                "          level " + listOSpells[randhold].getSpellLevel() + "\n\n\n");
                    } else if (hold == 2) {
                        randhold = list.randomPick(2, listOSpells);
                        System.out.println("\n\n\n" + listOSpells[randhold].getSpellName() + "        cast time: " + listOSpells[randhold].getCastTime() +
                                "          level " + listOSpells[randhold].getSpellLevel() + "\n\n\n");
                    } else if (hold == 3) {
                        randhold = list.randomPick(3, listOSpells);
                        System.out.println("\n\n\n" + listOSpells[randhold].getSpellName() + "        cast time: " + listOSpells[randhold].getCastTime() +
                                "          level " + listOSpells[randhold].getSpellLevel() + "\n\n\n");
                    } else if (hold == 4) {
                        randhold = list.randomPick(4, listOSpells);
                        System.out.println("\n\n\n" + listOSpells[randhold].getSpellName() + "        cast time: " + listOSpells[randhold].getCastTime() +
                                "          level " + listOSpells[randhold].getSpellLevel() + "\n\n\n");
                    } else if (hold == 5) {
                        randhold = list.randomPick(5, listOSpells);
                        System.out.println("\n\n\n" + listOSpells[randhold].getSpellName() + "        cast time: " + listOSpells[randhold].getCastTime() +
                                "          level " + listOSpells[randhold].getSpellLevel() + "\n\n\n");
                    } else if (hold == 6) {
                        randhold = list.randomPick(6, listOSpells);
                        System.out.println("\n\n\n" + listOSpells[randhold].getSpellName() + "        cast time: " + listOSpells[randhold].getCastTime() +
                                "          level " + listOSpells[randhold].getSpellLevel() + "\n\n\n");
                    } else if (hold == 7) {
                        randhold = list.randomPick(7, listOSpells);
                        System.out.println("\n\n\n" + listOSpells[randhold].getSpellName() + "        cast time: " + listOSpells[randhold].getCastTime() +
                                "          level " + listOSpells[randhold].getSpellLevel() + "\n\n\n");
                    } else if (hold == 8) {
                        randhold = list.randomPick(8, listOSpells);
                        System.out.println("\n\n\n" + listOSpells[randhold].getSpellName() + "        cast time: " + listOSpells[randhold].getCastTime() +
                                "          level " + listOSpells[randhold].getSpellLevel() + "\n\n\n");
                    } else if (hold == 9) {
                        randhold = list.randomPick(9, listOSpells);
                        System.out.println("\n\n\n" + listOSpells[randhold].getSpellName() + "        cast time: " + listOSpells[randhold].getCastTime() +
                                "          level " + listOSpells[randhold].getSpellLevel() + "\n\n\n");
                    } else if (hold == 10) {
                        finish = true;
                    } else {
                        System.out.println("Try Again");
                    }
                }
            }

            else if(holdTwo==2){
                levelThree=true;
                while(levelTwo==false) {
                    while (levelThree == false) {
                        System.out.println("\n press 1 to select a monster, 2 to quit");
                        if (input.hasNextInt() == true) {
                            holdThree = input.nextInt();
                        } else {
                            holder = input.next();
                            holdThree = 5;
                        }
                        if (holdThree == 1) {
                            levelThree = true;
                        } else if (holdThree == 2) {
                            shouldBreak = true;
                            levelThree = true;
                            levelTwo=true;

                        }
                    }
                    levelThree=false;
                    if (shouldBreak == false) {
                        levelThree = false;
                        System.out.println("What challenge level?");
                        boolean isint = false;
                        while (isint == false) {
                            if (input.hasNextInt() == true) {
                                challengeHolder = input.nextInt();
                                isint = true;
                            } else {
                                holder = input.next();
                                System.out.println("Try again");
                            }
                        }

                        System.out.println("Which terrain are you in? \n " +
                                "Cave, City, Desert, Forest, Hill, Jungle, Mountain, Sea, Swamp, Tundra, Volcano, Grassland");
                        terrainHolder = input.next();

                        if (terrainHolder.equals("cave")) {
                            randhold = caveCon.randomPick(challengeHolder, "CAVE", cave);
                            System.out.println("\n\n\n" + cave[randhold].getEnemyName() + "     terrain:  " + cave[randhold].getTerrain() +
                                    "     challenge " + cave[randhold].getChallenge() + "\n\n\n");
                        } else if (terrainHolder.equals("city")) {
                            randhold = cityCon.randomPick(challengeHolder, "CITY", city);
                            System.out.println("\n\n\n" + city[randhold].getEnemyName() + "     terrain:  " + city[randhold].getTerrain() +
                                    "     challenge " + city[randhold].getChallenge() + "\n\n\n");
                        } else if (terrainHolder.equals("desert")) {
                            randhold = desertCon.randomPick(challengeHolder, "DESERT", desert);
                            System.out.println("\n\n\n" + desert[randhold].getEnemyName() + "     terrain:  " + desert[randhold].getTerrain() +
                                    "     challenge " + desert[randhold].getChallenge() + "\n\n\n");
                        } else if (terrainHolder.equals("forest")) {
                            randhold = forestCon.randomPick(challengeHolder, "FOREST", forest);
                            System.out.println("\n\n\n" + forest[randhold].getEnemyName() + "     terrain:  " + forest[randhold].getTerrain() +
                                    "     challenge " + forest[randhold].getChallenge() + "\n\n\n");
                        } else if (terrainHolder.equals("hill")) {
                            randhold = hillCon.randomPick(challengeHolder, "HILL", hill);
                            System.out.println("\n\n\n" + hill[randhold].getEnemyName() + "     terrain:  " + hill[randhold].getTerrain() +
                                    "     challenge " + hill[randhold].getChallenge() + "\n\n\n");
                        } else if (terrainHolder.equals("jungle")) {
                            randhold = jungleCon.randomPick(challengeHolder, "JUNGLE", jungle);
                            System.out.println("\n\n\n" + jungle[randhold].getEnemyName() + "     terrain:  " + jungle[randhold].getTerrain() +
                                    "     challenge " + jungle[randhold].getChallenge() + "\n\n\n");
                        } else if (terrainHolder.equals("mountain")) {
                            randhold = mountainCon.randomPick(challengeHolder, "MOUNTAIN", mountain);
                            System.out.println("\n\n\n" + mountain[randhold].getEnemyName() + "     terrain:  " + mountain[randhold].getTerrain() +
                                    "     challenge " + mountain[randhold].getChallenge() + "\n\n\n");
                        } else if (terrainHolder.equals("sea")) {
                            randhold = seaCon.randomPick(challengeHolder, "SEA", sea);
                            System.out.println("\n\n\n" + sea[randhold].getEnemyName() + "     terrain:  " + sea[randhold].getTerrain() +
                                    "     challenge " + sea[randhold].getChallenge() + "\n\n\n");
                        } else if (terrainHolder.equals("swamp")) {
                            randhold = swampCon.randomPick(challengeHolder, "SWAMP", swamp);
                            System.out.println("\n\n\n" + swamp[randhold].getEnemyName() + "     terrain:  " + swamp[randhold].getTerrain() +
                                    "     challenge " + swamp[randhold].getChallenge() + "\n\n\n");
                        } else if (terrainHolder.equals("tundra")) {
                            randhold = tundraCon.randomPick(challengeHolder, "TUNDRA", tundra);
                            System.out.println("\n\n\n" + tundra[randhold].getEnemyName() + "     terrain:  " + tundra[randhold].getTerrain() +
                                    "     challenge " + tundra[randhold].getChallenge() + "\n\n\n");
                        } else if (terrainHolder.equals("volcano")) {
                            randhold = volcanoCon.randomPick(challengeHolder, "VOLCANO", volcano);
                            System.out.println("\n\n\n" + volcano[randhold].getEnemyName() + "     terrain:  " + volcano[randhold].getTerrain() +
                                    "     challenge " + volcano[randhold].getChallenge() + "\n\n\n");
                        }else if (terrainHolder.equals("grassland")) {
                            randhold = grasslandCon.randomPick(challengeHolder, "GRASSLAND", grassland);
                            System.out.println("\n\n\n" + grassland[randhold].getEnemyName() + "     terrain:  " + grassland[randhold].getTerrain() +
                                    "     challenge " + grassland[randhold].getChallenge() + "\n\n\n");
                        }
                        else {
                            System.out.print("No such terrain found");
                        }
                    }
                }
                shouldBreak=false;
                levelTwo=false;
            }
            else if(holdTwo==3){
                levelOne=true;
            }
            else{
                System.out.println("try again");
            }
        }
        levelOne=false;
    }


}

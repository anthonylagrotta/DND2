import java.util.Random;


public class MonsterList {
    private Monster monsterList[];
    private int pos=0;
    Random ran = new Random();

    public void addMonster(String aenemy, String aterrain, int achallenge, Monster monsterList[]){

        Monster monster = new Monster(aenemy,aterrain,achallenge);
        monsterList[pos] = monster;
        pos++;


    }
    public void posInc(){
        pos++;
    }

    public void display(Monster monsterList[]){
        for(int i=0; i<pos;i++) {
            System.out.println(monsterList[i].getEnemyName()+"      Terrain "+monsterList[i].getTerrain()+",     challenge level"+monsterList[i].getChallenge());
        }
    }

    public int getMax(Monster [] list){
        int max=list[0].getChallenge();
        for(int i=0;i<list.length;i++){
            if(list[i]!=null) {
                if (list[i].getChallenge() > max) {
                    max = list[i].getChallenge();
                }
            }
        }
        return max;
    }

    public int getMin(Monster [] list){
        int min=list[0].getChallenge();
        for(int i=0;i<list.length;i++){
            if(list[i]!=null) {
                if (list[i].getChallenge() < min) {
                    min = list[i].getChallenge();
                }
            }
        }
        return min;
    }

    public int randomPick(int level, String aterrain, Monster[] list){
        boolean done= false;
        int rnd=0;
        int min=list[0].getChallenge();
        for(int i=0;i<list.length;i++){
            if(list[i]!=null) {
                if (list[i].getChallenge() < min) {
                    min = list[i].getChallenge();
                }
            }
        }
        if(level<min){
            level=min;
        }

        int max=list[0].getChallenge();
        for(int i=0;i<list.length;i++){
            if(list[i]!=null) {
                if (list[i].getChallenge() > max) {
                    max = list[i].getChallenge();
                }
            }
        }

        if(level>max){
            level=max+2;
        }

        boolean statStack=false;
        int stack=3;
        while(done==false) {
            rnd = new Random().nextInt(list.length-1);
            if(list[rnd]!=null) {
                if(list[rnd].getTerrain().equals("ANYWHERE")){
                    stack--;
                }
                if(stack==0){
                    statStack=true;
                }
                if (list[rnd].getChallenge() <= level &&list[rnd].getChallenge()>=level-2&&
                        (list[rnd].getTerrain().equals(aterrain)||statStack==true)) {
                    done = true;
                }
            }
        }
        return rnd;
    }


}

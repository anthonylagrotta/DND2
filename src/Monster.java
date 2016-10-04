/**
 * Created by anthonylagrotta on 9/3/16.
 */
public class Monster {
    private String enemyName;
    private String terrain;
    private int challenge;

    public Monster(){
        enemyName="";
        terrain="";
        challenge=0;
    }

    public Monster(String aenemy, String aterrain, int achallenge){
        enemyName=aenemy;
        terrain=aterrain;
        challenge=achallenge;

    }

    public String getEnemyName(){
        return enemyName;
    }

    public String getTerrain(){
        return terrain;
    }

    public int getChallenge(){
        return challenge;
    }
}

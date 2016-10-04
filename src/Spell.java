/**
 * Created by anthonylagrotta on 9/2/16.
 */
public class Spell {


    private String spellName;
    private int spellLevel;
    private String castTime;

    public Spell(){
        spellName="";
        castTime="";
        spellLevel=0;
    }

    public Spell(String aSpell, String aTime, int aLevel){
            spellName=aSpell;
            castTime=aTime;
            spellLevel=aLevel;
    }

    public String getSpellName(){
            return spellName;
        }


    public int getSpellLevel(){
            return spellLevel;
        }


    public void setSpellLevel(int aLevel) {
        spellLevel=aLevel;
    }

    public void setSpellName(String aSpell){
        spellName=aSpell;
    }

    public String getCastTime(){return castTime;}


}



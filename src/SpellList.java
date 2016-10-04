/**
 * Created by anthonylagrotta on 9/2/16.
 */
import java.util.Random;
public class SpellList {


    private Spell spellList[];
    private int pos=0;
    Random ran = new Random();

    public void addSpell(String spellName, String castTime, int level, Spell spellList[]){

        Spell spell = new Spell(spellName,castTime,level);
        spellList[pos] = spell;
        pos++;


    }
    public void posInc(){
        pos++;
    }

    public void display(Spell spellList[]){
        for(int i=0; i<pos;i++) {
            System.out.println(spellList[i].getSpellName()+"             casting time "+spellList[i].getCastTime()+",              level "+spellList[i].getSpellLevel());
        }
    }

    public int randomPick(int Level, Spell[] list){
        boolean done= false;
        int rnd=0;
        while(done==false) {
             rnd = new Random().nextInt(list.length-1);
            if (list[rnd].getSpellLevel() <= Level) {
                done=true;
            }
        }
        return rnd;
    }


}

package rpg.model.dto;

public class NPCDTO {

    private int npcCode;
    private String npcName;

    public NPCDTO() {
    }

    public NPCDTO(int npcCode, String npcName) {
        this.npcCode = npcCode;
        this.npcName = npcName;
    }

    public int getNpcCode() {
        return npcCode;
    }

    public void setNpcCode(int npcCode) {
        this.npcCode = npcCode;
    }

    public String getNpcName() {
        return npcName;
    }

    public void setNpcName(String npcName) {
        this.npcName = npcName;
    }

    @Override
    public String toString() {
        return "[NPC]" +
                " 이름 : " + npcName;
    }

}

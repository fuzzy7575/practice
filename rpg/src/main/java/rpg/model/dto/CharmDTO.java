package rpg.model.dto;

public class CharmDTO {

    private int charm;
    private int userCode;
    private int npcCode;

    public CharmDTO() {
    }

    public CharmDTO(int charm, int userCode, int npcCode) {
        this.charm = charm;
        this.userCode = userCode;
        this.npcCode = npcCode;
    }

    public int getCharm() {
        return charm;
    }

    public void setCharm(int charm) {
        this.charm = charm;
    }

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    public int getNpcCode() {
        return npcCode;
    }

    public void setNpcCode(int npcCode) {
        this.npcCode = npcCode;
    }

    @Override
    public String toString() {
        return "[호감도]" +
                "호감도 : " + charm;
    }
}

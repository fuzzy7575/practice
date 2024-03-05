package rpg.model.dto;

public class UserDTO {

    private int userCode;
    private String userName;
    private int userCharm;
    private int userBag;
    private int equippedItem;
    private int userMoney;

    public UserDTO() {
    }

    public UserDTO(int userCode, String userName, int userCharm, int userBag, int equippedItem, int userMoney) {
        this.userCode = userCode;
        this.userName = userName;
        this.userCharm = userCharm;
        this.userBag = userBag;
        this.equippedItem = equippedItem;
        this.userMoney = userMoney;
    }

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserCharm() {
        return userCharm;
    }

    public void setUserCharm(int userCharm) {
        this.userCharm = userCharm;
    }

    public int getUserBag() {
        return userBag;
    }

    public void setUserBag(int userBag) {
        this.userBag = userBag;
    }

    public int getEquippedItem() {
        return equippedItem;
    }

    public void setEquippedItem(int equippedItem) {
        this.equippedItem = equippedItem;
    }

    public int getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(int userMoney) {
        this.userMoney = userMoney;
    }

    @Override
    public String toString() {
        return "■ ■ 내 상태 ■ ■ " + "\n"
                + "[이름] : " + userName + "\n"
                + "[나의 매력도] : " + userCharm + "\n"
                + "[소지품] : " + userBag + "\n"
                + "[착용한 옷] : " + equippedItem + "\n"
                + "[소지한 돈] : " + userMoney + "원";
    }
//    @Override
//    public String toString() {
//        return "■ ■ 내 상태 ■ ■ " + "\n"
//                + "[이름] : " + name + "\n"
//                + "[나의 매력도] : " + charm + "\n"
//                + "[소지품] : " + inventoryStore.toString() + "\n"
//                + "[착용한 옷] : " + (equippedItem == null ? "없음" : equippedItem) + "\n"
//                + "[소지한 돈] : " + money + "원";
//    }
}

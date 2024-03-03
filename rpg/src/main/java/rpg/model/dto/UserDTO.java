package rpg.model.dto;

public class UserDTO {

    private int userCode;
    private String userName;
    private int userCharm;
    private BagDTO userBag;
    private ItemDTO equippedItem;
    private int userMoney;

    public UserDTO() {
    }

    public UserDTO(int userCode, String userName, int userCharm, BagDTO userBag, ItemDTO equippedItem, int userMoney) {
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

    public BagDTO getUserBag() {
        return userBag;
    }

    public void setUserBag(BagDTO userBag) {
        this.userBag = userBag;
    }

    public ItemDTO getEquippedItem() {
        return equippedItem;
    }

    public void setEquippedItem(ItemDTO equippedItem) {
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
        return "UserDTO{" +
                "userCode=" + userCode +
                ", userName='" + userName + '\'' +
                ", userCharm=" + userCharm +
                ", userBag=" + userBag +
                ", equippedItem=" + equippedItem +
                ", userMoney=" + userMoney +
                '}';
    }
}

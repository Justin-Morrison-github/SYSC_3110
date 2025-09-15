import java.util.ArrayList;

public class AddressBook
{
    private ArrayList<BuddyInfo> buddyInfoList;

    public AddressBook(){
        this.buddyInfoList = new ArrayList<BuddyInfo>();
    }

    public static void main(String[] args) {
        System.out.println("AddressBook");
    }

    public void addBuddy(BuddyInfo buddyInfo){
        buddyInfoList.add(buddyInfo);
    }
    public void removeBuddy(BuddyInfo buddyInfo){
        buddyInfoList.remove(buddyInfo);
    }
}

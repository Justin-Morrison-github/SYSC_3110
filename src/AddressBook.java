import java.util.ArrayList;

/*
    Comment to test git pull
*/
public class AddressBook
{
    private ArrayList<BuddyInfo> buddyInfoList;

    public AddressBook(){
        this.buddyInfoList = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddyInfo){
        buddyInfoList.add(buddyInfo);
    }
    public void removeBuddy(BuddyInfo buddyInfo){
        buddyInfoList.remove(buddyInfo);
    }

    public static void main(String[] args) {
        System.out.println("AddressBook");
        BuddyInfo buddy = new BuddyInfo("Bob", "Carleton", "1234");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}

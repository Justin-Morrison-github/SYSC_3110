public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public BuddyInfo() {
        this("Buddy", "123 Main St", "123-456-7890");
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("Homer", "23 Bronson", "8675309");

        System.out.println("Hello " + buddyInfo.getName());    }
}

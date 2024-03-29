abstract class Hotel {
    // this is the top class of all the classes in which basic details and common things in all type of rooms is given and also any type of rooms can have any number of size
    String name;
    long adharId;
    long mobileNumber;
    String address;
    int numberOfbeds;
    static int roomNumber = 0; // by default, room number is 1
    String uniqueCode;
    String email;
    boolean availibiliyOfAc;
    boolean availibiliyOfWifi;
    boolean availibilityOfView;
    boolean availibiltyOfSwimmingPool;
    int price;
    int totalCost;
    String roomType;

    Hotel(String n, long a, long mobile, String add, int num) {
        name = n;
        adharId = a;
        mobileNumber = mobile;
        address = add;
        numberOfbeds = num;
    }

    abstract void setUniqueCode(String code);

    abstract String getServices();

    abstract String getDetails();

    abstract void setRoomNumber();

    abstract void setRoomNumber(int number);

    static void leaveRoom(){
        roomNumber-=1;
    }
}
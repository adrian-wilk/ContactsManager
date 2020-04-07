class ContactsManager{

    // Fields:
    Contact [] myFriends;
    int friendsCount;

    // Constructor:
    ContactsManager(){
        friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    // Methods:
    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName){
        for(int i=0; i < friendsCount; i++){
            if(myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}

class Main {
    public static void main(String[] args){
        ContactsManager myContactsManager = new ContactsManager();

        Contact Contact1 = new Contact();
            Contact1.name = "Tom";
            Contact1.phoneNumber = "500600700";

        myContactsManager.addContact(Contact1);
        Contact result = myContactsManager.searchContact("Tom");
        System.out.println(result.phoneNumber);
    }
}

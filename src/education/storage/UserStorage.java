package education.storage;

import education.model.User;

public class UserStorage {

    User[] users = new User[10];
    int size;

    public void add(User user){
        if(users.length == size){
            extend();
        }
        users[size++] = user;
    }

    private void extend() {

        User [] result = new User[users.length + 10];
        System.arraycopy(users,0,result,0,users.length +10);
        users = result;
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(users[i]);
        }
    }

    public User getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if(users[i].getEmail().equals(email)) {
                return users[i];
            }
        }
        return null;
    }
}

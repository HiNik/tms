package by.tms.service;

import by.tms.entity.CurUser;
import by.tms.entity.User;
import by.tms.repository.AL.Users;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    private final Users Ulist;

    public UserService(Users ulist) {
        Ulist = ulist;
    }
    public void regUser(User user){
        Ulist.addUser(user);
    }

    public boolean sigIn(CurUser cUser){return Ulist.checkUser(cUser);}

    public boolean findAdmin(CurUser curUser){return Ulist.checkAdmin(curUser);}

    public User getUser(CurUser curUser){return Ulist.getUser(curUser);}

    public int findUser(CurUser curUser){return Ulist.findUser(curUser);}

    public ArrayList<User> getAll(){return Ulist.getAllUsers();}
}

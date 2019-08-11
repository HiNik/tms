package by.tms.repository.AL;

import by.tms.entity.CurUser;
import by.tms.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Users {
    private List<User> userList=new ArrayList<>();

    public void addUser(User user){
        userList.add(user);
    }

    public User getUser(CurUser curUser){
        for(User user:userList){
        if(curUser.getMail().equals(user.getMail()) && curUser.getPassword().equals(user.getPassword())){
            return user;
        }
    }return null;
    }



    /*public int findUser(CurUser curUser){
        for(User user:userList){
            if(curUser.getMail().equals(user.getMail()) && curUser.getPassword().equals(user.getPassword())){
                return user.getId();
            }
        }
        return Integer.parseInt(null);
    }*/

    public List<User> getAllUsers(){return userList;}

     public boolean checkAdmin(CurUser curUser) {
        String mail="zhurin-00@mail.ru";
        String password="b23fWVRE4ax";
             if (mail.equals(curUser.getMail()) && password.equals(curUser.getPassword())) {
                 return true;
             }
         return false;
     }
    public boolean checkUser(CurUser cUser){
        for(User user:userList){
            if(cUser.getMail().equals(user.getMail()) && cUser.getPassword().equals(user.getPassword())){
                return true;
            }
        }return false;
    }



}

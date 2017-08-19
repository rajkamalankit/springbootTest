package com.crud.test.services;
import com.crud.test.config.Encryption;
import com.crud.test.dao.RecentVisitorRepository;
import com.crud.test.dao.UsersRepository;
import com.crud.test.domain.fostergem.RecentVisitorsDomain;
import com.crud.test.domain.fostergem.UsersDomain;
import com.crud.test.services.interfaces.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("IUsersService")
public class UsersService implements IUsersService{
    private final UsersRepository usersRepository;
    private final RecentVisitorRepository recentVisitorRepository;
    private final Encryption encryption;
    @Autowired
    public UsersService(UsersRepository usersRepository, RecentVisitorRepository recentVisitorRepository, Encryption encryption){
        this.usersRepository = usersRepository;
        this.recentVisitorRepository = recentVisitorRepository;
        this.encryption = encryption;
    }

    @Override
    public UsersDomain signup (UsersDomain usersDomain)
    {
        try {
            if (usersDomain.getEmail() == null) {
                throw new Exception("Email is mandatory");
            }
            if (usersDomain.getPassword() == null) {
                throw new Exception("password can't be empty");
            }
            if (usersDomain.getFname() == null) {
                throw new Exception("First name is mandatory");
            }
            UsersDomain user = usersRepository.findByEmail(usersDomain.getEmail());
            if(user != null){
                throw new Exception("User already exists with this email");
            }
            String password = encryption.md5(usersDomain.getPassword());
            usersDomain.setPassword(password);
            return usersRepository.save(usersDomain);
        } catch (Exception e){
            System.out.print(e.getMessage());
        }
        return null;
    }

    @Override
    public RecentVisitorsDomain getRecentVisitors(RecentVisitorsDomain recentVisiorsDomain) {
        return null;
    }

    @Override
    public RecentVisitorsDomain saveRecentVisitors(RecentVisitorsDomain recentVisitorsDomain) {
        return recentVisitorRepository.save(recentVisitorsDomain);
    }
    //4262/6243/4475

    @Override
    public UsersDomain login(UsersDomain usersDomain) throws Exception {
            if(usersDomain.getEmail()==null)
            {
                throw new Exception("Please Enter valid Email Address");
            }
            if(usersDomain.getPassword()==null)
            {
                throw new Exception("Enter correct password");
            }
            String password = encryption.md5(usersDomain.getPassword());
            UsersDomain user = usersRepository.findByEmailAndPassword(usersDomain.getEmail(),password);
            if(user==null)
            {
                throw new Exception("Either user name or password is invalid.");
            }
            return user;
    }
}


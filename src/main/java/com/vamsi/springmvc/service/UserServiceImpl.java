/**
 * 
 */
package com.vamsi.springmvc.service;

import java.util.List;

import org.omg.PortableInterceptor.USER_EXCEPTION;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.com.springmvc.model.User;

/**
 * @author vamsi
 *
 */

 
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService, USER_EXCEPTION {
	private static final AtomicLong counter = new AtomicLong();
    
    private static List<User> users;
     
    static{
        users= populateDummyUsers();
    }
 
    
	/* (non-Javadoc)
	 * @see com.vamsi.springmvc.service.UserService#findById(long)
	 */
	@Override
	public User findById(long id) {
		for(User user : users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
	}

	/* (non-Javadoc)
	 * @see com.vamsi.springmvc.service.UserService#findByName(java.lang.String)
	 */
	@Override
	public User findByName(String name) {
		for(User user : users){
            if(user.getUsername().equalsIgnoreCase(name)){
                return user;
            }
        }
        return null;
	}

	/* (non-Javadoc)
	 * @see com.vamsi.springmvc.service.UserService#saveUser(com.com.springmvc.model.User)
	 */
	@Override
	public void saveUser(User user) {
		 user.setId(counter.incrementAndGet());
	        users.add(user);
	    }

	/* (non-Javadoc)
	 * @see com.vamsi.springmvc.service.UserService#updateUser(com.com.springmvc.model.User)
	 */
	@Override
	public void updateUser(User user) {
		  int index = users.indexOf(user);
	        users.set(index, user);
	    }

	/* (non-Javadoc)
	 * @see com.vamsi.springmvc.service.UserService#deleteUserById(long)
	 */
	@Override
	public void deleteUserById(long id) {
		for (Iterator<User> iterator = users.iterator(); iterator.hasNext(); ) {
            User user = iterator.next();
            if (user.getId() == id) {
                iterator.remove();
            }
        }
    }

	/* (non-Javadoc)
	 * @see com.vamsi.springmvc.service.UserService#findAllUsers()
	 */
	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		 return users;
	}

	/* (non-Javadoc)
	 * @see com.vamsi.springmvc.service.UserService#deleteAllUsers()
	 */
	@Override
	public void deleteAllUsers() {
		 users.clear();

	}

	/* (non-Javadoc)
	 * @see com.vamsi.springmvc.service.UserService#isUserExist(com.com.springmvc.model.User)
	 */
	@Override
	public boolean isUserExist(User user) {
		// TODO Auto-generated method stub
		 return findByName(user.getUsername())!=null;
    }
	private static List<User> populateDummyUsers(){
        List<User> users = new ArrayList<User>();
        users.add(new User(counter.incrementAndGet(),"test1@gmail.com","first1","last1","223-456-9789","Atlanta"));
        users.add(new User(counter.incrementAndGet(),"test2@gmail.com","first2","last2","454-895-6789","Alabama"));
        users.add(new User(counter.incrementAndGet(),"test3@gmail.com","first3","last3","212-345-7789","New York"));
        users.add(new User(counter.incrementAndGet(),"test4@gmail.com","first4","last4","123-456-7689","Chicago"));
        return users;
    }

}

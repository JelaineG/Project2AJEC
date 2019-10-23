package com.ex.revature.DAO;

import com.ex.revature.entities.ParkUser;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Component

public interface ParkUserDAO {

   ParkUser findByID(int obj);
   ParkUser getAllParksUserVisited(String parksVisited);
   void saveUser(ParkUser obj);
   void updateUser(ParkUser obj);
   void deleteUser(ParkUser obj);

}

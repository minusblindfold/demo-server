# demo-server

This is a sample rest service.  

There is one domain object (User)  

ex.  
{  
  "id" : 1,  
  "firstName" : "Joe",  
  "lastName" : "Pace",  
  "userName" : "jp12345"  
}  


#REST Service as follows

GET       /user         ** Returns all users **  
GET       /user/{id}    ** Returns one user by id **  
POST      /user         ** Saves or updates a user, Return all users **  
DELETE    /user/{id}    ** Deletes user by id, Returns all users **  

# ManUserRest
ManUserRest folder contains the Maven Project
To clone the repository:
```bash
$ git clone https://github.com/alceoc/ManUserRest.git
```
ManUserRest.jar is the jar executable with embedded tomcat starting at 8080 port.   
The Dockerfile creats a docker image

## Tool testing

The Rest application can testing with the tool [Advanced Rest Client](https://install.advancedrestclient.com/install).  

## Testing 
Starts Advanced Rest Client (or any client tool testing)  

#### Test 1: Add new user with POST request in the body HTTP;  
Insert JSON code with keys: "userId" "firstName" "lastName" "mail"
```json
{
 "userId":<value>,
 "firstName":"<value>",
 "lastName":"<value>",
 "mail":"name@domain"
}
```
![Start](https://github.com/alceoc/ManUserRest/blob/master/images/Image1.png)

#### Test 2: Trying to add an existing userAdd (same Id);  
Insert an user with same Id: alert appears;   

![User_exists](https://github.com/alceoc/ManUserRest/blob/master/images/Image1_1.png)

#### Test 3: add new user and validation email
When inserting an invalid address mail an error description appears   
![Test3](https://github.com/alceoc/ManUserRest/blob/master/images/Image2.png)

#### Test 4: get user list  
GET method return the list of the user in HTTP header
Same result is obtained with the browser at the url http://localhost:8080/user/  
![Test4](https://github.com/alceoc/ManUserRest/blob/master/images/Image3.png)

#### Test 5: delete a user 
DELETE method removes the user with given id: enclose the address with the user id to delete:
```bash
http://localhost:8080/user/3
```  
User with id=3 is removed  
![Test5](https://github.com/alceoc/ManUserRest/blob/master/images/Image4.png)

#### Test 6: trying to delete a user with an id no in list 
When trying to delete a user with id that has not been added an alert appear:
```bash
http://localhost:8080/user/9
```  
User with id=3 is removed  
![Test6](https://github.com/alceoc/ManUserRest/blob/master/images/Image5.png)



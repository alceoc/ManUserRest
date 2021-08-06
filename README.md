# ManUserRest
ManUserRest folder contains the Maven Project
To clone the repository:
```bash
$ git clone https://github.com/alceoc/ManUserRest.git
```
ManUserRest.jar is the jar executable with embedded tomcat starting at 8080 port.   
The Dockerfile creats a docker image

## Tool testing

The Rest application can testing with the tool HTTP request [Advanced Rest Client](https://install.advancedrestclient.com/install).  

## Testing 
Starts Advanced Rest Client (or any client tool testing)  

#### Test 1: Add new user with POST request in the body HTTP;  
Insert JSON code with keys "userId" "firstName" "lastName" "mail"
```json
{
 "userId":<value>,
 "firstName":"<value>",
 "lastName":"<value>",
 "mail":"name@domain"
}
```
![Start](https://github.com/alceoc/ManUserRest/blob/master/images/Image1.png)

#### Test 2: add new user and validation email
Insert invalid address mail, an error description appears   
![Test2](https://github.com/alceoc/ManUserRest/blob/master/images/Image2.png)

package Project2;

public class Registration {

    //Create Registration Class in which you would have variables as
    //email, userName and password that have an access scope only
    //within its own class. After creating an object of the class user should
    //be able to call methods and in each method separately pass values
    //to set users email, username and password.
    //Requirements:
    //A. Valid email consider to be only yahoo
    //B. Valid userName and password cannot be empty and should be of
    //length larger than 6 characters. Also valid password cannot contain
    //userName
    private String Email;
   private String UserName;
    private String Password;

    public Registration(String email, String userName, String password) {
       this. Email = email;
        this .UserName = userName;
        this.Password = password;
    }

    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {

        if (Email.endsWith("yahoo.com")){

            System.out.println("Valid email");
        }else{

            System.out.println("Valid email consider to be only yahoo");
        }

    }


    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {

        if (!userName.isEmpty()&& userName.length()>6){
            System.out.println("Valid UserName");

        }else{

            System.out.println("inValid UserName");
        }

    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
      if (!password.isEmpty() && !password.contains(getUserName())){
          System.out.println("Valid password");

      }else{

          System.out.println("inValid password");
      }

      }
    }

    class RegistrationTester{

        public static void main(String[] args) {
            Registration obj=new Registration("person@yahoo.com","person","person");

            obj.setEmail("person@gmail.com");
            obj.setUserName("person");
            obj.setPassword("per@12345");

        }

    }


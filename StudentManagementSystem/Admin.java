package StudentManagementSystem;
public class   Admin {
    private String username;
    private String password;
    public Admin(String password,String username) {
        this.username=username;
        this.password=password;
    }
        public void setUsername(String username){
        this.username=username;
        }
        public String getUsername(){
        return username;
        }
        public void setPassword(String password){
        this.password= password;
        }
        public String getPassword(){
        return password;
        }

    }





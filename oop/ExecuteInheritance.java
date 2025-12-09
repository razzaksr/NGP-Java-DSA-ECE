package oop;

public class ExecuteInheritance{
    public static void main(String[] args) {
        YouTube youTube = new YouTube();
        youTube.setEmail("razzaksr@gmail.com");
        youTube.setPassword("Razak@123");
        youTube.viewLiked("Razak@123");
    }
}

class YouTube extends Google{
    private String[] likedVideos;
    public YouTube(){
        // likedVideos = new String[10];
        likedVideos = new String[] {"MJ Beat It","MJ Dangerous","Iron Man 3"};
    }
    public boolean validate(String pass){
        if(pass.equals(this.getPassword())) return true;
        else return false;
    }
    public void viewLiked(String userPass){
        if(validate(userPass)){
            // System.out.println(Arrays.toString(likedVideos));
            System.out.println("My Liked videos ");
            for(String each : likedVideos )
                System.out.println(each);
        }
        else
            System.out.println("Unauthorized to view liked videos");
    }
    public String[] getLikedVideos() {
        return likedVideos;
    }
    public void setLikedVideos(String[] likedVideos) {
        this.likedVideos = likedVideos;
    }
}


// bean class
class Google{
    private String email, password;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
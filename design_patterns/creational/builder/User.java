package design_patterns.creational.builder;

public class User {

    private final String userId;
    private final String userName;
    private final String emailId;

    // private constructor
    private User(UserBuilder builder){
        // initialize
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.emailId = builder.emailId;

    }
    // Builder creates immutable objects, tha's why we only have getter in User class
    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    //toString method


    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    // inner class to create object
    static class UserBuilder{
        private String userId;
        private String userName;
        private String emailId;

        public UserBuilder() {

        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;

        }

    }

}

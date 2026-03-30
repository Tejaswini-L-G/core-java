public class UserAccount {

    private int userId;
    private String username;
    private String email;
    private String password;
    private String phone;
    private String createdDate;
    private String status;

    public void setUserId(int userId) { this.userId = userId; }
    public int getUserId() { return userId; }

    public void setUsername(String username) { this.username = username; }
    public String getUsername() { return username; }

    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return email; }

    public void setPassword(String password) { this.password = password; }
    public String getPassword() { return password; }

    public void setPhone(String phone) { this.phone = phone; }
    public String getPhone() { return phone; }

    public void setCreatedDate(String createdDate) { this.createdDate = createdDate; }
    public String getCreatedDate() { return createdDate; }

    public void setStatus(String status) { this.status = status; }
    public String getStatus() { return status; }
}
package objects;

public class User {
    
    //Atributos User.
    
    public String nomeUser;
    public String cpfUser;
    public String loginUser;
    public String senhaUser;
    
    //Get User.

    public String getNomeUser() {
        return nomeUser;
    }

    public String getCpfUser() {
        return cpfUser;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public String getSenhaUser() {
        return senhaUser;
    }
    
    //Sets User.

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public void setCpfUser(String cpfUser) {
        this.cpfUser = cpfUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public void setSenhaUser(String senhaUser) {
        this.senhaUser = senhaUser;
    }
    
}

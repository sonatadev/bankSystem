class account {
    private String userName;
    private String passWord;
    private double moneyInAccount;

    public account(String username, String password){
        this.userName = username;
        this.passWord = password;
    }

    public String getUserName(){
        return this.userName;
    }

    public String getPassWord(){
        return this.passWord;
    }

    public double getMoneyInAccount(){
        return this.moneyInAccount;
    }
    
    public void setMoney(double moneyToChange){
        this.moneyInAccount += moneyToChange;
    }
    
}

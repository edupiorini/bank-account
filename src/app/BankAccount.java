package app;

public class BankAccount {
    // Atributes
        public int numAccount;
        protected String type;   
        private String owner;    
        private Float balance;
        private boolean status;
    //End of Atributes
          
    //Methods
        public BankAccount(){ // Constructor 
            this.balance = 0f;
            this.status = false;
    
        }
    
        public void openAccount(String type){
            setType(type);
            setStatus(true);    
    
            if(type == "CA"){
                setBalance(50);
    
            }else if (type == "SO"){
                setBalance(150);
    
            } else{
                System.out.println("INVALID TYPE");
            }
        }
        public void closeAccount(){
            if (this.balance > 0){
                System.out.println("Please check balance!");
    
            }else if(this.balance < 0){
                System.out.println("Please check your bank debts!");
            }
        }
        public void deposit(float val){
            if (getStatus() == true){
                setBalance(getBalance()+ val);
            } 
            else {
                System.out.println("Unable to deposit.");
            }
        }
        public void withdraw(float value){
            if(getStatus() == true){
                if(getBalance() > value){
                    setBalance(getBalance() - value);
                }else{
                    System.out.println("Insufficient funds");
                }
    
            } else{
                System.out.println("Unnable to withdraw");
            }
        }
        public void monthlyPay(){
            float value = 0f;
            if(getType() == "CA"){
                value = 12f;
            }else if(getType() == "SO"){
                value = 20f ;
            }
            if(getStatus() == true){
                if(getBalance() > value){
                    setBalance(getBalance() - value);
                } else{
                    System.out.println("Insufficient funds");
                }
            } else{
                System.out.println("Unnable to pay");
            }
            
        }
        public void setAccountNum(int number){
            this.numAccount = number;
        }
    
        public int getNumConta(){
            return this.numAccount;
        }
    
        public void setType(String type){
            this.type = type;
        }
    
        public String getType(){
            return this.type;
        }
        
        public void setOwner(String owner){
            this.owner = owner;
        }
        
        public String getOwner(){
            return this.owner;
        }
        public void setBalance(float balance){
            this.balance = balance;
        }
        public float getBalance(){
            return this.balance;
        }
    
        public void setStatus(boolean status){
            this.status = status;
        }
        public boolean getStatus(){
            return this.status;
        }
    //END OF METHODS
    
    
    
    }
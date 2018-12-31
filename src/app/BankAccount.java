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
        public void currentStatus(){
            System.out.println("-----------------------------------");
            System.out.println("Account: "+this.getNumAccount());
            System.out.println("Owner: "+this.getOwner());
            System.out.println("Type: "+this.getType());
            System.out.println("Balance: "+this.getBalance());
            System.out.println("Status: "+this.isStatus());
        }
        public void BankAccount(){ // Constructor 
            this.setBalance(0f);
            this.setStatus(false);
    
        }

        /**
         *  @param openAccount build a new account, 
         *  setting @param setType and @param setStatus
         */
        public void openAccount(String type){
            this.setType(type);
            this.setStatus(true);
            /**
             * if a Current Account is created, 
             * balance starts with 50$, otherwise, if Savings Only is 
             * created, then it starts with 150$ 
             */
            if (type == "CA") {
                this.setBalance(50f);
            } else if(type == "SO"){
                this.setBalance(150f);
            }
        }

        /**
         * @param closeAccount checks @param getBalance to
         * ensure that there is no money or no debt within
         * before closing the account - setting the @param setStatus
         * as false
         */
        public void closeAccount(){
           if (this.getBalance() > 0 ) {
               System.out.println("Please, check balance!");
           } else if(this.getBalance() < 0){
               System.out.println("Please, check your debts!");
               
           } else {
               this.setStatus(false);
               System.out.println("Account succesfully closed!");
           }

        }
        /**
         * @param deposit checks the account status,
         * if there is an existing account, deposit will be
         * executed
         */
        public void deposit(float amount){
            if (this.isStatus() == true) {
                this.setBalance(this.getBalance() + amount);
                System.out.println(this.getOwner());
                System.out.println("Deposit OK");
            } else {
                System.out.println("Unable to deposit");
            }
        }

        public void withdraw(float amount){
            if(this.isStatus() == true){

                if(this.getBalance() >= amount ){

                this.setBalance(this.getBalance() - amount);
                System.out.println(this.getOwner());
                System.out.println("Withdraw succesful");

                } else if(this.getBalance() < amount){
                    System.out.println("Insufficient funds!");
                }
            } else {
                System.out.println("Not an active account!");
            }
        }

        public void monthlyPay(){
            int value = 0;
            if (this.getType() == "CA"){
                value = 120;
            } else {
                value = 20;
            }
            if (this.isStatus() == true) {
                if (this.getBalance() > value){
                    this.setBalance(this.getBalance() - value);
                } else {
                    System.out.println("Insufficient Funds!");
                }
            } else {
                System.out.println("Unable to pay!Not an existing account!");
                
            }
        }

        /**
         * @return the numAccount
         */
        public int getNumAccount() {
            return numAccount;
        }

        /**
         * @param numAccount the numAccount to set
         */
        public void setNumAccount(int numAccount) {
            this.numAccount = numAccount;
        }

        /**
         * @return the type
         */
        public String getType() {
            return type;
        }

        /**
         * @param type the type to set
         */
        public void setType(String type) {
            this.type = type;
        }

        /**
         * @return the owner
         */
        public String getOwner() {
            return owner;
        }

        /**
         * @param owner the owner to set
         */
        public void setOwner(String owner) {
            this.owner = owner;
        }

        /**
         * @return the balance
         */
        public Float getBalance() {
            return balance;
        }

        /**
         * @param balance the balance to set
         */
        public void setBalance(Float balance) {
            this.balance = balance;
        }

        /**
         * @return the status
         */
        public boolean isStatus() {
            return status;
        }

        /**
         * @param status the status to set
         */
        public void setStatus(boolean status) {
            this.status = status;
        }
        
        
    
    
    }
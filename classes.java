
//You can create the interface in the same file or a separate file then import it.
public interface bigDecimalService{
	// withdraw function whithin the interface.
	public void withdraw(String bigDecimalNum,BigDecimal amountToWithdraw); 
}


//You need to implement the interface into your classes so you can use the function "withdraw"
//from the interface.
public class savingsbigDecimal implements bigDecimalService{
	
	
	public String id;
	public String bigDecimalNum;
	public bigDecimal balance;
	
	//
public void amountToWithdraw(bigDecimal amount)
{balance=balance-amount;
} //withdraw function
}	

}//savings bigDecimal class

//You need to implement the interface into your classes so you can use the function "withdraw"
//from the interface.
public class currentbigDecimal extends savingsbigDecimal implements bigDecimalService{
	
	public bigDecimal overdraft;
	
	// this method "withdraw" is accessed from bigDecimalService interface because we implemented it. 
	public void withdraw(bigDecimal amount){
		if (amount <= balance + overdraft)
			balance = balance - amount
		else
		system.error.printlin("Insufficient funds for withdrawal")
	}//withdraw function 
} //current bigDecimal class
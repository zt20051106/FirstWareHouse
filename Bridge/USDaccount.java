package Bridge;

public class USDaccount extends AbstructAccount{

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		String string="这是美元账户";
		return account.getAccount()+string;
	}

}

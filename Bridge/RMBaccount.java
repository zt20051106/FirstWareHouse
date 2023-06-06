package Bridge;

public class RMBaccount extends AbstructAccount{

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		String string="这是人民币账户";
		return account.getAccount()+string;
	}

}

package Bridge;

public abstract class AbstructAccount {
	protected Account account;
	public void setAccount(Account account) {
		this.account=account;
	}
	public abstract String getname();
}

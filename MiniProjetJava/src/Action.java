
public abstract class Action 
{
	protected Utilisateur u;

	public Action(Utilisateur u){
		this.u=u;
	}
	 
	public abstract void agir();
}

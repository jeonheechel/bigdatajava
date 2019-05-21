package 인터페이스2;

public interface BbsInertface {
	public abstract void insert(BbsDTO dto);
	public abstract void delete(String id);
	public abstract void update(BbsDTO dto);
	public abstract BbsDTO select(String id);

}

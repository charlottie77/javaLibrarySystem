package pacl;

public class book {
	String _name;
	int _num;
	
	public book(int num, String name){
		_name = name;
		_num = num;
	}
	
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public int get_num() {
		return _num;
	}
	public void set_num(int _num) {
		this._num = _num;
	}

}


